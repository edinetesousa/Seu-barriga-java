#language: pt

Funcionalidade: Relatório Resumo Mensal

  Contexto:
    Dado que o usuário esteja logado

  Cenário: Consulta das Movimentacoes do Resumo Mensal
    Dado que o usuario clique na opcao Resumo Mensal
    Quando o usuario consultar as movimentacoes
    Então o sistema exibira as movimentacoes pesquisadas

  Cenario: Consulta de um mes sem Movimentacoes
    Dado que o usuario clique na opcao Resumo Mensal
    Quando o usuario consultar as movimentacoes de um mes e ano sem movimentacao
    Então o sistema exibira o grid vazio