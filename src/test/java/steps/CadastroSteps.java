package steps;

import io.cucumber.java.pt.Dado;
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
    }
}