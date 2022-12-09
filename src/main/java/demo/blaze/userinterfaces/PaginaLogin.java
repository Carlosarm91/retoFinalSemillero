package demo.blaze.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogin {

    public static final Target CAMPO_USERNAME = Target.the("Campo de usuario").located(By.xpath("//input[@id='loginusername']"));
    public static final Target CAMPO_PASSWORD= Target.the("Campo de contrasena").located(By.xpath("//input[@id='loginpassword']"));
    public static final Target BOTON_LOGIN= Target.the("Boton de Login").located(By.xpath("//button[contains(text(),'Log in')]"));
}
