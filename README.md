# Projeto de Gamificação - Módulo de Recomendação de Cursos

Este projeto implementa um serviço de recomendação de cursos para uma plataforma de EAD, desenvolvido utilizando Test-Driven Development (TDD).

## User Story

**Como aluno**, quero receber recomendações de cursos relacionados ao que acabei de concluir, **para que** eu possa descobrir conteúdos relevantes e continuar meus estudos de forma prática.

## Cenários de Aceitação (BDD)

### Cenário 1: Exibir Recomendações na Página Inicial
- **Dado que** o aluno concluiu um curso na plataforma
- **Quando** ele acessa a página inicial
- **Então** são exibidas recomendações de cursos relacionados ao que ele concluiu

### Cenário 2: Envio de Recomendações por E-mail
- **Dado que** o aluno concluiu um curso
- **E** possui um e-mail válido cadastrado
- **Quando** a plataforma envia notificações de recomendações
- **Então** o aluno recebe um e-mail com cursos relacionados

### Cenário 3: Filtrar Recomendações por Categoria
- **Dado que** o aluno concluiu um curso
- **E** existem recomendações de diferentes categorias
- **Quando** o aluno filtra por uma categoria específica
- **Então** a plataforma exibe somente cursos recomendados daquela categoria

### Cenário 4: Salvar Recomendação
- **Dado que** o aluno recebeu recomendações de cursos
- **Quando** ele clica em "Salvar para depois"
- **Então** o curso recomendado fica salvo na lista pessoal do aluno

### Cenário 5: Avaliar Utilidade da Recomendação
- **Dado que** o aluno visualizou uma lista de cursos recomendados
- **Quando** ele marca "Essa recomendação foi útil"
- **Então** a plataforma registra essa avaliação
- **E** passa a priorizar recomendações mais bem avaliadas no futuro