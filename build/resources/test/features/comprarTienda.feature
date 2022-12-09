#language: es

Característica: Compra componente electrónico
  Yo como usuario de la página demoblaze,
  realizó la búsqueda de un componente electrónico,
  lo agrego al carrito
  y realizar el proceso del pago.

Antecedentes:
  Dado que ingreso a la pagina de demoblaze
  Cuando hago login en esta pagina
    | carlosarmientosqa   |SQA123    |
  Entonces valido que este logueado correctamente

  Esquema del escenario: compra componente electronico correctamente
    Dado que realizo la busqueda de un componente "<componente>"
    Cuando lo agrego al carrito "<componente>"
    Y realizo el proceso de pago "<nombre>" "<pais>" "<ciudad>" "<creditCard>" "<mes>" "<anio>"
    Entonces valido que la orden haya sido generada correctamente "<creditCard>"

    Ejemplos:
    |componente|nombre|pais|ciudad|creditCard|mes|anio|
    |Iphone 6 32gb| Carlos Sarmiento | Colombia   |  Villavicencio    |      4970100000000014    |  12 |  24  |

