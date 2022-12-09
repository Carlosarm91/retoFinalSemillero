package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static demo.blaze.userinterfaces.PaginaLogin.*;

public class DigitarDatosLogin implements Task {

    private final String usuario;
    private final String contrasena;

    public DigitarDatosLogin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USERNAME),
                Enter.theValue(contrasena).into(CAMPO_PASSWORD)
        );
    }

    public static DigitarDatosLogin enLogin(String usuario, String contrasena){
        return Tasks.instrumented(DigitarDatosLogin.class, usuario, contrasena);
    }
}
