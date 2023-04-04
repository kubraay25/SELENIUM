package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("edgeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver =new EdgeDriver();

//amazon sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(4000);
//Sonra techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(4000);
//techpro sayfa başlığını konsola yazdıralım
        System.out.println(driver.getTitle());
//tekrar amazon sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(4000);
//Amazon sayfasının başlığını yazdıralım
        System.out.println( driver.getTitle());

//tekrar techpro sayfasına geri gidelim
        driver.navigate().forward();
        Thread.sleep(4000);
//son olarak sayfayı yenileyelim ve sayfayı kapatalım
        driver.navigate().refresh();
        driver.close();

    }
}