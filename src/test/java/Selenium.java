import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selenium {

    @Test
    public void helloJayjay(){
        // inisialisasi browser driver
        WebDriver driver = WebDriverManager.chromedriver().create();

        // navigasi url
        driver.get("https://jayjay.co");

        // get element attribute
        String text = driver.findElement(By.className("first-course")).getText();

        // assertion
        assertEquals("Gebrakan Kursus Online yang Siap Meroketkan Kariermu", text);
    }
}
