package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Ehab(QA)\\MyChromeNewWebDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");

		driver.findElement(By.className("bui-button--secondary")).click();
		driver.findElement(By.id("username")).sendKeys("ahoob172@gmail.com");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("new_password")).sendKeys("201010566Ehab");
		driver.findElement(By.name("confirmed_password")).sendKeys("201010566Ehab");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();

	}

}
