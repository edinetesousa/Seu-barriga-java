package steps;

import io.cucumber.java.pt.Dado;
<<<<<<< HEAD
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
=======
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
public class CadastroSteps {

    CadastroSteps cadastroSteps = new CadastroSteps(Hooks.driver);
    HomePage homeSteps = new HomePage(Hooks.driver);
    CadastroSteps validaPaginaCadastro = new CadastroSteps();

    @Dado("que o usuario acesse o site")
    public void que_o_usuario_acesse_o_site() {
        cadastroSteps.que_o_usuario_acesse_o_site();
    }
    @Quando("clicar no botao Novo Usuário")
    public void clicar_no_botao_novo_usuário() {
        cadastroSteps.clicar_no_botao_novo_usuário();
    }

    @E("preencher os campos nome {string}, email {string} e senha {string}")
    public void preencher_os_campos_nome_email_e_senha(String nome, String email, String senha) {
        cadastroSteps.preencher_os_campos_nome_email_e_senha(nome, email, senha);
    }

    @E("clicar no botao Cadastrar")
    public void clicar_no_botao_Cadastrar(){
        cadastroSteps.clicar_no_botao_Cadastrar();
    }

    @Entao("o sistema mostrara a mensagem {string}")
    public void o_sistema_mostrara_a_mensagem(String mensagem) {
        validaPaginaCadastro.o_sistema_mostrara_a_mensagem(mensagem);
>>>>>>> 76b2fb3d8761801e34b05f901ffadc9f8dc8c284
    }
}