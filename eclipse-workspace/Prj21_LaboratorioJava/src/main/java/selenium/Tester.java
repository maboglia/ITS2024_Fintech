package selenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		for (int i = 0; i < 5; i++) {
			aggiungi(driver);
		}
        
        //driver.quit();
		
	}

	private static void aggiungi(WebDriver driver) {
		driver.get("http://localhost:8080/Prj21_LaboratorioJava/");

		double random = Math.random();
		
		if (random < 0.33) {
			WebElement radioMaglia = driver.findElement(By.id("maglia"));
			radioMaglia.click();
		} else 
		if (random <0.66) {
			WebElement radioPantalone = driver.findElement(By.id("pantalone"));
			radioPantalone.click();
		}
		else {
			WebElement radioGiacca = driver.findElement(By.id("giacca"));
			radioGiacca.click();
		}
		
		WebElement prezzo = driver.findElement(By.id("prezzo"));
		Random rand = new Random();
		prezzo.sendKeys("" + Math.round(rand.nextDouble(10,50)));
		
		WebElement selectElement = driver.findElement(By.id("taglia"));
        Select select = new Select(selectElement);
        
        select.selectByIndex(rand.nextInt(1, 5));
        
        driver.findElement(By.id("invia")).click();
		
		
		
	}

}
