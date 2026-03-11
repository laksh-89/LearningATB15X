package Selenium_Scenarios.ex03_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mini_Project_TTA_Bank {
    @Owner("Laksh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Transfer amount $5000")
    @Test
    public void TTA_Bank() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement user_signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        user_signup.click();

        WebElement enter_username = driver.findElement(By.xpath("//input[@type='text']"));
        enter_username.sendKeys("LakshV");

        WebElement enter_email = driver.findElement(By.xpath("//input[@type='email']"));
        enter_email.sendKeys("lakshv@ttabank.com");

        WebElement enter_password = driver.findElement(By.xpath("//input[@type='password']"));
        enter_password.sendKeys("Coder@43210");

        WebElement click_signup = driver.findElement(By.xpath("//button[@type='submit']"));
        click_signup.click();

        Thread.sleep(2000);

        WebElement Fund_Transfer = driver.findElement(By.xpath("//button[text()='Transfer Funds']"));
        Fund_Transfer.click();

        WebElement enter_Amount = driver.findElement(By.xpath("//input[@type='number']"));
        enter_Amount.sendKeys("5000");

        WebElement enter_Note = driver.findElement(By.xpath("//input[@type='text']"));
        enter_Note.sendKeys("Rent");

        WebElement click_continue = driver.findElement(By.xpath("//button[text()='Continue']"));
        click_continue.click();

        WebElement confirm_transfer = driver.findElement(By.xpath("//button[text()='Confirm Transfer']"));
        confirm_transfer.click();

        WebElement click_dashboard = driver.findElement(By.xpath("//button[text()='Dashboard']"));
        click_dashboard.click();

        Thread.sleep(5000);

        driver.quit();

    }
}
