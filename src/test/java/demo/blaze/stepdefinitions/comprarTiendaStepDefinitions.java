package demo.blaze.stepdefinitions;

import demo.blaze.exceptions.ExceptionsControl;
import demo.blaze.questions.ValidarPago;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import java.time.Duration;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import demo.blaze.questions.ValidarLogin;
import demo.blaze.questions.ValidarCarrito;
public class comprarTiendaStepDefinitions {
    public Actor usuario = Actor.named("Carlos");

    @Before
    public void setup() {
        usuario.can(BrowseTheWeb.with(getDriver()));
    }
    @Dado("que ingreso a la pagina de demoblaze")
    public void que_ingreso_a_la_pagina_de_demoblaze() {
        usuario.wasAbleTo(Open.url("https://www.demoblaze.com/index.html"));
    }
    @Cuando("hago login en esta pagina")
    public void hago_login_en_esta_pagina(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        usuario.attemptsTo(demo.blaze.tasks.Click.buttonLogin());
        usuario.attemptsTo(demo.blaze.tasks.DigitarDatosLogin.enLogin(data.get(0).get(0),data.get(0).get(1)));
        usuario.attemptsTo(demo.blaze.tasks.ClicBotonLogin.botonLogin());
    }
    @Entonces("valido que este logueado correctamente")
    public void valido_que_este_logueado_correctamente() {
        Duration duration = Duration.ofSeconds(10);
        getDriver().manage().timeouts().implicitlyWait(duration);
        usuario.should(seeThat(ValidarLogin.usuario(), Matchers.equalTo(true)).orComplainWith(ExceptionsControl.class, ExceptionsControl.userNameFail));
    }
    @Dado("que realizo la busqueda de un componente {string}")
    public void que_realizo_la_busqueda_de_un_componente(String nombreTelefono) {
        usuario.attemptsTo(demo.blaze.tasks.ClicCategoriaTelefonos.categoriaTelefonos());
        usuario.attemptsTo(demo.blaze.tasks.clickNombreTelefono.Telefono(nombreTelefono));
    }
    @Cuando("lo agrego al carrito {string}")
    public void lo_agrego_al_carrito(String nombreTelefono) throws InterruptedException {
        usuario.attemptsTo(demo.blaze.tasks.ClicBotonAddToCart.botonAddToCart());
        Duration duration = Duration.ofSeconds(10);
        getDriver().manage().timeouts().implicitlyWait(duration);
        BrowseTheWeb.as(usuario).getDriver().switchTo().alert().accept();
        usuario.attemptsTo(demo.blaze.tasks.ClicBotonCART.botonCart());
        usuario.should(seeThat(ValidarCarrito.componente(nombreTelefono), Matchers.equalTo(true)).orComplainWith(ExceptionsControl.class, ExceptionsControl.compenenteFail));
    }
    @Cuando("realizo el proceso de pago {string} {string} {string} {string} {string} {string}")
    public void realizo_el_proceso_de_pago(String nombre, String pais, String ciudad, String creditCard, String mes, String anio) {
        usuario.attemptsTo(demo.blaze.tasks.ClicBotonPlaceOrder.botonPlaceOrder());
        usuario.attemptsTo(demo.blaze.tasks.DiligenciarFormularioPedido.enPedido(nombre, pais, ciudad, creditCard, mes, anio));
        usuario.attemptsTo(demo.blaze.tasks.ClicBotonPurchase.botonPurchase());
    }
    @Entonces("valido que la orden haya sido generada correctamente {string}")
    public void valido_que_la_orden_haya_sido_generada_correctamente(String creditCard) {
        usuario.should(seeThat(ValidarPago.pago(creditCard)));
    }
}
