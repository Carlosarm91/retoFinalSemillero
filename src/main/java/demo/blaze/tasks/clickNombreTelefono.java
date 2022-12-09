package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static demo.blaze.userinterfaces.PaginaLogueada.TELEFONO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class clickNombreTelefono implements Task {
    private final String nombreTelefono;

    public clickNombreTelefono(String nombreTelefono) {
        this.nombreTelefono = nombreTelefono;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TELEFONO(nombreTelefono), isPresent()).forNoMoreThan(10).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(TELEFONO(nombreTelefono))
        );
    }

        public static clickNombreTelefono Telefono (String nombreTelefono){
            return new clickNombreTelefono(nombreTelefono);
        }
    }
