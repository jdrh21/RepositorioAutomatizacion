#Author: jose_restrepo82131@elpoli.edu.co

@tag
Feature: Loguearse en Guru99
  Quiero iniciar sesion en Guru99

  @tag1
  Scenario Outline: Inicio de sesion exitoso
    Given Abro el navegador
    When Voy a Guru
    And Quiero iniciar sesion con el nombre "<id>"
    And La clave es "<password>"
    Then Verifico el resultado <status>

    Examples: 
      | id          | password     | status  |
      | mngr162502  |   zurapAs    | success |
      | mngr162502  |   werwewe    | fail    |
      | sajjsai     |   zurapAs    | fail    |
      | sajjsai     |   werwewe    | fail    |
