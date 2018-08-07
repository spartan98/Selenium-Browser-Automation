//importing external packages for SELENIUM
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase {

	public static void main(String[] a) {
				
		//set the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUCIFER\\eclipse-workspace_selenium\\Selenium_project\\chromedriver.exe");
		
		//make object of Chrome Driver
		WebDriver driver=new ChromeDriver();
		 
		//set the website
		driver.get("https://www.youtube.com");
		
		//Code for Automatically playing Alan Walker Spectra song
		driver.manage().window().maximize();
		 try {
		driver.findElement(By.cssSelector("#search")).sendKeys("Alan Walker Spectra");
		driver.findElement(By.cssSelector("#search-icon-legacy")).click();
		driver.findElement(By.cssSelector("#video-title")).click();
		 }
		 catch(Exception e) {
			 System.out.print(e);
		 }	
	}
}