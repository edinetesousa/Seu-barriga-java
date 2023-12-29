package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
