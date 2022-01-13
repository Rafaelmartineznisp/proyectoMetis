package automatizacion.color.stepdefinitions;

import automatizacion.color.questions.Verificar;
import automatizacion.color.tasks.Abrir;
import automatizacion.color.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MyStepDefinitions {
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que jorge ingresa a la web de metis$")
    public void queJorgeIngresaALaWebDeMetis() {
        OnStage.theActorCalled("Jorge").wasAbleTo(Abrir.paginaMetis());
    }

    @Cuando("^digita sus credenciales$")
    public void digitaSusCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Entonces("^Verifica que el login funciona correctamente$")
    public void verificaQueElLoginFuncionaCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.respuesta(), Matchers.equalTo("Bootstrap-Admin-Template")));
    }
}
