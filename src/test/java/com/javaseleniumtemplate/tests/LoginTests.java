package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    MyViewPage myViewPage;

    //Tests
    @Test
    public void efetuarLoginEmailInvalido(){

        //Objects instances
        loginPage = new LoginPage();
        myViewPage = new MyViewPage();

        //Parameteres
        String usuario = GlobalParameters.USUARIO;
        String senha = GlobalParameters.SENHA;

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmLogin();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        String usuarioLogado = myViewPage.pegarUsuario();

        Assert.assertEquals(usuario, usuarioLogado);
    }
}
