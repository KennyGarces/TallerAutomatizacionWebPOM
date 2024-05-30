package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class HomePage extends PageObject {
    By title = By.xpath("//*[text()=\'Manger Id : haiber2001\']");

    // Método para validar el título de la página
    public void validateTitle(String strTitle)
    {
        // Comprobación de que el título esperado sea igual al título real obtenido del elemento
        assertEquals("El valor que se espera es: " + strTitle +
                        "igual a " + Action.getElementText(getDriver(),title)
                , strTitle, Action.getElementText(getDriver(),title) );
    }

}