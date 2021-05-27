package calculadora.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features",
		glue = { "calculadora.stepsdefinitions" }, 
		tags =  {"@Calculadora"} ,
		monochrome = true,
		dryRun = false,
		plugin = {"pretty"},
		snippets = SnippetType.CAMELCASE
		)
public class RunnerTest {

}
