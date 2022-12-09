package demo.blaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static demo.blaze.userinterfaces.PaginaLogueada.LABEL_USUARIO;
public class ValidarLogin implements Question<Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(LABEL_USUARIO).answeredBy(actor).isVisible();
    }

    public static Question<Boolean> usuario(){
        return new ValidarLogin();
    }
}
