import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class deneme {

    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/drivers/chromedriver.exe");
        System.out.println(System.getProperty("edgeDriver"));
        WebDriver driver=new EdgeDriver();
        driver.get("https://techproeducation.com");
        driver.getTitle();
    }
}
