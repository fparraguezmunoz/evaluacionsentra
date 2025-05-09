Feature: SentraNavegacion

Scenario: Crea Usuario
    Given Ingreso a web
    When presiono boton CREAR USUARIO
    Then ingreso datos USUARIO
    Then presiono boton GRABAR USUARIO
    Then validar mensaje crear usuario correctamente
    Then Registro fallido

Scenario: Pantalla de inicio
    Given Ingreso a url
    When validar que usuario ingrese credenciales
    Then Presiono boton INGRESAR
    
Scenario: Ingreso a Home a crear Tareas del usuario
    Given Seleccionar boton Home
    When ordena por titulo
    Then ordena por prioridad
    Then ordena por fecha creacion
    Then ordena por fecha vencimiento
    Then Presiono boton NUEVA TAREA
    Then Ingreso nueva tarea de Home
    Then Presiono boton CREAR TAREA
    Then validar mensaje de tarea creada correctamente
    Then Se produjo un error al obtener información de Tarea.
    Then Request failed with status code 400
    Then Presiono una tarea para editarla
    Then Presiono boton EDITAR TAREA
    Then editar la tarea
    Then Presiono MODIFICAR TAREA para guardar cambios

    Then validar mensaje de tarea modificada correctamente


Scenario: Validar Ingreso a Perfil para Modificar datos del usuario
    Given Presiono el boton PERFIL
    When Presiono el boton EDITAR DATOS USUARIO
    Then Modifico los datos del usuario
    Then Presiono boton GRABAR USUARIO
    Then validar mensaje Datos de usuario modificados correctamente


 Scenario: Validar Cambio de contraseña
    Given Presiono el boton CAMBIAR CONTRASEÑA
    When Ingreso contraseña nueva
    Then Presiono el boton GUARDAR CONTRASEÑA
    Then validar mensaje cambio de Contraseña cambiada correctamente
    Then Error con mensaje Contraseñas no coinciden

 Scenario: Validar boton Salir y que rediriga a inicio
    Given Presiono boton SALIR