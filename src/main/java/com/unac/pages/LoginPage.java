package com.unac.pages;


import com.unac.actions.Action;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class LoginPage extends PageObject {
    // Localizadores de elementos para el nombre de usuario, contraseña y botón de inicio de sesión
    By userName = By.name("uid");
    By password = By.name("password");
    By btnLogin = By.name("btnLogin");

    // Método para navegar a una URL específica
    public void navegateTo(String url)
    {
        Action.navegateUrl(getDriver(), url);
    }

    // Método para realizar el inicio de sesión
    public void login(String strUserName, String strPassword)
    {
        // Ingresar el nombre de usuario y contraseña, y hacer clic en el botón de inicio de sesión
        Action.sendData(getDriver(), userName, strUserName);
        Action.sendData(getDriver(), password, strPassword);
        Action.clicElement(getDriver(), btnLogin);
    }
}