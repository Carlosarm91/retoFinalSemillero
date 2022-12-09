package demo.blaze.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogueada {

    public static final Target LABEL_USUARIO = Target.the("Texto de usuario").located(By.xpath("//a[@id='nameofuser']"));
    public static final Target BTN_PHONES = Target.the("Boton telefonos").located(By.xpath("//a[contains(text(),'Phones')]"));
    public static Target TELEFONO(String nombreTelefono){
        return Target.the("Nombre telefono visto en la categoria Phones").located(By.xpath("//*[contains(text(),'"+nombreTelefono+"')]"));
    }
}
