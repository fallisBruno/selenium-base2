package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MyViewPage;
import com.javaseleniumtemplate.pages.ViewAllBugPage;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.View;

public class TaskTests extends TestBase {

    LoginFlows loginFlows;

    MyViewPage myViewPage;

    ViewAllBugPage viewAllBugPage;

    @Test
    public void verificarQuantidadeDeTarefas(){

        loginFlows = new LoginFlows();
        myViewPage = new MyViewPage();
        viewAllBugPage = new ViewAllBugPage();
        long quantidadeDeTarefasEsperadas = 0;

        loginFlows.efetuarLogin(GlobalParameters.USUARIO, GlobalParameters.SENHA);

        myViewPage.navegarVerTarefas();

        viewAllBugPage.clicarEmAtribuidoA();

        viewAllBugPage.selecionarAtribuidoA("[Eu mesmo]");

        viewAllBugPage.clicarAplicarFiltro();

        long contador = Long.valueOf( viewAllBugPage.pegarContador().split("/")[1].trim() );

        Assert.assertEquals(quantidadeDeTarefasEsperadas, contador);
    }

}
