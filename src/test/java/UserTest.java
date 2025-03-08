import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    public void loginSuccesful() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLoginButton();
        sleep(5000);

        Assert.assertEquals(mainPage.getAccount(), adsoyad);
    }

    @Test
    public void loginUnSuccesful() throws InterruptedException {
        loginPage.fillEmail(email)
                .fillPassword(hatalipassword)
                .clickLoginButton();
        sleep(5000);
        Assert.assertEquals(loginPage.getErrorMessage()," Hatalı kullanıcı adı/şifre girdiniz.");
    }




}

