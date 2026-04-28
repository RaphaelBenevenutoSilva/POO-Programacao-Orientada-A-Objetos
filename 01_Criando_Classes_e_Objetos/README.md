# ☕ 01. Programação Orientada a Objetos (POO)

Este diretório reúne meus estudos práticos sobre os pilares da Programação Orientada a Objetos em Java. O foco aqui foi transitar do pensamento procedural para a modelagem de classes, aplicando conceitos de visibilidade, métodos especiais e encapsulamento.

## 📝 Projetos Neste Módulo:

### 🏦 Gestão de Regras de Negócio
* `ContaBanco`
    * **Descrição:** Simulação de um sistema bancário completo com lógica para abertura de conta (CC/CP), depósitos, saques e taxas de manutenção.
    * **Destaque Técnico:** Implementação de **Encapsulamento**. Todos os atributos são privados, e as operações dependem de validações de estado (ex: só saca se houver saldo e a conta estiver aberta).

### 🖊️ Métodos Especiais e Construtores
* `Aula04`
    * **Descrição:** Evolução da classe Caneta, agora utilizando um Método Construtor para definir o estado inicial do objeto.
    * **Destaque Técnico:** Uso de **Getters e Setters** para manipulação segura de atributos protegidos, garantindo que o objeto seja instanciado com dados válidos desde o início.

### 🛡️ Visibilidade e Modificadores
* `Aula02`
    * **Descrição:** Exploração dos modificadores de acesso (`public`, `private` e `protected`) para entender como proteger os membros de uma classe.
    * **Destaque Técnico:** Demonstração de como a visibilidade impacta o que o mundo externo pode ver e alterar em um objeto.

### 🖱️ Abstração de Objetos Concretos
* `Mouse`
    * **Descrição:** Transformação de um componente periférico em código, controlando atributos como DPI e cor.
    * **Destaque Técnico:** Lógica comportamental simples onde o método `clicar()` depende do valor atribuído ao atributo `dpi`.

### 📚 Abstração de Conceitos Abstratos
* `Estudo`
    * **Descrição:** Modelagem de uma rotina de aprendizado para monitorar assuntos e tempo dedicado.
    * **Destaque Técnico:** Aplicação de **Abstração**, mostrando que POO serve tanto para coisas físicas quanto para conceitos e tarefas.

## 🛠️ Tecnologias e Conceitos
* **Linguagem:** Java
* **IDE:** NetBeans
* **Pilares:** Abstração e Encapsulamento
* **Metodologia:** Curso em Vídeo (Prof. Gustavo Guanabara)
