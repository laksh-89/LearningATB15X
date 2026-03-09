package Selenium_Scenarios.ex01_SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Selenium_a {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://w3schools.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();

    }
}
