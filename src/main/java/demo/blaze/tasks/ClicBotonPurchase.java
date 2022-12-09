package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static demo.blaze.userinterfaces.PaginaPlaceOrder.BOTON_PURCHASE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ClicBotonPurchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_PURCHASE, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BOTON_PURCHASE)
        );
    }
    public static ClicBotonPurchase botonPurchase() {
        return Tasks.instrumented(ClicBotonPurchase.class);
    }
}
