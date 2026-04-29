# 📺 Projeto Controle Remoto - POO Java

Repositório dedicado ao estudo de **Encapsulamento** e **Interfaces** em Java, seguindo os conceitos de Programação Orientada a Objetos (POO).

## 📌 Sobre o Projeto
Este projeto simula o funcionamento lógico de um controle remoto universal. O objetivo principal é demonstrar como uma `interface` define um contrato de comportamento que uma `classe` deve seguir, mantendo os atributos protegidos através do encapsulamento (Getters e Setters privados).

## 🛠️ Tecnologias e Conceitos
- **Linguagem:** Java
- **Conceitos de POO:**
  - **Encapsulamento:** Atributos e métodos internos protegidos.
  - **Interfaces:** Uso da interface `Controlador` para métodos abstratos.
  - **Polimorfismo:** Implementação da interface (`@Override`).

## 🚀 Funcionalidades
| Método | Regra de Negócio |
| :--- | :--- |
| `ligar() / desligar()` | Controla o estado de energia. |
| `maisVolume() / menosVolume()` | Ajusta o volume (apenas se a TV estiver ligada). |
| `abrirmenu()` | Exibe status e barra de volume visual no console. |
| `play() / pause()` | Controla a reprodução (apenas se ligado). |

## 📂 Estrutura de Arquivos
```text
src/projetos/aula06/
├── Controlador.java    # Interface com as assinaturas
├── ControleRemoto.java # Implementação da lógica
└── Aula06.java         # Testes do sistema (Main)
* **Java SDK**
* **NetBeans IDE / Maven**
* **Curso em Vídeo (Gustavo Guanabara)**
* **Pilares de POO:** Abstração, Encapsulamento (Interfaces) e Visibilidade.
* **Lógica Avançada:** Implementação de `@Override`, métodos abstratos e controle de estado de objetos.
