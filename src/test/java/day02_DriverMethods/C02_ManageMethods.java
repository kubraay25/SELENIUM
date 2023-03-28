package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;
import java.time.Duration;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        //bir yeri kopyaladigimizda "//"yaptiktan sonra yapistirirsak o satirlarin hepsini yoruma alir

        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        //hemen asagida browser'imizi actik
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        //pencereyi yonet maksimize et
        driver.manage().window().maximize();

        //zamani yonet ve 20 saniye beklet
        //not:Sayfadaki her bir webelement için max 20 saniye bekler
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actulaTitle =driver.getTitle();//gercek baslik
        String expectedTitle = "youtube";//beklenen başlık
        if(actulaTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FALLED Gercek Baslik : "+actulaTitle);

        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";
        if (actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+actualUrl);

        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        Thread.sleep(2000);

        //Youtube sayfasina geri donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Amazon sayfasina donun
        driver.navigate().forward();

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actuallTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actuallTitle.contains(istenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Başlık = "+actuallTitle);

        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String gercekUrl = driver.getCurrentUrl();
        String istenenUrl = "https://www.amazon.com/";
        if (gercekUrl.equals(istenenUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+gercekUrl);

        //Sayfayi kapatin
        driver.close();
    }
}

