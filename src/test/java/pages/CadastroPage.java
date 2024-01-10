package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import support.Actions;

public class CadastroPage extends Actions {
    public CadastroPage(WebDriver navegador) {
        driver = navegador;
    }

    private By novoUsuario = By.cssSelector(".nav li a");
    private By campoNome = By.id("nome");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnCadastrar = By.className("btn");
    private By validaMessagem = By.className("alert");

    public void clicarNoMenuNovoUsuario() {
        driver.findElements(novoUsuario).get(1).click();

    }

    public String validaPageCadastro(){
        return get_url();
    }

    public void preencherCamposObrigatorios(String nome, String email, String senha) {
        set(campoNome, nome);
        set(campoEmail, email);
        set(campoSenha, senha);
    }

    public void clicarBtnCadastrar() {
        click(btnCadastrar);
    }

    public String validaMensagem() {
        return get_text(validaMessagem);

    }
}
=======
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
>>>>>>> 76b2fb3d8761801e34b05f901ffadc9f8dc8c284
