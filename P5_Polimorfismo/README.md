# 🐾 Polimorfismo de Sobreposição (Override)

Este projeto explora o conceito de **Polimorfismo de Sobreposição**, onde classes filhas fornecem suas próprias implementações para métodos definidos na superclasse.

## 🧠 Conceitos Aplicados
- **Polimorfismo Dinâmico:** O método chamado é decidido em tempo de execução (Ex: `locomover()` em um `Canguru` resulta em "Saltitando", enquanto em um `Peixe` resulta em "Nadando").
- **Métodos Abstratos:** A classe `Animal` define a "assinatura" do comportamento, mas obriga cada espécie a dizer *como* o faz.
- **Hierarquia de Classes:** Implementação de Mamíferos, Répteis, Peixes e Aves herdando de uma base comum.

## 🚀 Destaques do Código
- Uso de `@Override` para garantir a sobrescrita correta.
- Demonstração de comportamentos específicos: `usarBolsa()` para Cangurus e `soltarBolha()` para Peixes.
- Classe `Animal` como `abstract`, impedindo a criação de um animal genérico.

## 📂 Estrutura
- `Animal.java` (Abstrata)
- `Mamifero.java`, `Peixe.java`, `Ave.java`, `Reptil.java` (Especializações)
- `Cachorro.java` e `Canguru.java` (Subclasses de Mamífero)

<br>

---
<br>

# 🐕 Polimorfismo de Sobrecarga (Overload)

Um mergulho no **Polimorfismo de Sobrecarga**, focado na classe `Cachorro` e suas diversas reações baseadas nos parâmetros recebidos.

## 🧠 Conceitos Aplicados
- **Polimorfismo Estático:** Ocorre quando temos vários métodos com o mesmo nome na mesma classe, mas com **assinaturas diferentes** (quantidade ou tipos de parâmetros distintos).
- **Assinatura de Método:** Demonstração de como o Java diferencia `reagir(String frase)` de `reagir(int hora, int min)`.
- **Lógica de Decisão:** Implementação de comportamentos complexos baseados em idade, peso, horário e o estado emocional do dono.

## 🚀 Exemplos de Reação do Cachorro
- **Por Frase:** "Olá" gera alegria; frases agressivas geram rosnados.
- **Por Horário:** Reage de forma diferente se for manhã, tarde ou noite.
- **Por Atributos Físicos:** Cães novos e leves são mais ativos; cães velhos e pesados tendem a ignorar comandos.

## 📂 Estrutura
- `Lobo.java`: Herda de Mamífero e aplica sobreposição no som.
- `Cachorro.java`: Onde a mágica da **Sobrecarga** acontece com múltiplos métodos `reagir()`.
