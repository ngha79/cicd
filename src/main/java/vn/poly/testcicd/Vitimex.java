package vn.poly.testcicd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vitimex {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://vitimex.com.vn/");

        // Bấm icon search
        driver.findElement(By.className("h-search")).click();

        Thread.sleep(2000);

        // Nhập từ khóa
        driver.findElement(By.name("q")).sendKeys("âu");

        // submit
        driver.findElement(By.name("q")).submit();
    }
}