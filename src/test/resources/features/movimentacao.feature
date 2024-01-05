#language: pt

Funcionalidade: Criar Movimentação

  Contexto:
    Dado que o usuario esta logado no sistema e acesse o menu de Criar Movimentacao

  Cenário: 001 - Criar movimentacao com dados corretos - Sucesso
    Quando o usuario preencher todos os campos corretamente
    Entao o sistema exibira a mensagem "Movimentação adicionada com sucesso!"

  Cenario: 002 - Criar movimentacao com Descricao vazia e demais campos preenchidos corretamente
    Quando o usuario deixar o campo Descricao vazio e demais campos preenchidos corretamente
    Entao o sistema exibira a mensagem "Descrição é obrigatório"

  Cenario: 003 - Criar movimentacao com Interessado vazio e demais campos preenchidos corretamente
    Quando o usuario deixar o campo Interessado vazio e demais campos preenchidos corretamente
    Entao o sistema exibira a mensagem "Interessado é obrigatório"

  Cenario: 004 - Criar movimentacao com valor vazio e demais campos preenchidos corretamente
    Quando o usuario deixar o campo Valor vazio e demais campos preenchidos corretamente
    Entao o sistema exibira as mensagens "Valor é obrigatório" e "Valor deve ser um número"

  Cenario: 005 - Criar movimentacao com valor invalido e demais campos preenchidos corretamente
    Quando o usuario inserir um dado invalido no campo Valor e demais campos corretamente
    Entao o sistema exibira a mensagem "Valor deve ser um número"

  Cenario: 006 - Criar movimentacao com data movimentacao vazio e demais campos preenchidos corretamente
    Quando o usuario deixar a data movimentacao vazio e demais campos preenchidos corretamente
    Entao o sistema exibira a mensagem "Data da Movimentação é obrigatório"

  Cenario: 007 - Criar movimentacao com data de pagamento vazia e demais campos preenchidos corretamente
    Quando o usuario deixar a data de pagamento vazia e demais campos preenchidos corretamente
    Entao o sistema exibira a mensagem "Data do pagamento é obrigatório"

  Cenario: 008 - Criar movimentacao com data de movimentacao posterior a data de pagamento
    Quando o usuario inserir a data de movimentacao posterior a data de pagamento
    Entao o sistema exibira a mensagem "Movimentação adicionada com sucesso!"

  Cenario: 009 - Criar movimentacao com data de movimentacao igual a data de pagamento
    Quando o usuario inserir a data da movimentação igual a data do pagamento
    Entao o sistema exibira a mensagem "Movimentação adicionada com sucesso!"

  Cenario: 010 - Criar movimentacao com campo Descricao preenchido apenas com um caractere especial
    Quando o usuario preencher o campo Descricao apenas com um caractere especial e os demais corretamente
    Entao o sistema exibira a mensagem "Descrição deve conter letras!"

  Cenario: 011 - Criar movimentacao com campo valor contendo caractere especial
    Quando o usuario preencher o campo valor contendo caractere especial
    Entao o sistema exibira a mensagem "Valor deve ser um número"