package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03_NavigateMethods {

    /* driver.navigate().to(String url): String olarak girilen url ye gider
       driver.navigate().back(); icinde olunan sayfadan, geldigi onceki sayfaya dondurur
       driver.navigate().forwaard(); back ile donulen bir sayfadan tekrar ileri gider
       driver.navigate().refresh(); icinde olunan sayfayi yeniler
     */

    public static void main(String[] args) throws InterruptedException {

        //herzaman once sistem ayarlarimi yaparim
        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000);//Java kodlarını bekletmek için kullanırız(3 saniye bekletir)

        //Sonra techproeducation sayfasına gidelim
        //navigate methodlarini bir sayfada ileri gerigitmrk icin kullaniriz
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı şekilde çalışır
        Thread.sleep(3000);

        //techpro sayfa başlığını konsola yazdıralım
        System.out.println("Sayfa Başlığı : " + driver.getTitle());

        //tekrar amazon sayfasına geri dönelim
        driver.navigate().back();//ilk sayfaya döner
        Thread.sleep(3000);

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Sayfa Başlığı : " + driver.getTitle());

        //tekrar techpro sayfasına geri gidelim
        driver.navigate().forward();

        //son olarak sayfayı yenileyelim ve sayfayı kapatalım
        driver.navigate().refresh();//sayfayı yeniler
        driver.close();//driver'i kapatır
        //NOT: Sayfalar arası geçişler hızlı olacağından 3 saniye geçişler için bekletelim

    }
}