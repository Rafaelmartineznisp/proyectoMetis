package automatizacion.color.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLocalizadora {
    public static final Target USUARIO = Target.the("Digitar usuario").located(By.xpath("//*[@id='login']/form/input[1]"));
    public static final Target PASSWORD = Target.the("Contraseña de usuario").located(By.xpath("//*[@id='login']/form/input[2]"));
    public static final Target SING_IN = Target.the("Ingresar").located(By.xpath("//button[contains(text(),'Sign in')]"));
    public static final Target RESPUESTA = Target.the("Verificacion de aceso").located(By.id("bootstrap-admin-template"));
}
