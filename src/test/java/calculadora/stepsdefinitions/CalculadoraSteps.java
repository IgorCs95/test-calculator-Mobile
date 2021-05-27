package calculadora.stepsdefinitions;

import calculadora.pageObjects.BasePage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static calculadora.utils.Utils.driver;;

public class CalculadoraSteps {

	BasePage bp = new BasePage(driver);

	@Quando("adicionar o primeiro numero {string}")
	public void adicionarOPrimeiroNumero(String string) {
		bp.selecionarNumero(string);

	}

	@Quando("adicionar o segundo numero {string}")
	public void adicionarOSegundoNumero(String string) {
		bp.selecionarNumero(string);
	}

	@Entao("o resultado da soma deve ser {string}.")
	public void oResultadoDaSomaDeveSer(String string) {
		bp.clicarCalcular();
		bp.resultado(string);
	}
	
	@Quando("escolher a operacao de adicao")
	public void escolherAOperacaoDeAdicao() {
		bp.clicarAdicao();
	}

	@Quando("escolher a operacao de subtracao")
	public void escolherAOperacaoDeSubtracao() {
		bp.clicarSubtracao();
	}
	
	@Quando("escolher a operacao de multiplicacao")
	public void escolherAOperacaoDeMultiplicacao() {
	   bp.clicarMultiplicacao();
	}

}
