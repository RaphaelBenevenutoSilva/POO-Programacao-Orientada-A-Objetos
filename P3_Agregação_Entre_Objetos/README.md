# 📚 Projeto Livro - Agregação e Interface

Este projeto simula a interação entre uma pessoa e um livro, aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java.

## 🧠 Conceitos Aplicados
- **Agregação:** A classe `Livro` possui um atributo do tipo `Pessoa` (`private Pessoa leitor`), demonstrando que um objeto pode ser composto por outro.
- **Interface:** Implementação da interface `Publicacao`, que define os métodos abstratos para controle do livro (abrir, fechar, folhear, etc).
- **Encapsulamento:** Todos os atributos são privados, acessados via métodos Getters e Setters.

## 🚀 Funcionalidades
- Criar instâncias de pessoas e livros.
- Folhear páginas com validação (não permite folhear além do total de páginas).
- Exibir detalhes completos do livro, incluindo informações do leitor atual.

## 📂 Estrutura
- `Pessoa.java`: Representa o leitor.
- `Livro.java`: Classe principal com a lógica de agregação.
- `Publicacao.java`: Interface com as regras de negócio.
- `ProjetoLivro.java`: Classe com o método `main`.





# 🥊 UFC Combat - Relacionamento entre Objetos

Simulador de lutas utilizando lógica de agregação e tipos abstratos de dados em Java.

## 🧠 Conceitos Aplicados
- **Agregação:** A classe `Luta` relaciona dois objetos da classe `Lutador` (`desafiado` e `desafiante`).
- **Lógica de Negócio:** - Uma luta só é aprovada se os lutadores forem da mesma categoria e não forem a mesma pessoa.
  - O resultado da luta (Vitória, Derrota ou Empate) altera os atributos dos objetos `Lutador` envolvidos.
- **Randomização:** Uso da classe `Random` para gerar resultados aleatórios para os combates.

## 📊 Regras de Categoria (Peso)
- **Leve:** Até 70.3 Kg
- **Médio:** Até 83.9 Kg
- **Pesado:** Até 120.2 Kg

## 🚀 Funcionalidades
- Apresentação completa do lutador com estatísticas de carreira.
- Marcador de lutas com verificação de categoria automática.
- Atualização em tempo real do status dos lutadores após o combate.

## 📂 Estrutura
- `Lutador.java`: Atributos e métodos individuais do atleta.
- `Luta.java`: Lógica de gerenciamento do evento.
- `UfcCombat.java`: Classe principal para execução do simulador.
