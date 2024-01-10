package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jdk.jshell.execution.Util;
import org.junit.Assert;
import pages.CriarMovimentacaoPage;
import pages.HomePage;
import pages.LoginPage;
import support.Utils;

import static steps.Hooks.driver;

public class MovimentacaoSteps extends Utils {

    CriarMovimentacaoPage movimentacao = new CriarMovimentacaoPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Dado("que o usuario esta logado no sistema e acesse o menu de Criar Movimentacao")
    public void que_o_usuario_esta_logado_no_sistema_e_acesse_o_menu_de_Criar_Movimentacao() {
        loginPage.validaPaginaLogin();
        loginPage.preencherLogin("teste@teste.com", "123456");
        loginPage.clicarBtnLogin();
        Assert.assertEquals(loginPage.mensagemErro(), "Bem vindo, thiago!");
        movimentacao.clicarCriarMovimentacao();
    }

    @Quando("o usuario preencher todos os campos corretamente")
    public void o_usuario_preencher_todos_os_campos_corretamente() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "26/08/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "850", "Pago");
    }

    @Entao("o sistema exibira a mensagem")
    public void o_sistema_exibira_a_mensagem(String mensagem) {
        Assert.assertEquals(movimentacao.validarMensagem(), mensagem);

    }

    @Quando("o usuario deixar o campo Descricao vazio e demais campos preenchidos corretamente")
    public void o_usuario_deixar_o_campo_descricao_vazio_e_demais_campos_preenchidos_corretamente() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "26/08/2023", "");
        movimentacao.preencherDados2("Sr. Barriga", "850", "Pago");
    }

    @Quando("o usuario deixar o campo Interessado vazio e demais campos preenchidos corretamente")
    public void o_usuario_deixar_o_campo_interessado_vazio_e_demais_campos_preenchidos_corretamente() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "26/08/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("", "850", "Pago");

    }

    @Quando("o usuario deixar o campo Valor vazio e demais campos preenchidos corretamente")
    public void o_usuario_deixar_o_campo_valor_vazio_e_demais_campos_preenchidos_corretamente() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "26/08/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "", "Pago");
    }

    @Entao("o sistema exibira as mensagens {string} e {string}")
    public void o_sistema_exibira_as_mensagens_e(String mensagem1, String mensagem2) {
        Assert.assertEquals(movimentacao.validarMensagensValor1(), mensagem1);
        Assert.assertEquals(movimentacao.validarMensagensValor2(), mensagem2);
    }

    @Quando("o usuario inserir um dado invalido no campo Valor e demais campos corretamente")
    public void o_usuario_inserir_um_dado_invalido_no_campo_valor_e_demais_campos_corretamente() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "26/08/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "$", "Pago");
    }

    @Quando("o usuario deixar a data movimentacao vazio e demais campos preenchidos corretamente")
    public void o_usuario_deixar_a_data_movimentacao_vazio_e_demais_campos_preenchidos_corretamente() {
        movimentacao.preencherDados1("Receita", "", "26/08/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "850", "Pago");
    }

    @Quando("o usuario deixar a data de pagamento vazia e demais campos preenchidos corretamente")
    public void o_usuario_deixar_a_data_de_pagamento_vazia_e_demais_campos_preenchidos_corretamente() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "850", "Pago");
    }

    @Quando("o usuario inserir a data de movimentacao posterior a data de pagamento")
    public void o_usuario_inserir_a_data_de_movimentacao_posterior_a_data_de_pagamento() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "19/09/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "850", "Pago");
    }

    @Quando("o usuario inserir a data da movimentação igual a data do pagamento")
    public void o_usuario_inserir_a_data_da_movimentação_igual_a_data_do_pagamento() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "25/08/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "850", "Pago");
    }
    @Quando("o usuario preencher o campo Descricao apenas com um caractere especial e os demais corretamente")
    public void o_usuario_preencher_o_campo_descricao_apenas_com_um_caractere_especial_e_os_demais_corretamente() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "25/08/2023", "@#$%&");
        movimentacao.preencherDados2("Sr. Barriga", "850", "Pago");
    }

    @Quando("o usuario preencher o campo valor contendo caractere especial")
    public void o_usuario_preencher_o_campo_valor_contendo_caractere_especial() {
        movimentacao.preencherDados1("Receita", "25/08/2023", "26/08/2023", "Aluguel do sr. Madruga");
        movimentacao.preencherDados2("Sr. Barriga", "$850", "Pago");
    }

}

