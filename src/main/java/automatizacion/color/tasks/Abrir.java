package automatizacion.color.tasks;


import automatizacion.color.userinterfaces.PaginaMetisColor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private PaginaMetisColor paginaMetisColor;
    public static Abrir paginaMetis() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaMetisColor));
    }
}
