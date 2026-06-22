@all
Feature: Registro de usuario

  Scenario Outline: Registro exitoso
    Given el usuario navega a la página de registro
    When ingresa "<nombre>","<apellido>","<email>" y "<password>"
    Then debe visualizar el mensaje de registro exitoso

    Examples:
      | nombre | apellido | email                 | password |
      | Juan   | Morales  | juan.morales@test.com | 233241235|
      | Ana    | Nieta    | ana.nieta@test.com    | fidsifa78|

Scenario: Registro con email existente
Given el usuario ya está registrado con email test@test.com
When intenta registrarse nuevamente con el mismo email
Then se muestra un mensaje de error

Scenario: Validación de email inválido
Given el usuario está en la página de registro
When ingresa un email inválido correo
Then se muestra error de validación

Scenario: Campos obligatorios vacíos
Given el usuario está en la página de registro
When envía el formulario sin completar datos
Then se muestran mensajes de campos requeridos

Scenario Outline: Password inválido
Given el usuario está en la página de registro
When ingresa password '<password>'
Then se muestra error de validación

Examples:
| password |
| 123      |
| abc      |

