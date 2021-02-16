Feature: Login
  Como usuario deseo ingresar a OneApp móvil para gestionar mis líneas

  {Examples}

Background:
  Given El usuario registrado abre la app

  Scenario: Inicio de sesion exitoso
    When El inicia sesion en la app por medio del correo electronico
      | correo                | contrasenia |
      | tigoindra11@gmail.com | MTCCLODAAY  |
    Then El deberia poder ver los detalles de la linea

    @recuperarContrasenia
  Scenario: Recuperar Contraseña e iniciar Sesion con la nueva contraseña
    When El solicita el cambio de contrasenia para el correo electronico tigoindra11@gmail.com
    And El asigna una nueva contrasenia
    And El inicia sesion en la app con su nueva contrasenia
    Then El deberia poder ver los detalles de la linea





