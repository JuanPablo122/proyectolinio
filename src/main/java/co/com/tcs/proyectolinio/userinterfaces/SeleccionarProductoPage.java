package co.com.tcs.proyectolinio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProductoPage {

    public static final Target MENU = Target.the("target_menu").
            locatedBy("//div[@class=\"menu-icon\"]");
    public static final Target LINK_HOGAR = Target.the("target_home").
            locatedBy("//input[@name='btnLogin']");
}
