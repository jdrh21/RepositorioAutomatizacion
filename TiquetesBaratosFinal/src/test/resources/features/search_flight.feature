#Author: Jose Daniel Restrepo
#Primer test: probar pantalla de busqueda de vuelos
#El actor realiza el llenado de campos del formulario de busqueda y presiona el boton buscar, luego selecciona vuelo de ida y de regreso

Feature: Search fligth
  As a web user
  I want to use tiquetesbaratos.com
  To search a flight to buy

  Scenario: Search a fligth from Medellin to Bogota
    Given that susan is in tiquetes baratos home page
    When she fill all the fields
    Then she should see the available flights
    When she select a flight
    Then she should see the confirm flight page