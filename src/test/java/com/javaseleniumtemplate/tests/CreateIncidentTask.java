package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.BugReportPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class CreateIncidentTask extends TestBase {

    LoginFlows loginFlows;
    MyViewPage myViewPage;
    BugReportPage bugReportPage;

    @Test
    public void criarTarefaComSucesso() {

        loginFlows = new LoginFlows();
        myViewPage = new MyViewPage();
        bugReportPage = new BugReportPage();

        loginFlows.efetuarLogin(GlobalParameters.USUARIO, GlobalParameters.SENHA);

        myViewPage.clicarEmRelatarIncidente();
        bugReportPage.inserirResumo("teste resumo");
        bugReportPage.inserirDescricao("teste descricao");
        bugReportPage.criarTarefa();

        String novoId = bugReportPage.pegarId();

        Assert.assertNotNull(novoId);
    }
}
