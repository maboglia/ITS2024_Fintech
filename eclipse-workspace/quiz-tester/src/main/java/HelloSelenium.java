import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {

		   WebDriver driver = new ChromeDriver();
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("http://www.wikipedia.org");
	        WebElement englishButton = driver.findElement(By.id("js-link-box-en"));

	        englishButton.click();

	        String expectedTitle = "Welcome to Wikipedia,";
	        WebElement titleOfEnglishPage = driver.findElement(By.id("mp-welcome"));

	        if(titleOfEnglishPage.getText().equals(expectedTitle)){
	            System.out.println("Test has passed! Page is the English one");
	        }

	        else{
	            System.out.println("Test has failed! Click() was not successful.");
	        }

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("http://www.wikipedia.org");

	        WebElement searchBox = driver.findElement(By.id("searchInput"));
	        String searchStr = "Selenium Webdriver";
	        searchBox.sendKeys(searchStr);

	        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
	        searchButton.click();
	        
	        
	        //driver.close();
		
		
	}

}
