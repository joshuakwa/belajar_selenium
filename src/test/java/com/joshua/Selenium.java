package com.joshua;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selenium {
    public static WebDriver driver;

    @Test
    public void helloJayjay() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // navigasi url
        driver.get("https://jayjay.co");

        String text = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Belajar dari para ahli terbaik\n" +
                "berdasarkan program Eropa", text);

        String text2 = driver.findElement(By.className("section-title")).getText();
        assertEquals("Manfaat belajar dengan JayJay", text2);


        Thread.sleep(2000);
        driver.quit();
    }
}
