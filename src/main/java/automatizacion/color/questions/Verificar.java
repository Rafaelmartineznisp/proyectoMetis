package automatizacion.color.questions;

import automatizacion.color.userinterfaces.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar respuesta() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaLocalizadora.RESPUESTA).viewedBy(actor).asString();
    }
}
