package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	public static final Target SOURCE_LENGUAGE_OPTION = Target.the("Source lenguage button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LENGUAGE_OPTION = Target.the("Target lenguage button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LENGUAGE = Target.the("Source lenguage").located(By.xpath("//*[@id=\":1e\"]/div"));
	public static final Target TARGET_LENGUAGE = Target.the("Target lenguage").located(By.xpath("//*[@id=\":3q\"]/div"));
	public static final Target SOURCE_LENGUAGE_TEXTAREA = Target.the("Source lenguage textarea").located(By.id("source"));
	public static final Target TARGET_LENGUAGE_RESULT = Target.the("Target lenguage result area").located(By.id("gt-res-dir-ctr"));
	public static final Target TRANSLATE_BUTTON = Target.the("Translate button").located(By.id("gt-submit"));

}
