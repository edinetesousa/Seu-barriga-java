package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class CadastroPage {
    public CadastroPage(WebDriver navegador) {Hooks.driver=navegador;}

    private By btnNovoUsuario = By.xpath ("//*[@id=bs-example-navbar-collapse-1]/ul/li[2]/a");

    private By campoNome = By.id("nome");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnCadastrar = By.cssSelector("btn btn-primary");

    private By mensagem = By.cssSelector("alert alert-success");
    public void validaPaginaCadastro() {
        Hooks.driver.get("https://seubarriga.wcaquino.me/cadastro");
 }
    public void preencherCadastro(String nome, String email, String senha) {
        Hooks.driver.findElement(campoNome).sendKeys(nome);
        Hooks.driver.findElement(campoEmail).sendKeys(email);
        Hooks.driver.findElement(campoSenha).sendKeys(senha);
}
    public void clicarBtnCadastrar() {
        Hooks.driver.findElement(btnCadastrar).click();

    }
    public void validarCadastro() {
        Hooks.driver.findElements(mensagem);
}
}