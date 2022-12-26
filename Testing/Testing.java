package day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		//Set the Path Of Executable Browser Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\STAA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //Parent p=new Child (WebDriver is Parent & ChromeDriver is Child)
		
		driver.get("https://www.oneplustwo.my/account"); //Opening url
		System.out.println("The Tittle Of The Page: "+driver.getTitle()); //Printing title
		
		driver.findElement(By.id("CustomerEmail")).sendKeys("Email");
		driver.findElement(By.id("CustomerPassword")).sendKeys("Password");
		WebElement button = driver.findElement(By.xpath("//input[@type='submit' and @value='Sign In']"));
		button.click();
		WebElement link = driver.findElement(By.linkText("Log out"));
		link.click();

	
		//driver.quit(); //Closing browser
	}

}

