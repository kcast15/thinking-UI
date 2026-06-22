@all
Feature: Listar contactos

Scenario: Ver lista de contactos
Given el usuario tiene contactos creados
When accede a la lista de contactos
Then se muestran todos los contactos

Scenario: Lista vacía
Given el usuario no tiene contactos
When accede a la lista
Then se muestra mensaje de lista vacía

Scenario: Persistencia de datos
Given el usuario tiene contactos
When refresca la página
Then los contactos permanecen visibles
