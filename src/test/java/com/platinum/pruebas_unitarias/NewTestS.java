package com.platinum.pruebas_unitarias;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestS {
	private WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement cuadroBusqueda = driver.findElement(By.name("q"));
		
	  cuadroBusqueda.sendKeys("login");
	  cuadroBusqueda.click();
	  
	  cuadroBusqueda.submit();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  assertEquals("login", driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ggana\\eclipse-workspace\\pruebas_unitarias\\src\\test\\driver\\chromedriver.exe" );
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("login");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
