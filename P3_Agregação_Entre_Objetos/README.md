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
