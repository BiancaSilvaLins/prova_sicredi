@Desafio1&2
Feature: Desafio 1 e 2

  Scenario Outline: Criar um customer no Bootstrap V4 Theme
    Given que estou na tela inicial do sistema bootstrap theme
    And altero o valor da combo Select version para Bootstrap V4 Theme
    And clico no botao Add Customer
    And preencho o campo name "<name>"
    And preencho o campo lastName "<lastName>"
    And preencho o campo contactFirstName "<contactFirstName>"
    And preencho o campo Phone "<Phone>"
    And preencho o campo addressLineUm "<addressLine1>"
    And preencho o campo addressLineDois "<addressLine2>"
    And preencho o campo city "<city>"
    And preencho o campo state "<state>"
    And preencho o campo postalCode "<postalCode>"
    And preencho o campo country "<country>"
    And seleciono o campo SalesRepEmployeeNumber "<SalesRepEmployeeNumber>"
    And preencho o campo creditLimit "<creditLimit>"
    When clico no botao save
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
      |name          |lastName |contactFirstName |Phone        |addressLine1          |addressLine2 |city         |state |postalCode |country |SalesRepEmployeeNumber |creditLimit |mensagemSucesso                                                                          |
      |Teste Sicredi |Test     |Bianca           |51 9999-9999 |Av Assis Brasil, 3970 |Torre D      |Porto Alegre |RS    |91000-000  |Brasil  |12345                  |200         |Your data has been successfully stored into the database. Edit Record or Go back to list |


  Scenario Outline: Excluir um customer no Bootstrap V4 Theme
    Given que estou na tela inicial do sistema bootstrap theme
    And altero o valor da combo Select version para Bootstrap V4 Theme
    And clico no botao Add Customer
    And preencho o campo name "<name>"
    And preencho o campo lastName "<lastName>"
    And preencho o campo contactFirstName "<contactFirstName>"
    And preencho o campo Phone "<Phone>"
    And preencho o campo addressLineUm "<addressLine1>"
    And preencho o campo addressLineDois "<addressLine2>"
    And preencho o campo city "<city>"
    And preencho o campo state "<state>"
    And preencho o campo postalCode "<postalCode>"
    And preencho o campo country "<country>"
    And seleciono o campo SalesRepEmployeeNumber "<SalesRepEmployeeNumber>"
    And preencho o campo creditLimit "<creditLimit>"
    When clico no botao save
    Then validar a mensagem de sucesso "<mensagemSucesso>"
    And Clico no link Go back to list
    And preencho o conteudo do campo name "<conteudoName>"
    And Clico no checkbox abaixo da palavra Actions
    And Clico no botao Delete
    And Valido o texto "<texto>" atraves de uma assercao para a popup que sera apresentado
    When Clico no botao Delete da popup
    Then valido a mensagem de sucesso "<mensagem>"


    Examples:
      |name          |lastName |contactFirstName |Phone        |addressLine1          |addressLine2 |city         |state |postalCode |country |SalesRepEmployeeNumber |creditLimit |mensagemSucesso                                                                          |conteudoName  |texto                                             |mensagem                                                   |
      |Teste Sicredi |Teste    |Bianca           |51 9999-9999 |Av Assis Brasil, 3970 |Torre D      |Porto Alegre |RS    |91000-000  |Brasil  |12345                  |200         |Your data has been successfully stored into the database. Edit Record or Go back to list |Teste Sicredi |Are you sure that you want to delete this 1 item? |Your data has been successfully deleted from the database. |