package co.com.tcs.proyectolinio.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteProductStepDefinitions {
    @Given("^el usuario se encuentra en la categoria https://www\\.linio\\.com\\.co/c/colchones-base-cama-y-almohadas/colchones$")
    public void elUsuarioSeEncuentraEnLaCategoriaHttpsWwwLinioComCoCColchonesBaseCamaYAlmohadasColchones() {
    }

    @When("^el usuario agrega el producto 'Super Mega Combo Azul' al carrito de compras$")
    public void elUsuarioAgregaElProductoSuperMegaComboAzulQueenXResortadoMarshallAlCarritoDeCompras() {
    }

    @Then("^el usuario vera el nombre del producto y la cantidad\\.$")
    public void elUsuarioVeraElNombreDelProductoYLaCantidad() {
    }

    @Given("^el usuario se encuentra en el carrito https://www\\.linio\\.com\\.co/cart$")
    public void elUsuarioSeEncuentraEnElCarritoHttpsWwwLinioComCoCart() {
    }

    @When("^el usuario dara clic en 'Eliminar'$")
    public void elUsuarioDaraClicEnEliminar() {
    }

    @Then("^el usuario vera un mensaje ‘No hay productos en tu carrito’ cuando este vacio$")
    public void elUsuarioVeraUnMensajeNoHayProductosEnTuCarritoCuandoEsteVacio() {
    }
}
