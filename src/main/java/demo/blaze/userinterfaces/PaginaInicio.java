package demo.blaze.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target BTN_LOGIN = Target.the("Boton login").located(By.xpath("//a[@id='login2']"));
}
