package demo.blaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static demo.blaze.userinterfaces.PaginaPlaceOrder.*;

public class DiligenciarFormularioPedido implements Task {
    private final String nombre;
    private final String pais;
    private final String ciudad;
    private final String creditCard;
    private final String mes;
    private final String anio;

    public DiligenciarFormularioPedido(String nombre, String pais, String ciudad, String creditCard, String mes, String anio) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.creditCard = creditCard;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NAME),
                Enter.theValue(pais).into(CAMPO_COUNTRY),
                Enter.theValue(ciudad).into(CAMPO_CITY),
                Enter.theValue(creditCard).into(CAMPO_CREDIT_CARD),
                Enter.theValue(mes).into(CAMPO_MONTH),
                Enter.theValue(anio).into(CAMPO_YEAR)
        );
    }

    public static DiligenciarFormularioPedido enPedido(String nombre, String pais, String ciudad, String creditCard, String mes, String anio){
        return Tasks.instrumented(DiligenciarFormularioPedido.class, nombre, pais, ciudad, creditCard, mes, anio);
    }
}
