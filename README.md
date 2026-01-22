##

<h1 align="center"> Project Manager </h1>

## Descrição

<h3>Este projeto consiste em um gerenciador de projetos simples. O sistema permite o cadastro de usuários e a criação de projetos, possibilitando a atribuição de responsáveis e prazos de entrega. </h3>


## Requisitos e versões

* **Java 17** + **Spring Boot 4.0.1**
* **SQLite 3** (3.45)
* **HTML + CSS**


## Como Executar
* É necessário ter em sua máquina o Maven e JDK 17
* No terminal, navegue até a pasta onde deseja clonar esse repositório

```
git clone https://github.com/agnesmanoel/project-manager.git
cd project-manager
mvn process-resources spring-boot:run

```
* Caso não de certo, rode dentro da pasta do projeto o comando:
  ```
  mvn clean install
  mvn spring-boot:run
  ```
* E depois entre no link: http://localhost:8080
  

## Estrutura das pastas
A estrutura de pastas segue o padrão de apps Spring, organizada em camadas e com separação clara de responsabilidades.

1. **A pasta java/com/agnes/projectmanager** contém todo o código-fonte
2. **com.agnes.projectmanager.controller**: O pacote controller contém as classes responsáveis pela camada de apresentação dos recursos.
3. **com.agnes.projectmanager.service**: O pacote services representa a camada de negócio. Aqui temos as regas da aplicação e validação.
4. **com.agnes.projectmanager.models**: O pacote models contém os DTOS e as classes de domínio.
5. **com.agnes.projectmanager.validator**: O pacote Validators contém classes responsáveis pelas validações e pelos lançamentos de exceções dos recursos.
6. **com.agnes.projectmanager.exceptions**: O pacote exceptions é o pacote responsável por agrupar as classes de excecoes personalizadas.
7. **pasta resources** : Contém arquivos que não são java. 
7. **pasta resources/static** : A pasta static armazena arquivos front-end (HTML, CSS, JavaScript e imagens)

## Criação do banco
O banco de dados é inicializado automaticamente pelo Spring Boot. 


## Decisões técnicas
* Neste projeto, a escolha do Java se deu pela familiaridade com a linguagem e pela facilidade que o ecossistema Spring oferece para desenvolver aplicações web rapidamente.
* Adotei o SQLite3 pela sua alta portabilidade e capacidade de ser um banco relacional capaz de realizar consultas complexas sem exigir a instalação de servidores.

