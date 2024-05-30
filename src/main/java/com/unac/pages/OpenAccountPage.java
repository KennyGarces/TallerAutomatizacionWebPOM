package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpenAccountPage extends PageObject {
    // Localizadores de elementos para enlaces, menú desplegable, botón y ID de nueva cuenta
    By openNewAccountLink = By.linkText("Open New Account");
    By accountTypeDropdown = By.id("type");
    By openNewAccountButton = By.xpath("//input[@value='Open New Account']");
    By newAccountId = By.id("newAccountId");

    // Método para abrir una nueva cuenta
    public void openNewAccount() {
        // Hacer clic en el enlace "Open New Account", el menú desplegable de tipo de cuenta y el botón "Open New Account"
        Action.clicElement(getDriver(), openNewAccountLink);
        Action.clicElement(getDriver(), accountTypeDropdown);
        Action.clicElement(getDriver(), openNewAccountButton);
    }

    // Método para obtener el ID de la nueva cuenta
    public String getNewAccountId() {
        // Obtener y devolver el texto del elemento que contiene el ID de la nueva cuenta
        return Action.getElementText(getDriver(), newAccountId);
    }
}