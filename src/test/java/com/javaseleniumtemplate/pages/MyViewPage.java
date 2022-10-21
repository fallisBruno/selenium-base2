package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MyViewPage extends PageBase {

    By usuarioLogado = By.className("user-info");
    By gerirBotao = By.xpath("//a[@href='/manage_overview_page.php']");
    By userInfoBotao = By.xpath("//span[text()='mateuspinheiro']/parent::a");
    By sairBotao = By.xpath("//a[@href='/logout_page.php']");
    By relatarIncidenteBotao = By.xpath("//a[@class='btn btn-primary btn-sm']");

    public String pegarUsuario(){
        return getText(usuarioLogado);
    }

    public void navegarVerTarefas(){
        navigateTo("https://mantis-prova.base2.com.br/view_all_bug_page.php");
    }

    public void clicarEmGerir(){
        click(gerirBotao);
    }

    public void clicarEmUserInfo(){
        click(userInfoBotao);
    }

    public void clicarEmSair(){
        click(sairBotao);
    }

    public void clicarEmRelatarIncidente(){
        click(relatarIncidenteBotao);
    }

}
