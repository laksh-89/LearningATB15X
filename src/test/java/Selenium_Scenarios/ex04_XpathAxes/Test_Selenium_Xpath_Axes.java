package Selenium_Scenarios.ex04_XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Test_Selenium_Xpath_Axes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/xpath/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"Mammal\"]/preceding-sibling::div"));
        elements.get(0).click();
    }
}
