package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    //Import selenium webdriver
    private WebDriver driver;
    //Import chromedriver
    public void setUp()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Get the URL
        driver.get("https://identity.getpostman.com/login?continue=https%3A%2F%2Fgo.postman.co%2Fbuild&_ga=2.128298181.834342240.1601043937-2064772897.1599731192");
        //Page wait for loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize page
        driver.manage().window().maximize();
        //Get page title
        System.out.println(driver.getTitle());
        //Get username
        driver.findElement(By.id("username")).sendKeys("osarenrenebuwa@gmail.com");
        //Get password
        driver.findElement(By.id("password")).sendKeys("babasemiloremason01");
        //Get sign in button
        driver.findElement(By.id("sign-in-btn")).click();
        //Wait
        Thread.sleep(10000);
        //Close window
        driver.quit();

    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }


}
