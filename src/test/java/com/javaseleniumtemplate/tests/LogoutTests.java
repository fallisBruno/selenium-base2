package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class LogoutTests extends TestBase {

    LoginFlows loginFlows;
    MyViewPage myViewPage;

    @Test
    public void efetuarLogoutComSucesso() {

        loginFlows = new LoginFlows();
        myViewPage = new MyViewPage();
        loginFlows.efetuarLogin(GlobalParameters.USUARIO, GlobalParameters.SENHA);

        myViewPage.clicarEmUserInfo();
        myViewPage.clicarEmSair();

        String urlLogin = "https://mantis-prova.base2.com.br/login_page.php";
        String urlAtual = myViewPage.getURL();

        Assert.assertEquals(urlLogin, urlAtual);
    }
}
