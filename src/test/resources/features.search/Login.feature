@all
Feature: Inicio de sesión

Scenario Outline: Login exitoso
Given el usuario está registrado con "<email>" y "<password>"
When ingresa credenciales válidas
Then accede al sistema correctamente

Examples:
| email                   | password |
| juan.morales@test.com   | 233241235 |

Scenario: Password incorrecto
Given el usuario está registrado
When ingresa password incorrecto
Then se muestra mensaje de error

Scenario: Usuario no existente
Given el usuario no está registrado
When intenta iniciar sesión
Then se muestra error de autenticación

Scenario: Campos vacíos en login
Given el usuario está en la página de login
When envía el formulario vacío
Then se muestran validaciones de campos

Scenario: Persistencia de sesión
Given el usuario ha iniciado sesión correctamente
When refresca la página
Then permanece autenticado
