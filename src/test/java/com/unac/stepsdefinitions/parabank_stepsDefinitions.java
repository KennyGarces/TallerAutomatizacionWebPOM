package com.unac.stepsdefinitions;

import com.unac.pages.RegisterPage;
import com.unac.pages.OpenAccountPage;
import com.unac.pages.OverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parabank_stepsDefinitions {

    RegisterPage registerPage;
    OpenAccountPage openAccountPage;
    OverviewPage accountsOverviewPage;

    String newAccountId;

    @Given("iniciar la pagina de registro de parabank {string}")
    public void iniciarLaPaginaDeRegistroDeParabank(String url) {
        registerPage.openAt(url);
    }

    @When("registro usuario con los datos: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void registroUsuarioConLosDatos(String fname, String lname, String str, String cty, String st, String zip, String phone, String ssn, String uname, String pwd) {
        registerPage.register(fname, lname, str, cty, st, zip, phone, ssn, uname, pwd);
    }

    @When("nueva cuenta {string}")
    public void nuevaCuenta(String accountType) {
        openAccountPage.openNewAccount();
        newAccountId = openAccountPage.getNewAccountId();
    }

    @Then("valido que la cuenta exista")
    public void validoQueLaCuentaExista() {
        accountsOverviewPage.navigateToAccountsOverview();
        assert accountsOverviewPage.isAccountDisplayed(newAccountId);
    }
}
