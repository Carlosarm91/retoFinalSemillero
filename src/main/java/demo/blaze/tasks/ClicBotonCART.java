package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static demo.blaze.userinterfaces.PaginaComponente.BTN_CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ClicBotonCART implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CART, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BTN_CART)
        );
    }

    public static ClicBotonCART botonCart() {
        return Tasks.instrumented(ClicBotonCART.class);
    }
}
