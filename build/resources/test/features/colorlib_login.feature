#language: es
  @tag
  Característica: Ingresar a la pagina de metis y verificar el funcionamiento del login
    yo como usuario quiero validar el ingreso al aplicativo web de metis y validar el login

  @casoprueba1
  Escenario: Ingersar a la app de metis exitosamente
    Dado que jorge ingresa a la web de metis
    Cuando digita sus credenciales
    Entonces Verifica que el login funciona correctamente