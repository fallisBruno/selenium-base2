package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class BugReportPage extends PageBase {

    By resumoField = By.xpath("//input[@name='summary']");
    By descricaoField = By.xpath("//textarea[@name='description']");
    By criarTarefaBotao = By.xpath("//input[@value='Criar Nova Tarefa']");

    By idField = By.xpath("//td[@class='bug-id']");

    public void inserirResumo(String resumo){
        sendKeys(resumoField, resumo);
    }

    public void inserirDescricao(String descricao){
        sendKeys(descricaoField, descricao);
    }

    public void criarTarefa(){
        click(criarTarefaBotao);
    }

    public String pegarId(){
        return getText(idField);
    }

}
