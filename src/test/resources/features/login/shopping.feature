@Compra
Feature:Como usuario deseo  realizar compra de paquetes prepago de mis líneas en Tigo en Línea App

  Background:
    Given El usuario registrado abre la app
    When El inicia sesion en la app por medio del correo electronico
      | correo               | contrasenia |
      | tigoindra9@gmail.com | Tigo4444    |
    And El selecciona la linea Prepago 40097056
    Then El deberia poder ver los detalles de la linea

  @CompraPaqueteInternet
  Scenario: Compra de paquetes prepago internet
    Given El usuario esta en la seccion consumos
    When El usuario selecciona paquete
      | paquete                     | nombrepaquetigo                                      |
      | Paquetigos de 1, 2 o 3 dias | 200MB + Facebook y WhatsApp ILIMITADO (100MB con 3G) |
    And selecciona el metodos de pago
    And despliega formulario de verificacion
    Then Valido que aparezca el mensaje de compra exitosa
    And Valido que el paquetigo se encuentre acreditado

  @CompraPaqueteEncoladoInternet
  Scenario: Compra de paquetes prepago internet encolado
    Given El usuario esta en la seccion consumos
    When El usuario selecciona paquete
      | paquete                     | nombrepaquetigo                                      |
      | Paquetigos de 1, 2 o 3 dias | 200MB + Facebook y WhatsApp ILIMITADO (100MB con 3G) |
    And selecciona el metodos de pago
    And despliega formulario de verificacion
    Then Valido que aparezca el mensaje de compra exitosa
    And Valido que el paquetigo se encuentre acreditado
    And Valido que el paquetigo se encuentre encolado

  @CompraPaqueteLlamadas
  Scenario: Compra de paquetes prepago llamadas
    Given El usuario esta en la seccion consumos
    When selecciona el paquete de llamadas a comprar
      | paquete    | nombrepaquetigo                                 |
      | Ilimitados | FAVORITO - Habla ILIMITADO a un numero Tigo HOY |
    And selecciona el metodos de pago
    And despliega formulario de verificacion
    Then Valido que aparezca el mensaje de compra exitosa
    And Valido que el paquetigo de llamadas se encuentre acreditado

  @CompraPaqueteMensajes
  Scenario: Compra de paquetes prepago mensajes
    Given El usuario esta en la seccion consumos
    When selecciona el paquete de mensajes a comprar
      | paquete  | nombrepaquetigo                  |
      | Mensajes | FAN100 - 100 SMS locales y a USA |
    And selecciona el metodos de pago
    And despliega formulario de verificacion
    Then Valido que aparezca el mensaje de compra exitosa
    And Valido que el paquetigo de mensajes se encuentre acreditado