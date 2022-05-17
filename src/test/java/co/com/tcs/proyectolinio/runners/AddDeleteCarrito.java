package co.com.tcs.proyectolinio.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\add_delete_product.feature",
        glue = "co.com.tcs.proyectolinio.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AddDeleteCarrito {
}
