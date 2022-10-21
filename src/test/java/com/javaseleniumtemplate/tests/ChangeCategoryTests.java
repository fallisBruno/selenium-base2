package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.GerirPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class ChangeCategoryTests extends TestBase {

    LoginFlows loginFlows;
    MyViewPage myViewPage;
    GerirPage gerirPage;

    @Test
    public void validarCategoriaAtualizada(){

        loginFlows = new LoginFlows();
        myViewPage = new MyViewPage();
        gerirPage = new GerirPage();

        loginFlows.efetuarLogin(GlobalParameters.USUARIO, GlobalParameters.SENHA);

        String novaCategoria = "nova categoria";

        myViewPage.clicarEmGerir();
        gerirPage.clicarEmGerirProjetos();
        gerirPage.clicarEmAlterar();
        gerirPage.alterarCategoria(novaCategoria);
        gerirPage.clicarAtualizarCategoria();
        String categorialAtual = gerirPage.pegarCategoriaAtual();

        Assert.assertEquals(categorialAtual, novaCategoria);
    }

}
