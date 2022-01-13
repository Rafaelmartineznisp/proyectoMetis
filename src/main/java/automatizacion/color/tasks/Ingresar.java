package automatizacion.color.tasks;


import automatizacion.color.userinterfaces.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("JorgeMartinez").into(PaginaLocalizadora.USUARIO),
                Enter.theValue("1234").into(PaginaLocalizadora.PASSWORD),
                Click.on(PaginaLocalizadora.SING_IN));
    }
}
