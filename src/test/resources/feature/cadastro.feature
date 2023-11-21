#language: pt

Funcionalidade: Cadastro
  Como usuário do site "https://seubarriga.wcaquino.me/"
  Quero realizar o cadastro na plataforma
  Para ter acesso aos recursos disponíveis

  Esquema do Cenario: Cadastro com Sucesso
    Dado que o usuario acesse o site
    Quando clicar no botao Novo Usuário
    E preencher os campos nome "<nome>", email "<email>" e senha "<senha>"
    E clicar no botao Cadastrar
    Entao o sistema mostrara a mensagem "<mensagem>"

    Exemplos:
      | nome           | email                       | senha  | mensagem             | fluxo               |
      | Edinete Sousa  | edinete.sousa@labsif.com.br | 123456 | Usuário inserido com Sucesso | Cadastro com Sucesso|