@all
Feature: Eliminar contacto

Scenario: Eliminar contacto exitoso
Given el usuario tiene un contacto existente
When elimina el contacto
Then el contacto con email no debe estar en la lista


