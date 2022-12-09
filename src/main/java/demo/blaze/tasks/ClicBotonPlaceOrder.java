package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static demo.blaze.userinterfaces.PaginaCarrito.BTN_PLACE_ORDER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ClicBotonPlaceOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PLACE_ORDER, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BTN_PLACE_ORDER)
        );
    }

    public static ClicBotonPlaceOrder botonPlaceOrder() {
        return Tasks.instrumented(ClicBotonPlaceOrder.class);
    }
}
