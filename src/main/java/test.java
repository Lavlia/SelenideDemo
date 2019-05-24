import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
public class test {
    @Test
    public void test1(){
        open("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        $(By.xpath("//input[@name='txtUsername']")).setValue("Admin");
        $(By.xpath("//input[@name='txtPassword']")).setValue("admin123");
        $(By.xpath("//input[@name='Submit']")).click();
        $(By.xpath("//a[@id='welcome']")).shouldHave(Condition.matchesText("Welcome Admin"));
        $(By.xpath("//a[@id='welcome']")).click();
        $(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
    }
}

