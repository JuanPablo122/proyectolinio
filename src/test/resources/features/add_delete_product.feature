Feature: Anadir y eliminar producto del carrito de compras en linio
  Yo como usuario de la aplicacion linio
  necesito añadir un producto al carrito de compras
  para validar la cantidad añadida y verificar cuando este vacio el mismo

  Scenario: Añadir producto al carrito en la pagina linio
    Given el usuario se encuentra en la categoria https://www.linio.com.co/c/colchones-base-cama-y-almohadas/colchones
    When el usuario agrega el producto 'Super Mega Combo Azul' al carrito de compras
    Then el usuario vera el nombre del producto y la cantidad.


  #Scenario: eliminar producto del carrito en la pagina linio
   # Given el usuario se encuentra en el carrito https://www.linio.com.co/cart
    #When el usuario dara clic en 'Eliminar'
    #Then el usuario vera un mensaje ‘No hay productos en tu carrito’ cuando este vacio.