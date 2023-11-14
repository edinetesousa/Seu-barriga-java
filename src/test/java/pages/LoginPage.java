package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class LoginPage extends Hooks {
    public LoginPage(WebDriver navegador) {
        driver = navegador;
    }
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnClicar = By.cssSelector("button[type=submit]");
    private By mensagemErro = By.className("alert");

    public void preencherLogin(String email, String senha) {
        driver.findElement(campoEmail).sendKeys(email);
        driver.findElement(campoSenha).sendKeys(senha);
    }
    public void clicarBtnLogin() {
        driver.findElement(btnClicar).click();
    }
    public void validaPaginaLogin() {
        driver.get("https://seubarriga.wcaquino.me/login");
    }
    public void mensagemErro(String mensagem){
        String texto = driver.findElement(mensagemErro).getText();
        Assert.assertTrue(texto.contains(mensagem));
    }
}

