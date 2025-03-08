import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.ProductListPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ProductListPage productListPage = new ProductListPage();

    @Test(description = "Sepete Urun Ekeleme")
    public void addToCartTest() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLoginButton();
        sleep(3000);
        mainPage.fillSearch("MSI Notebook");
        productListPage.firstProductClick();
        productListPage.addToCart();

    }


}
