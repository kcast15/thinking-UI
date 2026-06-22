@all
Feature: Eliminar contacto

Scenario: Eliminar contacto exitoso
Given el usuario tiene un contacto existente
When elimina el contacto
Then el contacto desaparece de la lista

Scenario: Cancelar eliminación
Given el usuario tiene un contacto existente
When cancela la eliminación
Then el contacto permanece en la lista
