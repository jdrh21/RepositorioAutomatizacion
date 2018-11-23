#Author: jose_restrepo82131@elpoli.edu.co

@tag
Feature: Buscar en Google
  Yo quiero usar Google para buscar una cadena

  @tag1
  Scenario: Busqueda exitosa
    Given Que puedo abrir el navegador
    When Voy a Google
    And Busco "Fantasmas captados en camara en medellin" en google
    Then Valido que el resultado sea el esperado
  