import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class AzureSeleniumTest {   
/**
* @param args
*/
       public static void main(String[] args) {
              
// objects and variables instantiation
    	   
    	      System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
    	      WebDriver driver = new ChromeDriver();
              
              String appUrl = "https://accounts.google.com";
              
// launch the firefox browser and open the application url
              driver.get(appUrl);
              
// maximize the browser window
              driver.manage().window().maximize();
              
              driver.quit();
              
       }
       }