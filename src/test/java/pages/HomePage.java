package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class HomePage extends Hooks {

    public HomePage(WebDriver navegador) {
        driver = navegador;
    }

    private By validaHome = By.className("alert");

    public void validaHome(String mensagem) {
        String texto = driver.findElement(validaHome).getText();
        Assert.assertTrue(texto.contains(mensagem));
        Assert.assertEquals(texto, mensagem);
    }
}