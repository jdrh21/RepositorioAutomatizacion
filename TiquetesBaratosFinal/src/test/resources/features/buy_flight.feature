#Author: Jose Daniel Restrepo
#Tercer test: probar pantalla de confirmacion de pago de vuelos
#El actor selecciona el medio de pago y realiza el llenado de los campos del formulario de pago
#En el Background se implementan los metodos necesarios para llegar hasta el punto de pagar vuelo

Feature: Buy a fligth
  As a web user
  I want to use tiquetesbaratos.com
  To buy a flight
  
  Background: susan search and reserv a flight
    Given that susan is in tiquetes baratos home page
    When she fill all the fields
    Then she should see the available flights
    When she select a flight
    Then she should see the confirm flight page
    Given that susan is in tiquetes baratos confirm flight page
    When she fill all the form fields
    | primerNombre | primerApellido | cedula  | telefono | celular   | correo1         | correo2        |
    | Robot        | Hernandez      | 93223452| 3433434  | 312388439 | adfwsfe@eife.co | fdwdse@fkdo.co |
    Then she should see the payment page

  Scenario: buy the fligth reserved
    Given that susan select the payment form
    When she fill all the pay form fields
    | Nombre | Apellido     | nroTarjeta        | digSeguridad | cedula     | direccion         | ciudad        | correo          | telefono  |
    |  Robot |  Hernandez   | 8835442271634585  | 422          | 2434793847 | calle 10          |Medellin       |dsffdfer@fkdo.co | 3119348372|
    Then she buy the ticket