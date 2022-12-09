package demo.blaze.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPlaceOrder {
    public static final Target CAMPO_NAME = Target.the("Campo Nombre").located(By.xpath("//input[@id='name']"));
    public static final Target CAMPO_COUNTRY = Target.the("Campo País").located(By.xpath("//input[@id='country']"));
    public static final Target CAMPO_CITY= Target.the("Campo Ciudad").located(By.xpath("//input[@id='city']"));
    public static final Target CAMPO_CREDIT_CARD= Target.the("Campo Tarjeta Crédito").located(By.xpath("//input[@id='card']"));
    public static final Target CAMPO_MONTH= Target.the("Campo Mes").located(By.xpath("//input[@id='month']"));
    public static final Target CAMPO_YEAR= Target.the("Campo Año").located(By.xpath("//input[@id='year']"));
    public static final Target BOTON_PURCHASE=Target.the("Botón Compra").located(By.xpath("//button[contains(text(),'Purchase')]"));
}
