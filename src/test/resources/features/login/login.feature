#encoding: utf-8
Feature: Login
  Como usuario deseo ingresar a Tigo en Línea App para gestionar mis líneas

  {Examples}

Background:
  Given El usuario registrado abre la app

  @LoginCorreoOkLineas
  Scenario: Inicio de sesión exitoso
    When El inicia sesion en la app por medio del correo electronico
      | correo                | contrasenia |
      | tigo.indra4@yahoo.com | Tygoi2i2  |
    And El selecciona la linea Postpago: 31816048
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion

  @LoginCorreoOk
  Scenario: Inicio de sesión exitoso
    When El inicia sesion en la app por medio del correo electronico
      | correo                | contrasenia |
      | tigoindra12@hotmail.com | Tigo2222  |
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion

  @LoginHEOk
  Scenario: Inicio de sesión exitoso por Header Enrichment en Tigo en Línea App
    When El inicia sesion en la app por Header Enrichment
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion

  @LoginOTPOk
  @buzonOTP
  Scenario: Inicio de sesión exitoso con OTP en Tigo en Línea App
    When El inicia sesion en la app por medio del numero de telefono 40153543
    And El ingresa codigo OTP correcto
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion

  @recuperarContrasenia
  Scenario: Recuperar Contraseña e iniciar Sesion con la nueva contraseña
    When El solicita el cambio de contrasenia para el correo electronico tigoindra11@gmail.com
    And El asigna una nueva contrasenia
    And El inicia sesion en la app con su nueva contrasenia
    Then El deberia poder ver los detalles de la linea
    And el deberia salir de la sesion