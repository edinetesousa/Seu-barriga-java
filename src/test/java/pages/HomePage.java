package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class HomePage {
    public HomePage(WebDriver navegador) {
        Hooks.driver = navegador;
    }
    private By validaHome = By.className("class=\"alert alert-success\"");

    public void validaHome(String mensagem){
        String texto = Hooks.driver.findElement(validaHome).getText();
        Assert.assertEquals(texto, mensagem);
        System.out.println(texto);
    }


}
