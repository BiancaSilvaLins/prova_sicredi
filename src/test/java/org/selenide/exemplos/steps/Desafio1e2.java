package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaInicial;

public class Desafio1e2 {

    private PaginaInicial paginaInicial = new PaginaInicial();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela inicial do sistema bootstrap theme")
    public void que_estou_na_tela_inicial_do_sistema_bootstrap_theme() throws InterruptedException {
        paginaInicial.navegar();
    }

    @Given("altero o valor da combo Select version para Bootstrap V{int} Theme")
    public void altero_o_valor_da_combo_Select_version_para_Bootstrap_V_Theme(Integer int1) {
        paginaInicial.selecionarVersao();
    }

    @Given("clico no botao Add Customer")
    public void clico_no_botao_Add_Customer() throws InterruptedException {
        Thread.sleep(1000);
        paginaInicial.clicarBotaoAdd();
    }

    @Given("preencho o campo name {string}")
    public void preencho_o_campo_name(String string) {
        paginaInicial.preencherCampoName(string);
    }

    @Given("preencho o campo lastName {string}")
    public void preencho_o_campo_lastName(String string) {
        paginaInicial.preencherCampoLastName(string);
    }

    @Given("preencho o campo contactFirstName {string}")
    public void preencho_o_campo_contactFirstName(String string) {
        paginaInicial.preencherCampoContact(string);
    }

    @Given("preencho o campo Phone {string}")
    public void preencho_o_campo_Phone(String string) {
        paginaInicial.preencherCampoPhone(string);
    }

    @Given("preencho o campo addressLineUm {string}")
    public void preencho_o_campo_addressLineUm( String string) {
        paginaInicial.preencherCampoAddress1(string);
    }

    @Given("preencho o campo addressLineDois {string}")
    public void preencho_o_campo_addressLineDois(String string) {
        paginaInicial.preencherCampoAddress2(string);
    }

    @Given("preencho o campo city {string}")
    public void preencho_o_campo_city(String string) {
        paginaInicial.preencherCampoCity(string);
    }

    @Given("preencho o campo state {string}")
    public void preencho_o_campo_state(String string) {
        paginaInicial.preencherCampoState(string);
    }

    @Given("preencho o campo postalCode {string}")
    public void preencho_o_campo_postalCode(String string) {
        paginaInicial.preencherCampoPostalCode(string);
    }

    @Given("preencho o campo country {string}")
    public void preencho_o_campo_country(String string) {
        paginaInicial.preencherCampoCountry(string);
    }

    @Given("seleciono o campo SalesRepEmployeeNumber {string}")
    public void seleciono_o_campo_SalesRepEmployeeNumber(String string) {
        paginaInicial.selecionarCampoSalesRepEmployeeNumber(string);
    }

    @Given("preencho o campo creditLimit {string}")
    public void preencho_o_campo_creditLimit(String string) {
        paginaInicial.preencherCampoCreditLimit(string);
    }

    @When("clico no botao save")
    public void clico_no_botao_save() {
        paginaInicial.clicarBotaoSave();
    }

    @Then("validar a mensagem de sucesso {string}")
    public void validar_a_mensagem_de_sucesso(String msg) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(paginaInicial.mensagemSucesso(msg),msg);
    }





    @Given("Clico no link Go back to list")
    public void clico_no_link_Go_back_to_list() {
        paginaInicial.clicarBotaoList();
    }

    @Given("preencho o conteudo do campo name {string}")
    public void preencho_o_conteudo_do_campo_name(String string) {
        paginaInicial.preencherConteudoName(string);
    }

    @Given("Clico no checkbox abaixo da palavra Actions")
    public void clico_no_checkbox_abaixo_da_palavra_Actions() {
        paginaInicial.clicarCheckBox();
    }

    @Given("Clico no botao Delete")
    public void clico_no_botao_Delete(){
        paginaInicial.clicarBotaoDelete();
    }

    @Given("Valido o texto {string} atraves de uma assercao para a popup que sera apresentado")
    public void valido_o_texto_atraves_de_uma_assercao_para_a_popup_que_sera_apresentado(String string) {
        Assert.assertEquals(paginaInicial.texto(string), string);
    }

    @When("Clico no botao Delete da popup")
    public void clico_no_botao_Delete_da_popup() {
        paginaInicial.clicarBotaoDelete2();
    }

    @Then("valido a mensagem de sucesso {string}")
    public void valido_a_mensagem_de_sucesso(String string) {
        Assert.assertEquals(paginaInicial.mensagem(string), string);
    }

}