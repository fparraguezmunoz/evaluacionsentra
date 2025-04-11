# Proyecto de Evaluación Sentra de Automatizacion

Este proyecto contiene pruebas automatizadas usando Gherkin, GITHUB, Java, Cucumber y Selenium. Su objetivo es automatizar la navegación y pruebas funcionales de una aplicación web entregada por Sentra.

## Estructura del Proyecto

```
src/test
├── java
│   ├── fredpit
│   │   ├── BasePage.java
│   │   ├── CrearUsuario.java
│   │   ├── PaginaClave.java
│   │   ├── PaginaHome.java
│   │   ├── PaginaPerfil.java
│   │   ├── PaginaPrincipal.java
│   │   └── Salir.java
│   ├── Runner├── Testrunner.java
│   └── steps
│       └── SentraSteps.java
├── resources
│   └── SentraNavegacion.feature
```

## Tecnologías Utilizadas

- Java  
- Cucumber  
- Selenium  
- TestNG   
- Gradle
- Gherkin
- GITHUB  

## Cómo ejecutar las pruebas

1. Clona este repositorio.
2. Abre el proyecto en tu IDE (Eclipse, IntelliJ, VSCode, etc).
3. Asegúrate de tener todas las dependencias instaladas.
4. Ejecuta los tests desde el runner o con Gradle.

## Archivos Destacados

- `SentraNavegacion.feature`: Archivo de especificación en lenguaje Gherkin.
- `SentraSteps.java`: Definición de los pasos de prueba.
- Clases como `PaginaHome`, `PaginaPerfil`, etc., representan el patrón de diseño Page Object.

## Autor

- [Freddy Parraguez]
