#language: pt

Funcionalidade: Criar Movimentação

  Contexto:
    Dado que o usuario acesse o menu de movimentacao do site do seu barriga

  Cenario: Criar movimentacao com  dados corretamente - Sucesso
    Quando o usuario preencher todos os campos corretamente
    E clicar no botao Salvar
    Entao o sistema deve exibir a mensagem de sucesso ""

  Cenario: Criar movimentacao com Descricao vazia e demais campos preenchidos corretamente

  Cenario: Criar movimentacao com Interessado vazio e demais campos preenchidos corretamente

  Cenario: Criar movimentacao com valor vazio e demais campos preenchidos corretamente

  Cenario: Criar movimentacao com valor invalido e demais campos preenchidos corretamente

  Cenario: Criar movimentacao com data movimentacao vazio e demais campos preenchidos corretamente

  Cenario: Criar movimentacao com data de pagamento vazia e demais campos preenchidos corretamente

  Cenario: Criar movimentacao com data de movimentacao posterior a data de pagamento









