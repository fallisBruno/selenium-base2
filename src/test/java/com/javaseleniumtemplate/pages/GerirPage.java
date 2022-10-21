package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class GerirPage extends PageBase {

    By gerirProjetosBotao = By.xpath("//a[@href='/manage_proj_page.php']");

    By alterarBotao = By.xpath("//button[text()='Alterar']");

    By categoriaField = By.id("proj-category-name");

    By atualizarCategoriaField = By.xpath("//input[@value='Atualizar Categoria']");

    By categoriaTexto = By.xpath("//div[@id='categories']//tbody//tr//td");

    public void clicarEmGerirProjetos(){
        click(gerirProjetosBotao);
    }

    public void clicarEmAlterar(){
        click(alterarBotao);
    }

    public void alterarCategoria(String novaCategoria){
        waitForElement(categoriaField).clear();
        sendKeys(categoriaField, novaCategoria);
    }

    public void clicarAtualizarCategoria(){
        click(atualizarCategoriaField);
    }

    public String pegarCategoriaAtual(){
        return getText(categoriaTexto);
    }

}
