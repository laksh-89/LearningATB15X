package Selenium_Scenarios.ex01_SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium001 {
    public static void main(String[] args) {

        ChromeDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
