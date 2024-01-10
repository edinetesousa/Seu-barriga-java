#language: pt

Funcionalidade: Cadastro de Usuario

  Contexto:
    Dado que o usuario esteja na tela de cadastro

  Cenario: Cadastro com Sucesso
    Quando o usuario preencher os dados necessarios para o cadastro
    Entao o sistema exibira a mensagem "Usuário inserido com sucesso"


  Cenario: Cadastro com campo nome em branco
    Quando o usuario deixar o campo nome em branco
    Entao o sistema exibira a mensagem "Nome é um campo obrigatório"

  Cenario: Cadastro com campo nome invalido
    Quando o usuario preencher o campo nome com um dado invalido
    Entao o sistema exibira a mensagem "Nome não é permitido caracteres especiais"

  Cenario: Cadastro com campo e-mail em branco
    Quando o usuario deixar o campo e-mail em branco
    Entao o sistema exibira a mensagem "Email é um campo obrigatório"


  Cenario: Cadastro com campo e-mail ja cadastrado
    Quando o usuario tentar realizar o cadastro com um email ja cadastrado
    Entao o sistema exibira a mensagem "Endereço de email já utilizado"

  Cenario: Cadastro com campo senha em branco
    Quando o usuario deixar o campo senha em branco
    Entao o sistema exibira a mensagem "Senha é um campo obrigatório"