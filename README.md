# totvs

Cadastro de Cliente Básico

A aplicação está separada em dois módulos, frontend e backend 

#Implantação
1.0 Realizar o clone de ambos os projetos

Pré-requisitos
Certifique-se de ter o Node.js e o Angular CLI instalados antes de prosseguir.

Node.js: Download e instalação
Angular CLI: Instale globalmente utilizando o seguinte comando no terminal:
npm install -g @angular/cli

Frontend 
Necessário ter o node e angular cli para rodar o ambiente seguir os passos (https://medium.com/@januario86/configurando-vari%C3%A1veis-de-ambiente-do-node-73cd8d8075e8)

1.1 No projeto frontend deverá ser executado o comando npm install para baixar as dependencias, deverá ser executado no caminho frontend\totvs-cadastraobasico
1.2 Para execução do json server deverá ser feito pelo comando json-server --watch db.json --port 3000 no diretório src\assets para execução do db.json
1.3 Executar o comando ng serve para que seja feito o build e deploy da aplicação angular, que deverá ser realizado na porta localhost:4200 (default)

Backend
Necessário ter o java 17 instalado e o maven, para efetuar tal instalação seguir os direcionamentos Maven (https://medium.com/@januario86/o-que-%C3%A9-o-maven-e-como-instalar-1d5e9f29ac4c), 
java(https://medium.com/@januario86/configurando-vari%C3%A1veis-de-ambiente-no-java-4fc0bb2dec83)

2.0 Executar o comando mvn clean install, pois se trata de um projeto maven 
2.1 Para rodar o projeto executar o comando java -jar totvs-cadastrobasico-api-0.0.1-SNAPSHOT.jar deverá ser executado através da porta localhost:8080

#Documentação de api 
para facilitar a comunicação das apis, foi disponibilizado o swagger utilizando o springdoc através do caminho http://localhost:8080/swagger-ui/index.html#

![image](https://github.com/Januario86/totvs/assets/18173821/4af8c947-cd8f-4b7b-84d5-84f12576191c)

