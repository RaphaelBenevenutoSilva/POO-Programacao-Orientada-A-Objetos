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

# 🎓 Evolução em Herança - Classes Abstratas e Finais

Este projeto explora níveis mais profundos de herança, utilizando conceitos de controle de árvore genealógica de classes e formatação de dados.

## 🧠 Conceitos Avançados
- **Classe Abstrata (`abstract`)**: A classe `Pessoa` agora é abstrata, o que significa que ela não pode ser instanciada diretamente, servindo apenas como modelo para as classes filhas.
- **Métodos Finais (`final`)**: Uso do modificador `final` no método `fazerAniv()`, impedindo que ele seja sobrescrito pelas classes filhas (segurança da lógica).
- **Herança para Diferença**:
  - `Visitante`: Uma "Herança de Implementação" (Pobre), que apenas herda tudo sem adicionar nada.
  - `Tecnico` e `Bolsista`: Demonstram como uma classe filha (`Aluno`) também pode servir como progenitora para outras classes.
- **Formatação de Dados**: Uso de `DecimalFormat` para exibir salários de forma amigável (R$ 0.000,00).

## 🚀 Funcionalidades
- Cálculo de tempo restante para formação técnica.
- Pagamento de mensalidade diferenciado para `Bolsistas` (sobrescrita de método).
- Gestão de aumentos salariais para professores com feedback no console.

## 📂 Árvore de Herança
Pessoa (Abstrata)
 ├── Visitante
 ├── Professor
 └── Aluno
      ├── Bolsista
      └── Tecnico
