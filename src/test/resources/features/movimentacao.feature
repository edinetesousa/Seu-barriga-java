#language: pt

Funcionalidade: Criar Movimentação

  Contexto:
    Dado que o usuario esta logado sistema e acesse o menu de Criar Movimentacao
    E clicar no botao Salvar

  Cenário: Criar movimentacao com  dados corretamente - Sucesso
    Quando o usuario preencher todos os campos corretamente
    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com dados vazios
#    Quando deixar todos os campos vazios e clicar no botão salvar
#    Entao o sistema exibira a mensagem
#
#  Cenario: Criar movimentacao com Descricao vazia e demais campos preenchidos corretamente
#    Quando o usuário com Descricao vazia e demais campos preenchidos corretamente
#    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com Interessado vazio e demais campos preenchidos corretamente
#    Quando o usuario deixar o campo Interessado vazio e demais campos preenchidos corretamente
#    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com valor vazio e demais campos preenchidos corretamente
#    Quando o usuario deixar o campo Valor vazio e demais campos preenchidos corretamente
#    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com valor invalido e demais campos preenchidos corretamente
#    Quando o usuario inserir um dado invalido no campo Valor e demais campos corretamente
#    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com data movimentacao vazio e demais campos preenchidos corretamente
#    Quando o usuario deixar a data movimentacao vazio e demais campos preenchidos corretamente
#    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com data de pagamento vazia e demais campos preenchidos corretamente
#    Quando o usuario deixar a data de pagamento vazia e demais campos preenchidos corretamente
#    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com data de movimentacao posterior a data de pagamento
#    Quando o usuario inserir a data de movimentacao posterior a data de pagamento
#    Entao o sistema exibira a mensagem ""
#
#  Cenario: Criar movimentacao com data de movimentacao igual a data de pagamento
#    Quando o usuario inserir a data da movimentação igual a data do pagamento
#    Entao o sistema exibira a mensagem ""