#Author: Jose Daniel Restrepo
#Segundo test: probar pantalla de confirmacion de reserva de vuelos
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
    | Robot        | Hernandez      | 93223452| 3433434  | 312388439 | adfwsfe@eife.co | fdwdse@fkdo.co |
    Then she should see the payment page
