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

public class HomePage {
    public static WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://cyberbangla.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2200);");
    }
    @Test(priority = 0,enabled = false)
    public void VAT()
    {
        WebElement moreDetailsVAPT = driver.findElement(By.cssSelector("a[href='https://cyberbangla.org/our-services/vapt/']"));
        moreDetailsVAPT.click();
    }

    @Test(priority = 1)
    public void DigitalForensics()
    {
        WebElement moreDetailsForensics = driver.findElement(By.cssSelector("a[href='https://cyberbangla.org/our-services/digital-forensic-and-data-recovery/']"));
        moreDetailsForensics.click();

    }
   @Test(priority = 2)
   public void MalwareAnalysis()
   {
       WebElement moreDetailsMalware = driver.findElement(By.xpath("//a[@href='https://cyberbangla.org/our-services/malware-analysis/']"));
       moreDetailsMalware.click();
   }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        driver.navigate().refresh();
        driver.quit();
    }
}
