package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;
import support.Utils;

public class CriarMovimentacaoPage extends Actions {

    public CriarMovimentacaoPage(WebDriver navegador) {
        driver = navegador;
    }

    private By btnCriarMovimentacao = By.cssSelector("a[href='/movimentacao']");
    private By campoTipoDaMovimentacao = By.cssSelector("#tipo > option ");
    private By campoDataDaMovimentacao = By.id("data_transacao");
    private By campoDataDoPagamento = By.id("data_pagamento");
    private By campoDescricao = By.id("descricao");
    private By campoInteressado = By.id("interessado");
    private By campoValor = By.id("valor");
    private By campoConta = By.id("conta");
    private By optionConta = By.cssSelector("#conta > option ");
    private By campoSituacao = By.id("status_pago");
    private By btnSalvar = By.cssSelector("button[type=submit]");
    private By messagem = By.className("alert");
    private By validarMensagensValor = By.cssSelector(".alert > ul > li ");

    public void clicarCriarMovimentacao() {
        click(btnCriarMovimentacao);
    }

    public void preencherDados1(String tipoMovimentacao, String dataMov, String dataPag, String descricao) {
        if (tipoMovimentacao == "Receita") {
            clickIndex(campoTipoDaMovimentacao, 0);
        }
        if (tipoMovimentacao == "Despesa") {
            clickIndex(campoTipoDaMovimentacao, 1);
        }

        set(campoDataDaMovimentacao, dataMov);
        set(campoDataDoPagamento, dataPag);
        set(campoDescricao, descricao);
    }

    public void preencherDados2(String interessado, String valor, String situacao) {
        set(campoInteressado, interessado);
        set(campoValor, valor);
//        click(campoConta);
        clickIndex(optionConta, 3);
        if (situacao == "Pago") {
            clickIndex(campoSituacao, 0);
        }
        if (situacao == "Pendente") {
            clickIndex(campoSituacao, 1);
        }

        click(btnSalvar);
    }

    public String validarMensagem() {
        return get_text(messagem);

    }
    public String validarMensagensValor1() {
        return getTextIndex(validarMensagensValor, 0);
    }
    public String validarMensagensValor2(){
        return getTextIndex(validarMensagensValor, 1);
    }
}
