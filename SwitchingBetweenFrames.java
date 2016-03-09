package myPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwitchingBetweenFrames {
	public static void main(String[] args){
		//Initiating the driver
		WebDriver driver= new FirefoxDriver();
		//Declaring variables
		String baseUrl="http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html";
		driver.get(baseUrl);
		//Selecting/switching between the frames
		driver.switchTo().frame("classFrame");
		//Selecting based on the hyperlink text and clicking
		driver.findElement(By.linkText("Deprecated")).click();
		//Close firefox and quit connection
		driver.quit();
	}

}
