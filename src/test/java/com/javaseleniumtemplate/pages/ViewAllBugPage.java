package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewAllBugPage extends PageBase {

    By atribuidoAField = By.id("handler_id_filter");
    By selectYourself = By.xpath("//select[@name='handler_id[]']");
    By aplicarFiltro = By.xpath("//input[@class='btn btn-primary btn-sm btn-white btn-round no-float']");
    By contadorTarefasField = By.xpath("//span[@class='badge']");

    public void clicarEmAtribuidoA(){
        click(atribuidoAField);
    }

    public void selecionarAtribuidoA(String texto){
        comboBoxSelectByVisibleText(selectYourself, texto);
    }

    public void clicarAplicarFiltro(){
        click(aplicarFiltro);
    }

    public String pegarContador(){
        return getText(contadorTarefasField);
    }

}
