package week3.day2.assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioShopping {
//	    1. Launch the URL https://www.ajio.com/
//		2. In the search box, type as "bags" and press enter
//		3. To the left  of the screen under " Gender" click the "Men"
//		4. Under "Category" click "Fashion Bags"
//		5. Print the count of the items Found. 
//		6. Get the list of brand of the products displayed in the page and print the list.
//		7. Get the list of names of the bags and print it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//1. Launch the URL https://www.ajio.com/
driver.get("https://www.ajio.com/");

//2. In the search box, type as "bags" and press enter
driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);

//3. To the left  of the screen under " Gender" click the "Men"
driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[1]")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//4. Under "Category" click "Fashion Bags"
driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//5. Print the count of the items Found. 
String itemsCount=driver.findElement(By.xpath("//div[@class='length']")).getText();
System.out.println("Number of items found by the search is: " +itemsCount);

//6. Get the list of brand of the products displayed in the page and print the list.
List<WebElement> prodlist1 = driver.findElements(By.xpath("(//div[@class='plp-view'])//div[@class='brand']"));

System.out.println("Number of brand of the products displayed in the page : " + prodlist1.size());
System.out.println("Brands list of the product: ");
for (WebElement webElement : prodlist1) {
    String name = webElement.getText();
    System.out.println(name);
}

//Get the list of names of the bags and print it
		List<WebElement> bagName=driver.findElements(By.className("name"));
		System.out.println("Total number of bags :" + bagName.size());
		System.out.println(" Names of Bags available in the page:");
		for (WebElement webElement : bagName) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}
