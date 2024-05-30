package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OverviewPage extends PageObject {
    // Localizadores de elementos para el enlace "Accounts Overview" y la tabla de cuentas
    By accountsOverviewLink = By.linkText("Accounts Overview");
    By accountsTable = By.id("accountTable");

    // Método para navegar a la vista general de cuentas
    public void navigateToAccountsOverview() {
        // Hacer clic en el enlace "Accounts Overview"
        Action.clicElement(getDriver(), accountsOverviewLink);
    }

    // Método para verificar si una cuenta está siendo mostrada en la tabla de cuentas
    public boolean isAccountDisplayed(String accountId) {
        // Verificar si el texto de la tabla de cuentas contiene el ID de la cuenta
        return Action.getElementText(getDriver(), accountsTable).contains(accountId);
    }
}