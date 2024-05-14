package com.joshua;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindByElements {
    public static WebDriver driver;

    @Test
    public void findElements() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // navigasi url
        driver.get("https://jayjay.co");

        // find element
        driver.findElement(By.cssSelector("a.btn-main"));
        driver.findElement(By.xpath("/html/body/div[3]/section[6]/div/div/div/div/div[1]/h2"));
        driver.findElement(By.id("scrollableElement"));

        // method get url dan title
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        System.out.println("Url sekarang: " + url);
        System.out.println("Title nya: " + title);

        // isi field + klik button
        driver.findElement(By.id("name_input")).sendKeys("Joshua testing");
        driver.findElement(By.id("phone")).sendKeys("08241234123");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("label.active")).click();

        // navigate method
        driver.navigate().to("https://www.qubisa.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.jayjay.co");
        driver.navigate().back();
        driver.navigate().forward();

        driver.quit();
    }
}
