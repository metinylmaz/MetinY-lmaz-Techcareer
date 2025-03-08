package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
    @Step("Eposta alanına veri girisi saglanır")
public LoginPage fillEmail(String email){
    driver.findElement(By.id("EPosta")).sendKeys(email);
return this;
}
@Step("Sifre alanına veri girisi saglanır")
public LoginPage fillPassword (String password){
    driver.findElement(By.id("Sifre")).sendKeys(password);
    return this;
}
@Step("Giris yap butonuna tıklanır")
public LoginPage clickLoginButton(){
    driver.findElement(By.cssSelector("[class='btn btn-itopya btn-block my-3']")).click();
    return this;
}
@Step("Hata mesajı alınır.")
public String getErrorMessage() {
    return " Hatalı kullanıcı adı/şifre girdiniz.";

}

}
