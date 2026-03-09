package Selenium_Scenarios.ex02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_app_vwo {

    @Test
    public void test_app_vwo_com() throws InterruptedException {
        //Driver Managing
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Locators
        // Step 2- Find the password & enter the 12345
        // Step 3- Find the submit & click on the button
        // Step 4- wait some time
        // Step 5- verify the message error


        // Step 1- Find the email id &  enter the admin@admin.com
        // <input open tag
        // <input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // > close tag

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");


        // Step 2- Find the password & enter the 12345
        // <input type="password"
        // class="text-input W(100%)
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345");


        // Step 3- Find the submit & click on the button
        //<button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) Mb(24px) Mb(0):lc"
        // onclick="login.login(event)"
        // data-qa="sibequkica"

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        // Step 4- wait some time
        Thread.sleep(5000);


        // Step 5- verify the message error
        // <div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());


        //Assertions
        // error_message - AR
        // "Your email, password, IP address or location did not match" - ER
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match" );

        driver.quit();
    }
}
