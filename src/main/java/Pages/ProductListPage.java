package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class ProductListPage extends BaseTest {

    public ProductListPage firstProductClick(){
        driver.findElements(By.cssSelector("[class='truncate-text']")).get(0).click();

        return this;
    }
public ProductListPage addFavouriteList(){
        driver.findElement(By.id("AlisverisListesineEkle")).click();
        sleep(3000);
        driver.findElement(By.id("dropdownMenu2")).click();
        driver.findElement(By.cssSelector("[href='/Listelerim']")).click();
        return this;
}
public ProductListPage addToCart(){
driver.findElement(By.cssSelector("[class='btn btn-main flex-center  rounded-5 mt-12 btn-detail-price sepeteEkle']")).click();
sleep(2000);
driver.findElement(By.cssSelector("[class='shopping-box']")).click();

        return this;
}

}
