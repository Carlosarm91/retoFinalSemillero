package demo.blaze.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaComponente {
    public static final Target BTN_ADD_TO_CART = Target.the("Boton de agregar al carrito").located(By.xpath("//a[contains(text(),'Add to cart')]"));
    public static final Target BTN_CART= Target.the("Boton CART").located(By.xpath("//a[@id='cartur']"));
}
