package calculadora.stepsdefinitions;

import static calculadora.utils.Utils.acessarApp;
import static calculadora.utils.Utils.gerarScreenShot;
import static calculadora.utils.Utils.driver;

import java.net.MalformedURLException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void init() throws MalformedURLException, InterruptedException {
		acessarApp();
	}

	@After
	public void quit(Scenario cenario) {
		gerarScreenShot(cenario);
		driver.quit();
	}

}
