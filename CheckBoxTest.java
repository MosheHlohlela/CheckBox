package dropdownlessons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {
    public static void main(String[] args) throws InterruptedException {
    	
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println( driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
       
    }
}
