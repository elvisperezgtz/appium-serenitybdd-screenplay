package gt.com.tigo.qa.utils.correos;


import gt.com.tigo.qa.utils.enums.Buzones;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ManejadorDeCorreos {

    private  ManejadorDeCorreos(){}
    private static boolean textIsHtml= false;

    public static String extraerCodigo(String cuerpoMensaje){
        return cuerpoMensaje.split(" ")[0].replace("<b>","");
    }

    static String extraerTexto(Part p) throws MessagingException, IOException {
        if (p.isMimeType("text/*")) {
            String s = (String)p.getContent();
            textIsHtml = p.isMimeType("text/html");
            return s;
        }

        if (p.isMimeType("multipart/alternative")) {
            // prefer html text over plain text
            Multipart mp = (Multipart)p.getContent();
            String text = null;
            for (int i = 0; i < mp.getCount(); i++) {
                Part bp = mp.getBodyPart(i);
                if (bp.isMimeType("text/plain")) {
                    if (text == null)
                        text = extraerTexto(bp);
                    continue;
                } else if (bp.isMimeType("text/html")) {
                    String s = extraerTexto(bp);
                    if (s != null)
                        return s;
                } else {
                    return extraerTexto(bp);
                }
            }
            return text;
        } else if (p.isMimeType("multipart/*")) {
            Multipart mp = (Multipart)p.getContent();
            for (int i = 0; i < mp.getCount(); i++) {
                String s = extraerTexto(mp.getBodyPart(i));
                if (s != null)
                    return s;
            }
        }

        return null;

    }

    public static void limpiarBuzon(String username, String password, Buzones buzon) throws MessagingException {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File("src/test/resources/mail.properties")));

            Session emailSession = Session.getDefaultInstance(properties);
            Store emailStore = emailSession.getStore("imaps");
            emailStore.connect("imap.gmail.com", username, password);

            //obteniendo los correos
            Folder emailFolder = emailStore.getFolder(String.valueOf(buzon));
            emailFolder.open(Folder.READ_WRITE);
            Message messages[] = emailFolder.getMessages();

            for (Message message : messages) {
                message.setFlag(Flags.Flag.DELETED, true);
            }
            System.out.println("Limpieza de buzon satisfactoria");
            emailFolder.close(true);
            emailStore.close();

        } catch (NoSuchProviderException exception) {
            exception.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String obtenerCodigoDesdeUltimoCorreoElectronico(String username, String password) throws IOException, MessagingException {


        Message[] messages = getMessages(username,password);
        if(messages.length!=0){
            Address[] froms = messages[messages.length-1].getFrom();
            String email = froms == null ? null : ((InternetAddress) froms[0]).getAddress();
            if(email.equals("otp.pacamara@gmail.com")){
                MimeMultipart mimeMultipart = (MimeMultipart) messages[messages.length - 1].getContent();
                BodyPart textPart = mimeMultipart.getBodyPart(0);
                String text =extraerCodigo(extraerTexto(textPart));
                return (text);
            }

        }
       return null;
    }

    public static String obtenerCodigoOTP() {
        try {
            int reintentos=0;
            String codigo;
            do {
                System.out.println("Intento # "+ (reintentos+1));
                codigo= obtenerCodigoDesdeUltimoCorreoElectronico("otp.pacamara@gmail.com", "gt#otp.2021");
                Thread.sleep(3000);
            reintentos++;
                }while (codigo==null&&reintentos<15);
            return codigo;

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return null;
    }

    public static Message[] getMessages(String username, String password) throws IOException, MessagingException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("src/test/resources/mail.properties")));

        Session emailSession = Session.getDefaultInstance(properties);
        Store emailStore = emailSession.getStore("imaps");
        emailStore.connect("imap.gmail.com", username, password);
        Folder emailFolder = emailStore.getFolder(String.valueOf(Buzones.INBOX));
        emailFolder.open(Folder.READ_WRITE);
        return emailFolder.getMessages();

    }

    public static String obtenerElLink(String username, String password) throws IOException, MessagingException {

        try{
            int reintentos=0;
            String link=null;

            do {
                Message messages[] = getMessages(username, password);

                if (messages.length != 0) {
                    Address[] froms = messages[messages.length - 1].getFrom();
                    String email = froms == null ? null : ((InternetAddress) froms[0]).getAddress();
                    if (email.equals("tigo@id.tigo.com")) {
                        MimeMultipart mimeMultipart = (MimeMultipart) messages[messages.length - 1].getContent();
                        BodyPart textPart = mimeMultipart.getBodyPart(0);
                         link = extraerTexto(textPart).split("href=\"")[3].split("\"")[0];
                        return (link);
                    }
                }
            }while (link==null&&reintentos<5);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return null;
        }


}
