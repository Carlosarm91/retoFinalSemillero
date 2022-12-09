package demo.blaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static demo.blaze.userinterfaces.PaginaComprobante.COMPROBANTE;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidarPago implements Question<Boolean> {

    private final String creditCard;

    public ValidarPago(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(actor.asksFor(Text.of(COMPROBANTE).asString()));
        return the(COMPROBANTE).answeredBy(actor).containsText(creditCard);
    }

    public static Question<Boolean> pago(String creditCard){
        return new ValidarPago(creditCard);
    }
}
