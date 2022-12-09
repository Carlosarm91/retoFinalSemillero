package demo.blaze.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaComprobante {

    public static final Target COMPROBANTE = Target.the("Comprobante de pago").located(By.xpath("//p[@class='lead text-muted ']"));

}
