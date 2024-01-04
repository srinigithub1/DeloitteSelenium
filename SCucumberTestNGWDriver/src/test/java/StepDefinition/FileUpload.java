package StepDefinition;

import java.io.IOException;		
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;		
public class FileUpload {	
	public static WebDriver driver;
public static void main(String[] args) throws IOException {								
	 
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();	
//    options.addArguments("incognito");
    options.addArguments("--remote-allow-origins=*");
    
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.manage().window().maximize();
    
    driver.get("http://demo.guru99.com/test/autoit.html");			
    driver.findElement(By.id("postjob")).click();			
   // driver.navigate().refresh();
    
    
    driver.switchTo().frame(3);
   // driver.switchTo().defaultContent();
    driver.findElement(By.id("input_3")).click();
    driver.findElement(By.id("input_3")).sendKeys("alex");
    driver.findElement(By.id("input_4")).sendKeys("alex@gmail.com");
    driver.findElement(By.id("input_5")).click();
    driver.findElement(By.id("input_6")).click();
    driver.findElement(By.id("input_6")).sendKeys("hello");
    driver.findElement(By.id("input_2")).click();

    
    
  
    driver.findElement(By.xpath("//input[@id='input_3']")).sendKeys("Gaurav");                                 					
    driver.findElement(By.id("input_4")).sendKeys("test.test@gmail.com");					
    driver.findElement(By.id("input_5")).click();			
    // below line execute the AutoIT script .
     Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");		
    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
    driver.findElement(By.id("input_2")).click();
    driver.close();
     }
}
