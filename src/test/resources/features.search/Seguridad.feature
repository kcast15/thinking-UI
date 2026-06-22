@all
Feature: Seguridad de la aplicación

Scenario: Acceso sin autenticación
Given el usuario no ha iniciado sesión
When intenta acceder a contactos
Then es redirigido al login

Scenario: Logout exitoso
Given el usuario está logueado
When cierra sesión
Then se termina la sesión correctamente

Scenario: Acceso después de logout
Given el usuario cerró sesión
When intenta volver atrás en el navegador
Then no puede acceder a la aplicación
