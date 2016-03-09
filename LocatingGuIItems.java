package myPackage;
//Import the repositories required
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingGuIItems {
	public static void main(String[] args){
		//Intialize the driver
		WebDriver driver= new FirefoxDriver();
		//Assign the variables
		String baseUrl="https://www.facebook.com";
		String idElement="";
		//get the baseURL
		driver.get(baseUrl);
		//Get the tagname of the element by using hyperlink text
		idElement=driver.findElement(By.linkText("Log In")).getTagName();
		System.out.println(idElement);
		//Close firefox
		driver.close();
		//Close the p
		System.exit(0);
	}

}
