package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static demo.blaze.userinterfaces.PaginaLogin.BOTON_LOGIN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ClicBotonLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_LOGIN, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BOTON_LOGIN)
        );
    }

    public static ClicBotonLogin botonLogin() {
        return Tasks.instrumented(ClicBotonLogin.class);
    }
}
