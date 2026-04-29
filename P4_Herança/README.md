# 👥 Projeto Pessoas - Herança e Especialização

Este projeto demonstra a implementação de **Herança** em Java, permitindo que classes filhas compartilhem atributos e métodos de uma classe genérica.

## 🧠 Conceitos Aplicados
- **Herança (`extends`)**: As classes `Aluno`, `Professor` e `Funcionario` herdam características da classe progenitora `Pessoa`.
- **Especialização**: Cada classe filha adiciona atributos específicos (ex: `salario` para Professor, `setor` para Funcionario).
- **Sobrescrita de Métodos (`@Override`)**: Uso do método `toString()` para exibir os dados formatados de cada tipo de pessoa.

## 📂 Estrutura de Classes
- `Pessoa.java`: Superclasse (Mãe) com atributos básicos (Nome, Idade, Sexo).
- `Aluno.java`: Especialização com dados de matrícula e curso.
- `Professor.java`: Especialização com foco em salário e especialidade.
- `Funcionario.java`: Especialização para controle de setor e status de trabalho.
