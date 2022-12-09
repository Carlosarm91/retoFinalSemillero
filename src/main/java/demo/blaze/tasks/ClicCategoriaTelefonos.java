package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static demo.blaze.userinterfaces.PaginaLogueada.BTN_PHONES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ClicCategoriaTelefonos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PHONES, isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(BTN_PHONES)
        );
    }
    public static ClicCategoriaTelefonos categoriaTelefonos() {
        return Tasks.instrumented(ClicCategoriaTelefonos.class);
    }
}
