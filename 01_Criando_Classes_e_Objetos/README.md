# ☕ 01. Programação Orientada a Objetos (POO)

Este repositório é dedicado ao estudo dos pilares da POO em Java. Aqui aplico conceitos de abstração, encapsulamento e visibilidade seguindo a metodologia do curso de Java POO (Guanabara).

## 📝 Projetos e Exercícios:

### 🏦 Sistema de Conta Banco (Destaque do Módulo)
* **Descrição:** Simulação de um sistema bancário real com abertura de conta (Corrente e Poupança), depósitos, saques e cobrança de mensalidade.
* **Destaque Técnico:** * **Encapsulamento Total:** Todos os atributos são `private` ou `protected`, sendo acessados apenas via métodos `public`.
    * **Lógica de Estado:** Validação rigorosa para garantir que não se pode sacar de conta sem saldo ou fechar conta com dinheiro/débito.

### 🖊️ Evolução da Classe Caneta
* **Aula 02 e 03:** Estudo de **Visibilidade** (`public`, `private`, `protected`) e como o estado do objeto influencia seu comportamento (ex: não rabiscar se estiver tampada).
* **Aula 04:** Implementação de **Métodos Especiais** (Getters, Setters e Construtores) para criar objetos já configurados de forma segura.

### 🖱️ Abstração de Objetos Reais
* **Objeto Concreto (Mouse):** Atributos como DPI e Cor, com métodos de interação.
* **Objeto Abstrato (Estudo):** Transformando a rotina de estudos em código, controlando tempo e assunto.

## 🛠️ Tecnologias e Ferramentas
* **Java SDK** (Versão 8 ou superior)
* **NetBeans IDE**
* **Lógica de Orientação a Objetos**

## 🚀 Como executar o projeto de Banco
1. Localize a classe `ContaBanco.java` dentro do pacote `projetos.contabanco`.
2. Execute o arquivo (`Shift + F6` no NetBeans).
3. O terminal exibirá o status detalhado das contas criadas para o **Raphael** e a **Cleuza**.
