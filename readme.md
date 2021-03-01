# Tigo en línea
## _Pruebas automatizadas_

![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)

Proyecto de pruebas automatizadas para Tigo Guatemala.

## Tecnologías implementadas

Durante la construcción del proyecto se implementaron las siguientes tecnologías:

- [JAVA] - Lenguaje de programación principal.
- [Serenity BDD] - Framework para automatización de pruebas de software.
- [Appium] - Herramienta de automatización de pruebas para dispositivos móviles.
- [Screenplay pattern] - Patrón de diseño para automatización de pruebas de software
- [Cucumber] - Framework BDD basado en codigo Gherkin
- [Gradle] - Sistema de automatización de construcción de código de software

## Requisitos
- [JAVA 8]
- Gradle 6.8 o superior
## Documentación relevante

| Plugin | README |
| ------ | ------ |
| Serenity BDD con Screenplay Pattern | [serenityBDD][SC]|
| Cucumber | [Cucumber][CCB] |

## Ejecución de pruebas
Abre la terminal de comandos y ejecuta el siguiente código

Ejecutar todas las pruebas:

```sh
gradle test --test gt.com.tigo.qa.features
```

Ejecutar escenarios especificos:

```sh
gradle test --test gt.com.tigo.qa.features @testName
```

## Licencias

MIT

**Open Source!**


[SC]: <https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay.html>
[CCB]: <https://cucumber.io/>
   
