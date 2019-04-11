import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SampleJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.gecko.driver", "")
		
		
		
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dubainow.dubai.ae/en/Pages/default.aspx");
		Thread.sleep(5000);
		
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.className("inv-lang")).click();
		

	}

}
