
  Feature: Iniciar sesion en gmail
    Como usuario de gmail
    Quiero un portal donde iniciar sesión
    Para poder ver mis correos electronicos

    Scenario: Inicio de sesión
      Given El usuario esta en la pagina de inicio de sesion de gmail
      When El inicia sesion con sus credenciales
      Then El deberia poder ver su buzon de entrada

    Scenario: Inicio de sesión
      Given El usuario esta en la pagina de inicio de sesion de gmail
      When El usuario hace click en en el boton Login
      And El usuario ingresa el usuario pepito@gmail.com
      And El usurio hace click en el boton siguiente
      And El usuario ingresa la contraseña en el campo contraseña
      And El usuario hace click en siguiente
      Then El deberia poder ver su buzon de entrada