package org.selenide.exemplos.paginas;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PaginaInicial {



    public PaginaInicial navegar() throws InterruptedException{
        open("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
        return this;
    }


    public void selecionarVersao() {
        $(byXpath("//*[@id='switch-version-select']")).shouldBe(visible).selectOption("Bootstrap V4 Theme");
    }

    public void clicarBotaoAdd() {
        $(byXpath("//*[@id='gcrud-search-form']/div[1]/div[1]/a")).shouldBe(visible).click();
    }

    public void preencherCampoName(String campoName) {
        $(byXpath("//*[@id='field-customerName']")).shouldBe(visible).sendKeys(campoName);
    }

    public void preencherCampoLastName(String campoLastName) {
        $(byXpath("//*[@id='field-contactLastName']")).shouldBe(visible).sendKeys(campoLastName);
    }

    public void preencherCampoContact(String campoContact) {
        $(byXpath("//*[@id='field-contactFirstName']")).shouldBe(visible).sendKeys(campoContact);
    }

    public void preencherCampoPhone(String campoPhone) {
        $(byXpath("//*[@id='field-phone']")).shouldBe(visible).sendKeys(campoPhone);
    }

    public void preencherCampoAddress1(String campoAddress1) {
        $(byXpath("//*[@id='field-addressLine1']")).shouldBe(visible).sendKeys(campoAddress1);
    }

    public void preencherCampoAddress2(String campoAddress2) {
        $(byXpath("//*[@id='field-addressLine2']")).shouldBe(visible).sendKeys(campoAddress2);
    }

    public void preencherCampoCity(String campoCity) {
        $(byXpath("//*[@id='field-city']")).shouldBe(visible).sendKeys(campoCity);
    }

    public void preencherCampoState(String campoState) {
        $(byXpath("//*[@id='field-state']")).shouldBe(visible).sendKeys(campoState);
    }

    public void preencherCampoPostalCode(String campoPostalCode) {
        $(byXpath("//*[@id='field-postalCode']")).shouldBe(visible).sendKeys(campoPostalCode);
    }

    public void preencherCampoCountry(String campoCountry) {
        $(byXpath("//*[@id='field-country']")).shouldBe(visible).sendKeys(campoCountry);
    }


    public void selecionarCampoSalesRepEmployeeNumber(String string) {
        $(byXpath("//*[@id='field-salesRepEmployeeNumber']")).shouldBe(visible).sendKeys(string);

    }

    public void preencherCampoCreditLimit(String campoCreditLimit) {
        $(byXpath("//*[@id='field-creditLimit']")).shouldBe(visible).sendKeys(campoCreditLimit);
    }

    public void clicarBotaoSave(){
        $(byXpath("//*[@id='form-button-save']")).shouldBe(visible).click();
    }

    public String mensagemSucesso(String msg){
        return $(byXpath("//*[@id='report-success']/p")).shouldBe(visible).getText();
    }

    public void clicarBotaoList(){
        $(byXpath("//*[@id='report-success']/p/a[2]")).shouldBe(visible).click();
    }

    public void preencherConteudoName(String conteudoName){
        $(byXpath("//*[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[3]/input")).shouldBe(visible).sendKeys(conteudoName);
    }

    public void clicarCheckBox(){
        $(byXpath("//*[@id='gcrud-search-form']/div[2]/table/tbody/tr/td[1]/input")).shouldBe(visible).click();
    }

    public void clicarBotaoDelete(){
        $(byXpath("//*[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[2]/div[1]/a")).shouldBe(visible).click();
    }

    public String texto(String text){
        return $(byXpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")).shouldBe(visible).getText();
    }

    public void clicarBotaoDelete2(){
        $(byXpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")).shouldBe(visible).click();
    }

    public String mensagem(String text){
        return $(byXpath("/html/body/div[3]/span[3]/p")).shouldBe(visible).getText();
    }
}