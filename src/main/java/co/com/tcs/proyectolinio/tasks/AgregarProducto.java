package co.com.tcs.proyectolinio.tasks;

import co.com.tcs.proyectolinio.userinterfaces.SeleccionarProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(SeleccionarProductoPage.MENU);
        /*Click.on(SeleccionarProductoPage.LINK_HOGAR);*/
    }

}
