package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosSite {

	WebDriver driver;

	public void abrirNavegador(String navegador, String url) {
		if (navegador.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("FIREFOX")) {

		} else {

			System.err.println("Navegador indisponível digite CHROME ou FIREFOX");
		}

		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.br");
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}
	public void validar(By elemento, String textoEsperado) {
		System.out.println("O texto esperado é: " + textoEsperado + ".");
		
	}
	public void premer(By elemento) {
		driver.findElement(elemento).click();
	}
	public void buscar(By elemento) {
		driver.findElement(elemento).click();
	}
	

}
