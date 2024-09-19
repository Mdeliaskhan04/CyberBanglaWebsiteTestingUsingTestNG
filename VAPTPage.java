package CyberBanglaTestNG_WebProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VAPTPage {
    public static WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://cyberbangla.org/our-services/vapt/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test(priority = 0)
    public void pageTitle()
    {
        String actualPageTitle=driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle="VAPT - Cyber Bangla";
        System.out.println(expectedPageTitle);
        if(actualPageTitle.contentEquals(expectedPageTitle))
        {
            System.out.println("Passed!!");
        }
        else {
            System.out.println("Failed!!");
        }
    }

    @Test(priority = 1)
    public void notes()
    {
        WebElement note1=driver.findElement(By.xpath("//button[@aria-controls='collapse1']"));
        note1.click();
        note1.click();
        WebElement note2=driver.findElement(By.xpath("//button[@aria-controls='collapse2']"));
        note2.click();

        WebElement note3=driver.findElement(By.xpath("//button[@aria-controls='collapse3']"));
        note3.click();
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        driver.navigate().refresh();
        driver.quit();
    }
}
