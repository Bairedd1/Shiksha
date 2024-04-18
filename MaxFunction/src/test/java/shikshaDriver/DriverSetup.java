package shikshaDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
   public static WebDriver driver;
   public static ChromeOptions Coptions;
   public static EdgeOptions Eoptions;
   public static WebDriver chromedriver() {
	   WebDriverManager.chromedriver().setup();
	   Coptions= new ChromeOptions();
	   Coptions.addArguments("--start-maximized");
	   driver= new ChromeDriver(Coptions);
 
	   driver.get("https://www.shiksha.com/");
	   return driver;
   }
   public static WebDriver edgedriver() {
	   WebDriverManager.edgedriver().setup();
	   Eoptions= new EdgeOptions();
	   Eoptions.addArguments("--statrt-maximized");
	   driver.get("https://www.shiksha.com/");
	   return driver;
   }
}