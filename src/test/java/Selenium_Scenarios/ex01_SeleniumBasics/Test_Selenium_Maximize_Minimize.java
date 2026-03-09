package Selenium_Scenarios.ex01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Selenium_Maximize_Minimize {
    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();
        driver.get("https://w3schools.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();

        driver.quit();
    }
}
