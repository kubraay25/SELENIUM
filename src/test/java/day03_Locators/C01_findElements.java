package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_findElements {

    /*
       webElement.getText( ); Web Element uzerindeki yaziyi getirir

       webElement.getAttribute(“Att.ismi” );  Ismi girilen attribute’un degerini getirir

       webElement.getTagName( ); Web elementin tag ismini getirir

       Not : Web element ile ilgili bu method’larin disinda size, istenen CSS ozelligi,
       Location,Rect.geometrik ozellikler, DOM degeri vb..
       Bir cok method vardir ama Automation Test icin  kullanmiyoruz

    */

    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasinda kaç tane link oldugunu konsolda yazdiralim
        driver.get("https://amazon.com");
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi = "+linklerListesi.size());
        //Linkleri yazdiralim
    }
}
