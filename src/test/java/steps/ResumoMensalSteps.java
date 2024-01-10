package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;
import pages.ResumoMensalPage;
import support.Utils;

import static steps.Hooks.driver;

public class ResumoMensalSteps extends Utils {
    HomePage homePage = new HomePage(driver);
    ResumoMensalPage resumo = new ResumoMensalPage(driver);

    @Dado("que o usuario clique na opcao Resumo Mensal")
    public void que_o_usuario_clique_na_opcao_resumo_mensal() {
        homePage.clickBtnResumoMensal();

    }

    @Quando("o usuario consultar as movimentacoes")
    public void o_usuario_consultar_as_movimentacoes() {
        resumo.preencherDados();
        resumo.click_BtnBuscar();
    }
    @Quando("o usuario consultar as movimentacoes de um mes e ano sem movimentacao")
    public void o_usuario_consultar_as_movimentacoes_de_um_mes_e_ano_sem_movimentacao() {
        resumo.pesquisaDadosVazios();
        resumo.click_BtnBuscar();
    }

    @Então("o sistema exibira as movimentacoes pesquisadas")
    public void o_sistema_exibira_as_movimentacoes_pesquisadas() {
       Assert.assertEquals(resumo.validaGrid(), "Aluguel do sr. Madruga");
    }

    @Então("o sistema exibira o grid vazio")
    public void o_sistema_exibira_o_grid_vazio() {
        Assert.assertFalse(resumo.validaGridVazio());
    }
}
