# Tigo en línea

## _Pruebas automatizadas_

![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)

Automatización de pruebas funcionales de las aplicaciones OneApp, TigoID, paimentGateway (pasarela de pagos) para Guatemala

## Tecnologías implementadas

Durante la construcción del proyecto se implementaron las siguientes tecnologías:

- [JAVA] - Lenguaje de programación principal.
- [Serenity BDD] - Framework para automatización de pruebas de software.
- [Appium] - Herramienta de automatización de pruebas para dispositivos móviles.
- [Screenplay pattern] - Patrón de diseño para automatización de pruebas de software
- [Cucumber] - Framework BDD basado en codigo Gherkin
- [Gradle] - Sistema de automatización de construcción de código de software

## Requisitos

- JAVA 8
- Appium for Windows 1.20.2 o superior
- Gradle 6.8 o superior

## Documentación relevante

| Framework | website |
| ------ | ------ |
| Serenity BDD con Screenplay Pattern | [serenityBDD][SC]|
| Cucumber | [Cucumber][CCB] |

## Ejecución de pruebas

Abre la terminal de comandos y ejecuta el siguiente código:

Ejecutar todas las pruebas:

```sh
gradle clean test aggregate -Dcontext=appium -Dwebdriver.driver=appium
```

Ejecutar escenarios especificos:

```sh
gradle clean test aggregate -Dcucumber.options="--tags @testName" -Dcontext=appium -Dwebdriver.driver=appium
```

## Escenarios de pruebas

| Tag | Descripción |
| ------ | ------ |
| @Login | Ejecuta todos los escenarios de inicio de sesión|
| @Detalles |Ejecuta todos los escenarios de "Ver detalles" |
| @Compra |Ejecuta todos los escenarios de "Compras" |

## Licencias

MIT

**Open Source!**


[SC]: <https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay.html>

[CCB]: <https://cucumber.io/>
   
