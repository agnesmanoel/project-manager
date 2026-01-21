<h1 align="center"> Project Manager </h1>

## Descrição
Este projeto consiste em um gerenciador de projetos simples. O sistema permite o cadastro de usuários e a criação de projetos, possibilitando a atribuição de responsáveis e de prazos de entrega.

---

## Requisitos e versões

* **Java 17** + **Spring Boot 4.0.1**
* **SQLite 3** (3.45)
* **HTML + CSS**


## Como Executar
* É necessário tem em sua máquina o maven  e JDK 17
* No terminal, navegue até a pasta aonde deseja clonar esse repositório e cole os comandos abaixo

```
git clone https://github.com/agnesmanoel/project-manager.git
cd project-manager
mvn process-resources spring-boot:run

```

## Estrutura das pastas


## Criação do banco
O banco de dados é inicializado automaticamente pelo Spring Boot. 


## Decisões técnicas
* Nesse projeto a esoclha do Java  se deu pela familiaridade com a linguagem e pela facilidade que o ecossistema Spring oferece para subir aplicações web rapidamente.
* Adotei o SQLite3 pela sua alta portabilidade e capacidade de ser um banco relacional capaz de realizar consultas complexas sem exigir a instalação de servidores.

