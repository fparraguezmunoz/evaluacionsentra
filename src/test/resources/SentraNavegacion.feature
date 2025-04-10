Feature: SentraNavegacion

#Scenario: Crea Usuario
#    Given Ingreso a web
#    When presiono boton CREAR USUARIO
#    Then ingreso datos USUARIO
#    Then presiono boton GRABAR USUARIO

Scenario: abre sitio de sentra para ingresar
    Given Ingreso a url
    When Ingreso credenciales
    When Presiono boton INGRESAR
    
Scenario: navego en sitio de sentra Tasks
    Given Seleccionar boton Home
    Then Presiono boton NUEVA TAREA
    Then Ingreso nueva tarea de Home
    Then Presiono boton CREAR TAREA

Scenario: Navego en sitio sentra Perfil
    Given Presiono el boton PERFIL
    When Presiono el boton EDITAR DATOS USUARIO
    Then Modifico los datos del usuario
    Then Presiono boton GRABAR USUARIO

 Scenario: Cambiar contraseña
    Given Presiono el boton CAMBIAR CONTRASEÑA
    When Ingreso contraseña nueva
    Then Presiono el boton GUARDAR CONTRASEÑA

 Scenario: Salir de la web de sentra
    Given Presiono boton SALIR