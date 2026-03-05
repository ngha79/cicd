package vn.poly.testcicd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class VitimexTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSearchProduct() throws InterruptedException {

        driver.get("https://vitimex.com.vn/");

        Thread.sleep(2000);

        // click icon search
        driver.findElement(By.className("h-search")).click();

        Thread.sleep(2000);

        // nhập từ khóa
        driver.findElement(By.name("q")).sendKeys("âu");

        // submit
        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        // kiểm tra URL có chứa search
        Assert.assertTrue(driver.getCurrentUrl().contains("search?q="));

        System.out.println("Tìm kiếm sản phẩm thành công");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}