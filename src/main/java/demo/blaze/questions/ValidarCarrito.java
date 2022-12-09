package demo.blaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static demo.blaze.userinterfaces.PaginaCarrito.CELDA_TELEFONO;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidarCarrito implements Question<Boolean> {
    private static String componente;
    public ValidarCarrito(String componente) {
        this.componente = componente;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return the(CELDA_TELEFONO).answeredBy(actor).containsText(componente);
    }
    public static Question<Boolean> componente(String componente){
        return new ValidarCarrito(componente);
    }
}
