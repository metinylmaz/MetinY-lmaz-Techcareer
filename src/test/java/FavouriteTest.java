import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.ProductListPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FavouriteTest extends BaseTest {

    LoginPage loginPage= new LoginPage();
    MainPage mainPage=new MainPage();
    ProductListPage productListPage=new ProductListPage();
    @Test
    public void favouriteTest(){

        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLoginButton();
        sleep(5000);
        mainPage.fillSearch("ASUS Kulaklık");
    productListPage.firstProductClick();
    productListPage.addFavouriteList();


    }



}
