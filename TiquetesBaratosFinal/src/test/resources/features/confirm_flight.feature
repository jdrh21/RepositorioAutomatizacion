#Author: Jose Daniel Restrepo
#Tercer test: probar pantalla de confirmacion de reserva de vuelos
#El actor realiza el llenado de campos del formulario de reserva y presiona el boton Reservar
#En el Background se implementan los metodos necesarios para llegar hasta el punto de reservar vuelo

Feature: Confirm fligth
  As a web user
  I want to use tiquetesbaratos.com
  To Confirm a flight to buy
  
  Background: susan search and select a flight
    Given that susan is in tiquetes baratos home page
    When she fill all the fields
    Then she should see the available flights
    When she select a flight
    Then she should see the confirm flight page

  Scenario: Confirm the fligth selected
    Given that susan is in tiquetes baratos confirm flight page
    When she fill all the form fields
    | primerNombre | primerApellido | cedula  | telefono | celular   | correo1         | correo2        |
    | Daniel       | Hernandez      | 32423452| 3433434  | 311988439 | adffdfe@eife.co | eradse@fkdo.co |
    Then she should see the payment page
