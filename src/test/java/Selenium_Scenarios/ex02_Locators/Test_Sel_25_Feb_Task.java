package Selenium_Scenarios.ex02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Sel_25_Feb_Task {

    @Test
    public void test_selenium_task() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        //<a
        // id="btn-make-appointment"
        // class="btn btn-dark btn-lg">Make Appointment</a>

        WebElement make_appointment_click = driver.findElement(By.id("btn-make-appointment"));
        make_appointment_click.click();

        //<input
        // type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"

        WebElement user_name_enter = driver.findElement(By.name("username"));
        user_name_enter.sendKeys("John Doe");

        //<input
        // type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"

        WebElement user_password_enter = driver.findElement(By.id("txt-password"));
        user_password_enter.sendKeys("ThisIsNotAPassword");

        //<button
        // id="btn-login"
        // type="submit"
        // class="btn btn-default">Login</button>

        WebElement user_login_click = driver.findElement(By.id("btn-login"));
        user_login_click.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
