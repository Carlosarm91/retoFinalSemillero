package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static demo.blaze.userinterfaces.PaginaInicio.BTN_LOGIN;

public class Click implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_LOGIN, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BTN_LOGIN)
        );
    }

    public static Click buttonLogin() {
        return Tasks.instrumented(Click.class);
    }
}
