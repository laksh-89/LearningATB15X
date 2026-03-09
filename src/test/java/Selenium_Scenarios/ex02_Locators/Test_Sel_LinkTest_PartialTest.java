package Selenium_Scenarios.ex02_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Sel_LinkTest_PartialTest {


    @Description("Verify that the create account negative TC")
    @Test
    public void test_login_vwo() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();


        //<a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="btn btn--link btn--primary Fw(medium)" target="_blank" rel="noreferrer"
        // data-qa="bericafeqo">
        // Start a free trial
        // </a>


//        WebElement a_Tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
//        a_Tag_free_trial_full_match.click();

        WebElement a_Tag_partial_match= driver.findElement(By.partialLinkText("trial"));
        a_Tag_partial_match.click();

        Thread.sleep(10000);

        driver.quit();


    }


}
