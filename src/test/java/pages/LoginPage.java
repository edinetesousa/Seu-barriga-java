package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class LoginPage {
    public LoginPage(WebDriver navegador) {
        Hooks.driver = navegador;
    }

    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnClicar = By.cssSelector("button[type=submit]");

    public void preencherLogin(String email, String senha) {
        Hooks.driver.findElement(campoEmail).sendKeys(email);
        Hooks.driver.findElement(campoSenha).sendKeys(senha);
    }
    public void clicarBtnLogin() {
        Hooks.driver.findElement(btnClicar).click();
    }
    public void validaPaginaLogin() {
        Hooks.driver.get("https://seubarriga.wcaquino.me/login");
    }
}

