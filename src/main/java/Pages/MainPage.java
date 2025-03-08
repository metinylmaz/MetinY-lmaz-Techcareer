package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends BaseTest {
    @Step("Başarılı giriş")
    public String getAccount(){
        screenshot();
        return driver.findElement(By.id("UserName")).getText();
    }
@Step("Ürün Arama")
    public MainPage fillSearch(String text){

       driver.findElement(By.id("searchBar")).sendKeys(text, Keys.ENTER);
       driver.findElement(By.cssSelector("[onclick='AramaYap();']")).click();
        return this;
    }


}
