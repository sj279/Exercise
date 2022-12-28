package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin:admin@the-internet.herokuapp.com");
		driver.findElement(By.linkText("Basic Auth")).click();
		
		System.out.println("Test Git 1");
		System.out.println("Test Git 2");
		System.out.println("Test Git 3");
	}

}
