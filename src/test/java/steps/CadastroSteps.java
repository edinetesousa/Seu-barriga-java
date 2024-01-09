package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroPage;
import support.Utils;

import static steps.Hooks.driver;

public class CadastroSteps extends Utils {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Dado("que o usuario esteja na tela de cadastro")
    public void que_o_usuario_esteja_na_tela_de_cadastro() {
        cadastroPage.clicarNoMenuNovoUsuario();
        Assert.assertEquals(cadastroPage.validaPageCadastro(), "https://seubarriga.wcaquino.me/cadastro");
    }
    @Quando("o usuario preencher os dados necessarios para o cadastro")
    public void o_usuario_preencher_os_dados_necessarios_para_o_cadastro() {
        cadastroPage.preencherCamposObrigatorios(getConta(), getRandomEmail(), "123456");
        cadastroPage.clicarBtnCadastrar();
    }

    @Quando("o usuario deixar o campo nome em branco")
    public void o_usuario_deixar_o_campo_nome_em_branco() {
        cadastroPage.preencherCamposObrigatorios("", "fulano@beltrano", "123456");
        cadastroPage.clicarBtnCadastrar();
    }

    @Entao("o sistema exibira a mensagem {string}")
    public void o_sistema_exibira_a_mensagem(String mensagem) {
        Assert.assertEquals(cadastroPage.validaMensagem(), mensagem);
    }

    @Quando("o usuario preencher o campo nome com um dado invalido")
    public void o_usuario_preencher_o_campo_nome_com_um_dado_invalido() {
        cadastroPage.preencherCamposObrigatorios("@asdf!", "a@a", "123");
        cadastroPage.clicarBtnCadastrar();

    }

    @Quando("o usuario deixar o campo e-mail em branco")
    public void o_usuario_deixar_o_campo_e_mail_em_branco() {
        cadastroPage.preencherCamposObrigatorios("Chaves", "", "123");
        cadastroPage.clicarBtnCadastrar();
    }

    @Quando("o usuario tentar realizar o cadastro com um email ja cadastrado")
    public void o_usuario_tentar_realizar_o_cadastro_com_um_email_ja_cadastrado() {
        cadastroPage.preencherCamposObrigatorios("Chaves1", "teste@teste", "123");
        cadastroPage.clicarBtnCadastrar();
    }

    @Quando("o usuario deixar o campo senha em branco")
    public void o_usuario_deixar_o_campo_senha_em_branco() {
        cadastroPage.preencherCamposObrigatorios("Chaves2", "email@email", "");
        cadastroPage.clicarBtnCadastrar();
    }
}