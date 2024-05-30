Feature: Apertura de una nueva cuenta en Parabank
  Como usuario
  Necesito abrir una nueva cuenta
  Para verificar que aparece en el resumen de cuentas

  Scenario: Registro y apertura de una nueva cuenta
    Given iniciar la pagina de registro de parabank "https://parabank.parasoft.com/parabank/register.htm"
    When registro usuario con los datos: "Alejo", "Garces", "carrera 22", "Medellin", "Antioquia", "51000", "3102235641", "999-88-7", "Alejo00", "Alejo88"
    And nueva cuenta "SAVINGS"
    Then valido que la cuenta exista

