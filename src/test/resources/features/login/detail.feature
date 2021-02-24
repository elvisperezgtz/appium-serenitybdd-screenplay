@Detalles
Feature:Como usuario deseo ver los detalles y consumos de mis líneas en Tigo en Línea App

  Background:
  Given El usuario registrado abre la app
  When El inicia sesion en la app por medio del correo electronico
    |      correo         | contrasenia|
    | tigoindra2@outlook.com|  Tigo1010  |
    #|tigoindra7@gmail.com |  Tigo7777  |
        And El selecciona la linea Postpago 31817473
          #Postpago: 31814231
    Then El deberia poder ver los detalles de la linea

  @DetalleCards @Detalle
  Scenario: Ver que se muestren los cards de Internet, Llamadas y Mensajes
    Given El usuario esta en la seccion consumos
    When El usuario hace scroll en la pantalla
    Then la app despliega las cards Internet
    And la app despliega el card Llamadas
    And la app despliega el card Mensajes

  @DetalleInternet @Detalle
  Scenario: Ver detalles de consumo de internet
    Given El usuario esta en la seccion consumos
    When el usuario selecciona opcion Detalles de Internet
    Then la app despliega Detalles de consumo de Internet


  @DetalleLlamada @Detalle
  Scenario Outline: Ver detalles de consumo de llamadas <TipoLinea>
    Given El usuario esta en la seccion consumos
    When el usuario selecciona ver <TipoLlamadas>
    Then la app despliega Detalles de Llamadas
    Examples:
      |      TipoLinea     |                 TipoLlamadas             |
     # |     Prepago        |            Detalles de Llamadas           |
    |     Pospago        |        Detalles de Llamadas a Tigo        |
    |     Pospago        |  Detalles de Llamadas a otras operadoras  |
      #|   Factura Fija     |        Detalles de Llamadas a Tigo        |
      #|   Factura Fija     |  Detalles de Llamadas a otras operadoras  |


  @DetalleMensaje @Detalle
  Scenario: Ver detalles de consumo de mensajes
    Given El usuario esta en la seccion consumos
    When el usuario selecciona los Detalles de Mensajes
    Then la app despliega Detalles de consumo de Mensajes
