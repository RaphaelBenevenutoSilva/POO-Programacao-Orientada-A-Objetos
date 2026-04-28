# ☕ 01. Programação Orientada a Objetos (POO)

Este diretório reúne meus estudos práticos sobre os pilares da Programação Orientada a Objetos em Java. O foco aqui foi transitar do pensamento procedural para a modelagem de classes, aplicando conceitos de visibilidade, métodos especiais e encapsulamento.

## 📝 Projetos Neste Módulo:

### 🏦 Gestão de Regras de Negócio
* `ContaBanco`
    * **Descrição:** Simulação de um sistema bancário completo com lógica para abertura de conta (CC/CP), depósitos, saques e taxas de manutenção.
    * **Destaque Técnico:** Implementação de **Encapsulamento**. Todos os atributos são privados, e as operações dependem de validações de estado (ex: só saca se houver saldo e a conta estiver aberta).

### 🖊️ Métodos Especiais e Construtores
* `Aula04`
    * **Descrição:** Evolução da classe Caneta, utilizando um Método Construtor para definir o estado inicial do objeto.
    * **Destaque Técnico:** Uso de **Getters e Setters** para manipulação segura de atributos, garantindo que o objeto seja instanciado com dados válidos.

### 🛡️ Visibilidade e Modificadores
* `Aula03`
    * **Descrição:** Aprofundamento nos modificadores de acesso para entender a diferença entre o que é público e o que deve ser protegido.
    * **Destaque Técnico:** Configuração de atributos como `protected` e `private`, testando os limites de acesso entre diferentes classes.

* `Aula02`
    * **Descrição:** Exploração inicial dos modificadores de acesso (`public`, `private` e `protected`).
    * **Destaque Técnico:** Demonstração de como a visibilidade impacta o que o mundo externo pode ver e alterar em um objeto.

### 🖱️ Abstração de Objetos Concretos e Abstratos
* `Mouse`
    * **Descrição:** Transformação de um componente periférico em código, controlando atributos como DPI e cor.
    * **Destaque Técnico:** Lógica comportamental onde o método `clicar()` depende do valor atribuído ao atributo `dpi`.

* `Estudo`
    * **Descrição:** Modelagem de uma rotina de aprendizado para monitorar assuntos e tempo dedicado.
    * **Destaque Técnico:** Aplicação de **Abstração**, mostrando que POO serve tanto para objetos físicos quanto para conceitos.

## 🛠️ Tecnologias e Conceitos Explorados

* **Java SDK**
* **NetBeans IDE / Maven**
* **Curso em Vídeo (Gustavo Guanabara)**
* **Pilares de POO:** Abstração, Encapsulamento e Visibilidade.
