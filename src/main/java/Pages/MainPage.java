package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends BaseTest {
    public String getAccount(){
        return driver.findElement(By.id("UserName")).getText();
    }

    public MainPage fillSearch(String text){

       driver.findElement(By.id("searchBar")).sendKeys(text, Keys.ENTER);
       driver.findElement(By.cssSelector("[onclick='AramaYap();']")).click();
        return this;
    }


}
