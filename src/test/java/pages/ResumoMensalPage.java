package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class ResumoMensalPage extends Actions {

    public ResumoMensalPage(WebDriver navegador) {
        driver = navegador;
    }

    private By campo_Mes = By.cssSelector("#mes > option");
    private By campo_Ano = By.cssSelector("#ano > option");
    private By btn_Buscar = By.cssSelector("input[type=submit]");
    private By informacoes_Grid = By.cssSelector("#tabelaExtrato > tbody > tr > td");

    public void preencherDados() {
        clickIndex(campo_Mes, 8);
        clickIndex(campo_Ano, 13);
    }

    public void click_BtnBuscar() {
        click(btn_Buscar);
    }

    public String validaGrid() {
        return getTextIndex(informacoes_Grid, 0);
    }

    public void pesquisaDadosVazios() {
        clickIndex(campo_Mes, 2);
        clickIndex(campo_Ano, 0);
    }

    public boolean validaGridVazio() {
        waitElementsVisible(informacoes_Grid, 5000);
        return false;
    }
}

