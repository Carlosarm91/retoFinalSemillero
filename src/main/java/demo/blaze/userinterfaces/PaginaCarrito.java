package demo.blaze.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCarrito {

    public static final Target BTN_PLACE_ORDER = Target.the("Boton de realizar el pedido").located(By.xpath("//button[@class='btn btn-success']"));
    public static final Target CELDA_TELEFONO = Target.the("Nombre telefono en la grilla del carrito").located(By.xpath("((//tr)[last()]/td)[2]"));
}
