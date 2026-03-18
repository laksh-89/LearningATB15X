package Selenium_Scenarios.ex05_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_task_2nd_march {

    @Description
    @Test
    public void test_delete_terminated() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Hacker@4321");

        WebElement click = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        click.click();

        Thread.sleep(3000);

        WebElement emp_list = driver.findElement(By.xpath("//a[contains(text(), 'Employee List')]"));

       List <WebElement> terminated_emp = driver.findElements(By.xpath("//div[@role='row']/div[@role='cell']/div[text()='Terminated']"));

        WebElement dlt_button = driver.findElement(By.xpath("//div[@role='row']/div[@role='cell']/div[text()='Terminated'][1]/ancestor::div[@role='row']/div[9]/div/button[@type='button']/i[@class=\"oxd-icon bi-trash\"][1]"));

        dlt_button.click();




    }
}
