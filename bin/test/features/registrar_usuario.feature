#language:es
#Author: heepar@hotmail.com
Característica: Yo como usuario final deseo registrarme en uTest

  @RegistrarUsuario
  Escenario: Registrar usuario
    Dado que el usuario final se encuentra en la pagina principal de uTest
    Cuando se registra el usuario
      | nombre | apellido | email               | mes      | dia | año  | idioma  | password           |
      | Juan   | Perez    | juanpersez20121@gmail.com | February |  18 | 2000 | Spanish | Pruebas_1234567890 |
    Entonces el usuario final debe visualizar el mensaje Welcome to the world's largest community
