package co.com.tcs.proyectolinio.stepdefinitions;

import co.com.tcs.proyectolinio.tasks.AgregarProducto;
import co.com.tcs.proyectolinio.userinterfaces.CategoriaPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddDeleteProductStepDefinitions {

    CategoriaPage page;
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("sebastian");
    }
    @Given("^el usuario se encuentra en la categoria (.*)$")
    public void elUsuarioSeEncuentraEnLaCategoriaHttpsWwwLinioComCoCColchonesBaseCamaYAlmohadasColchones(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }

    @When("^el usuario agrega el producto 'Super Mega Combo Azul' al carrito de compras$")
    public void elUsuarioAgregaElProductoSuperMegaComboAzulQueenXResortadoMarshallAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo();
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
