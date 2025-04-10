Feature: SentraNavegacion

#Scenario: Crea Usuario
#    Given Ingreso a web
#    When presiono boton CREAR USUARIO
#    Then ingreso datos USUARIO
#    Then presiono boton GRABAR USUARIO

Scenario: Pantalla de inicio del sitio de sentra para ingresar credenciales
    Given Ingreso a url
    When Ingreso credenciales
    When Presiono boton INGRESAR
    
Scenario: Ingreso a Home a crear Tareas del usuario
    Given Seleccionar boton Home
    Then Presiono boton NUEVA TAREA
    Then Ingreso nueva tarea de Home
    Then Presiono boton CREAR TAREA

Scenario: Validar Ingreso a Perfil para Modificar datos del usuario
    Given Presiono el boton PERFIL
    When Presiono el boton EDITAR DATOS USUARIO
    Then Modifico los datos del usuario
    Then Presiono boton GRABAR USUARIO

 Scenario: Validar Cambio de contraseña de ingreso
    Given Presiono el boton CAMBIAR CONTRASEÑA
    When Ingreso contraseña nueva
    Then Presiono el boton GUARDAR CONTRASEÑA

 Scenario: Validar boton Salir y que rediriga a inicio
    Given Presiono boton SALIR