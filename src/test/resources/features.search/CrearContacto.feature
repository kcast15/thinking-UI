@all
Feature: Crear contacto

Scenario Outline: Crear contacto exitoso
Given el usuario está logueado nombre
When ingresa "<firstName>", "<lastName>", "<birthdate>", "<email>", "<phone>", "<address1>", "<address2>", "<city>", "<state>", "<postalCode>" y "<country>"
Then el contacto se guarda correctamente

Examples:
    | firstName | lastName | birthdate  | email                                      | phone      | address1           | address2         | city        | state           | postalCode | country  |
    | Laura     | Martínez | 1992-04-18 | laura.martinez.qa01@example.com            | 3005550101 | Calle 80 # 25-40   | Apto 301         | Bogotá      | Cundinamarca     | 110221     | Colombia |
    | Andrés    | Gómez    | 1988-11-07 | andres.gomez.qa02@example.com              | 3005550102 | Carrera 13 # 72-18 | Oficina 502      | Bogotá      | Cundinamarca     | 110231     | Colombia |
    | Valentina | Rodríguez| 1995-06-22 | valentina.rodriguez.qa03@example.com       | 3005550103 | Calle 45 # 18-55   | Torre B Apto 804 | Medellín    | Antioquia        | 050021     | Colombia |
    | Sebastián | Torres   | 1990-02-14 | sebastian.torres.qa04@example.com          | 3005550104 | Avenida 6N # 24-60 | Casa 12          | Cali        | Valle del Cauca  | 760001     | Colombia |
    | Camila    | Herrera | 1997-09-30 | camila.herrera.qa05@example.com            | 3005550105 | Carrera 53 # 80-25 | Piso 3           | Barranquilla| Atlántico        | 080001     | Colombia |

Scenario: Crear contacto con campos vacíos
Given el usuario está logueado
When intenta crear un contacto sin datos
Then se muestran errores de validación

Scenario: Crear contacto con datos inválidos
Given el usuario está logueado
When ingresa email inválido correo@
Then se muestra error de validación
