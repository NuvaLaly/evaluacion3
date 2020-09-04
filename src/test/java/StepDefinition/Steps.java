package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	 public void abrir_Chrome() {
		 System.out.println(" Abre el navegador google chrome");
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ggana\\\\eclipse-workspace\\\\pruebas_unitarias\\\\src\\\\test\\\\driver\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.cl");
	}
	 
	 @When("ingresar username {string} y password {string}")
	 public void ingresar_username_y_password(String string, String string2) {
		 System.out.println("En este paso ingresa las credenciales de usuario");
		 System.out.println("Este paso ingresa al nombre de usuario y contraseña en la pagina de login");
		 driver.findElement(By.id("username")).sendKeys(string);
		 driver.findElement(By.id("password")).sendKeys(string2);
		 
	 }

	 @Then("inicia sesion")
	 public void inicia_sesion() {
		 System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo Mytest.feature");
		 driver.findElement(By.id("loginbtn")).click();
	 }

}
