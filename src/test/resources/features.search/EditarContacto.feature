@all
Feature: Editar contacto

Scenario: Editar contacto exitoso
Given el usuario tiene un contacto existente
When modifica los datos del contacto
Then los cambios se guardan correctamente

Scenario: Editar contacto con campos inválidos
Given el usuario tiene un contacto existente
When deja campos obligatorios vacíos
Then se muestran errores de validación
