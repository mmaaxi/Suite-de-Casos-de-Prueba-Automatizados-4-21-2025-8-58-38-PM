Feature: Inicio de sesión fallido

  Scenario: Usuario intenta iniciar sesión con credenciales incorrectas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa credenciales incorrectas
    Then se muestra un mensaje de error de inicio de sesión