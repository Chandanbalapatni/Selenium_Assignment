/* QUESTION 5
----------
URL : http://www.greenstechnologys.com/index.html

NOTE: Print the address of OMR branch.
 */

package org.dy4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		List<WebElement> omr = driver.findElements(By.xpath("//div[@class='trainer-info'][2]"));
		for (WebElement add : omr) {
			System.out.println(add.getText());
		}
	}

}
