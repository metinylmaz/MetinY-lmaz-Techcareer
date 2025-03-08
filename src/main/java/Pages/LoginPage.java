package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
public LoginPage fillEmail(String email){
    driver.findElement(By.id("EPosta")).sendKeys(email);
return this;
}

public LoginPage fillPassword (String password){
    driver.findElement(By.id("Sifre")).sendKeys(password);
    return this;
}
public LoginPage clickLoginButton(){
    driver.findElement(By.cssSelector("[class='btn btn-itopya btn-block my-3']")).click();
    return this;
}
public String getErrorMessage() {
    return " Hatalı kullanıcı adı/şifre girdiniz.";

}

}
