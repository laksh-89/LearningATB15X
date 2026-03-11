package Selenium_Scenarios.ex03_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mini_Project_Xpath {

    @Owner("Laksh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login Working")
    @Test
    public void test_OHRM_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement input_username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        input_username.sendKeys("admin");

        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        input_password.sendKeys("Hacker@4321");

        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();

        Thread.sleep(3000);

        WebElement h6 = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));
        Assert.assertEquals(h6.getText(), "PIM");


        driver.quit();

    }
}

