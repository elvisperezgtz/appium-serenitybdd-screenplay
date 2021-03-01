package gt.com.tigo.qa.exceptions;

public class ExceptionsError extends AssertionError {

    public ExceptionsError(String message,Throwable cause){
        super(message,cause);
    }

    public static String noSeEncuentraElElemento() {
        return String.format("El elemento esperado, nunca estuvo visible'%s'");
    }

    public static String falloEnLaAsersion(Boolean esperado) {
        if (esperado){
            return String.format("Se esperaba que la asersion devolviera '%s', pero obtuvo", true);
        }
        return String.format("Se esperaba que la asersion devolviera'%s', pero obtuvo", false);
    }

    public static String noSePudoValidarLosDetallesDeLaLinea() {
        return String.format("No se pudo validar los detalles de la linea '%s'");
    }

}
