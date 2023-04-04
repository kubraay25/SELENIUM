package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.amazon.com");
//Sayfa başlığını konsola yazdırınız
        System.out.println(driver.getTitle());
//Sayfanın Url'ini yazdırınız
        System.out.println(driver.getCurrentUrl());
//Sonra techproeducation sayfasına gidiniz
        driver.get("https://techproeducation.com");
//techproeducation'in sayfa baslığı ve url'ini yazdırınız
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
//Sayfanın windowHandle değerini yazdırınız
        System.out.println(driver.getWindowHandle());

    }

}
