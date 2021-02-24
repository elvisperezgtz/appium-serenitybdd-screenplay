#encoding: utf-8
Feature: Login
  Como usuario deseo ingresar a Tigo en Línea App para gestionar mis líneas

  {Examples}

Background:
  Given El usuario registrado abre la app

  @LoginCorreoOk
  Scenario: Inicio de sesión exitoso
    When El inicia sesion en la app por medio del correo electronico
      | correo                | contrasenia |
      | tigoindra10@gmail.com | Tigo5555  |
    And El selecciona la linea Prepago 40097056
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion

  @LoginHEOk
  Scenario: Inicio de sesión exitoso por Header Enrichment en Tigo en Línea App
    When El inicia sesion en la app por Header Enrichment
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion

  #@LoginEditarOk
  #Scenario : Inicio de sesión en Tigo en Línea App - Editar correo
  #When El inicia sesion en la app por medio del correo electronico

  @LoginCorreoInvalido
    Scenario: Inicio de sesión con correo inválido en Tigo en Línea App
    When El selecciona ingresar con el correo tigoindra4@gmail.com
    Then El deberia poder ver el mensaje de correo invalido

  @LoginContraseniaInvalida
  Scenario: Inicio de sesión con contraseña inválida en Tigo en Línea App
    When El inicia sesion en la app por medio del correo electronico
      | correo                | contrasenia |
      | tigo.indra4@yahoo.com | Tygo0000  |
    Then El deberia poder ver el mensaje de contrasenia invalida

  @LoginOTPOk
  @buzonOTP
  Scenario: Inicio de sesión exitoso con OTP en Tigo en Línea App
    When El inicia sesion en la app por medio del numero de telefono 40153543
    And El ingresa codigo OTP correcto
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion

  @LoginOTPInvalido
  Scenario: Inicio de sesión con OTP invalido en Tigo en Línea App
    When El inicia sesion en la app por medio del numero de telefono 40153543
    And El ingresa codigo OTP invalido
    Then El deberia poder ver el mensaje de error por codigo invalido

  @recuperarContrasenia
  @buzonReset
  Scenario: Recuperar Contraseña e iniciar Sesion con la nueva contraseña
    When El solicita el cambio de contrasenia para el correo electronico tigoindra11@gmail.com
    And El asigna una nueva contrasenia
    And El inicia sesion en la app con su nueva contrasenia
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion