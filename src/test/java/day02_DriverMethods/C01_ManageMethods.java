
package day02_DriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class C01_ManageMethods {

    /* driver.manage().window().maximize(); Browseri maximize yapar
       driver.manage().window().minimize(); Browseri minimize yapar
       driver.manage().window().fullscreen(); Browseri full screen yapar
       driver.manage().window().getPosition(); Browserin koordinatlarini verir
       driver.manage().window().getSize(); Browsein olculerini verir
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();//açılan browser'i maximize yapar
        driver.get("https://techproeducation.com");

        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().minimize();//sayfayı aşağıya indirir
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());

        /* driver.manage( ).window( ).setPosition(new Point ( x:80 , y:0 ) ) ;
           Browser’i  istenen koordinata tasir

           driver.manage( ).window( ).setSize(new Dimension( 800 , 600 ));
           Browser’i  istenen olculere getirir.

           driver.manage( ).timeouts( ).implicitlyWait(Duration.ofSeconds(10));
           Istenen sayfa acilincaya kadar maximum bekleme suresini belirtir

           driver.close( ); sadece calisilan browser'i kapatir
           driver.quit( );  acik olan tum browser'lari kapatir

         */

        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size a getirir














    }
}
