# ☕ 01. Programação Orientada a Objetos (POO)

Este diretório marca o início da jornada pela Programação Orientada a Objetos em Java. Aqui, deixamos de lado a programação puramente sequencial para explorar conceitos de abstração, visibilidade e o uso de métodos especiais para proteger e organizar os dados.

## 📝 Projetos Neste Módulo:

### 🏦 Gestão Bancária e Regras de Negócio

* **Sistema ContaBanco**
    * **Descrição:** Simulação de um sistema bancário que gerencia a abertura de contas (Corrente e Poupança), depósitos, saques e cobrança automática de mensalidade.
    * **Destaque Técnico:** Implementação rigorosa de **Encapsulamento**. Todos os atributos (`saldo`, `status`, `dono`) são privados ou protegidos, garantindo que o saldo só mude através de métodos validados como `depositar()` e `sacar()`.

### 🖊️ Abstração e Modelagem de Objetos

* **Caneta (Evolução)**
    * **Descrição:** Modelagem de uma caneta para entender estados (tampada/destampada) e comportamentos (rabiscar).
    * **Destaque Técnico:** Uso de **Métodos Especiais** (`Getters`, `Setters` e `Construtor`). O objeto já nasce com características definidas e o acesso aos dados é feito de forma segura, evitando erros de manipulação direta de atributos.

### 🖱️ Mapeamento de Objetos Reais

* **Mouse e Rotina de Estudo**
    * **Descrição:** Exercícios de abstração para transformar objetos concretos e conceitos abstratos do dia a dia em classes Java funcionais.
    * **Destaque Técnico:** Demonstração prática da relação entre **Classe** (o molde) e **Objeto** (a instância real com dados específicos).

## 🛠️ Conceitos Aplicados

* **Visibilidade:** Uso estratégico de `public`, `private` e `protected`.
* **Estado e Comportamento:** Como os métodos alteram os atributos do objeto durante a execução.
* **Validação de Lógica:** Verificações para impedir ações impossíveis (ex: fechar conta com saldo positivo).
