package calculadora.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

	public BasePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
// Numeros	

	@AndroidFindBy(xpath = "//android.widget.Button[@text=0]")
	private MobileElement btn0;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=1]")
	private MobileElement btn1;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=2]")
	private MobileElement btn2;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=3]")
	private MobileElement btn3;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=4]")
	private MobileElement btn4;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=5]")
	private MobileElement btn5;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=6]")
	private MobileElement btn6;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=7]")
	private MobileElement btn7;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=8]")
	private MobileElement btn8;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=9]")
	private MobileElement btn9;
	
	@AndroidFindBy(id = "com.google.android.calculator:id/dec_point")
	private MobileElement btnVirgula;

//	Operações

	@AndroidFindBy(id = "com.google.android.calculator:id/op_add")
	private MobileElement btnAdicao;

	@AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
	private MobileElement btnSubtracao;

	@AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
	private MobileElement btnMultiplicacao;

	@AndroidFindBy(id = "com.google.android.calculator:id/op_div")
	private MobileElement btnDivisao;

//	Calcular

	@AndroidFindBy(id = "com.google.android.calculator:id/eq")
	private MobileElement btnCalcular;

	@AndroidFindBy(id = "com.google.android.calculator:id/result_final")
	private MobileElement resultado;

	
	public void clicarAdicao() {
		btnAdicao.click();
	}
	
	public void clicarSubtracao() {
		btnSubtracao.click();
	}
	
	public void clicarMultiplicacao() {
		btnMultiplicacao.click();
	}
	
	public void clicarDivisao() {
		btnDivisao.click();
	}
	
	
	public void clicarCalcular() {
		btnCalcular.click();
	}
	
	public void resultado(String result) {
		String resultadoObt = resultado.getText().toString();
		System.out.println("*******************************"+resultadoObt);
		
		
		
		assertEquals(result, resultadoObt);
	}
	
	public void selecionarNumero(String num){
		for(char a :num.toCharArray()) {
			clicarNumero(a);
		}
	}

	public void clicarNumero(char num) {
		switch (num) {
		case '0':
			btn0.click();
			break;
		case '1':
			btn1.click();
			break;
		case '2':
			btn2.click();
			break;
		case '3':
			btn3.click();
			break;
		case '4':
			btn4.click();
			break;
		case '5':
			btn5.click();
			break;
		case '6':
			btn6.click();
			break;
		case '7':
			btn7.click();
			break;
		case '8':
			btn8.click();
			break;
		case '9':
			btn9.click();
			break;
		case '.':
			btnVirgula.click();
			break;
		case '-':
			btnSubtracao.click();
			break;
		default:
			break;
		}
	}

}