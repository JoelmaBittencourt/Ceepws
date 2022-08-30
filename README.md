# Ceepws
medium
Gradle Project: essa configuração indica que o projeto será criado e gerenciado pela Build Tool Gradle. (Fique à vontade em usar o Maven caso seja sua preferida)
Kotlin: com essa opção o projeto já vem configurado para dar suporte a linguagem Kotlin
1.5.6: trata-se da versão do Spring Boot que será configurado
Group: indica a organização que desenvolverá o projeto, ou seja, também reflete na construção dos nossos pacotes básicos
Artifact: refere-se ao nome do nosso projeto, nesse caso ceepws (Web Service)
Selected Dependencies: são as dependências padrões que iremos utilizar para configurar o nosso WS

Web: permite a utilização de toda stack de desenvolvimento Web do Spring, ou seja, a partir dela, teremos a capacidade de configurar o nosso projeto para que ele seja um servidor capaz de responder a requisições tanto para aplicações Web convencionais como também para criarmos o nosso WS

JPA: habilita a possibilidade de utilizar o conceito de ORM por meio da especificação JPA. Também, essa dependência permite a utilização do projeto Spring Data que facilita e muito o processo de persistência e recuperação de dados

HSQLDB: é um driver para um banco de dados que pode ser salvo tanto em memória quanto em um arquivo, em outras palavras, com essa dependência temos a capacidade de usar um banco de dados sem a necessidade de instalar um programa pra isso, como é o caso do MySQL, SQL Server, Oracle e etc

DevTools: essa dependência é uma ferramenta do próprio Spring Boot para agilizar o processo de deployment do nosso servidor durante o desenvolvimento, para mais detalhes deixo a referência

http://localhost:8080/notes.

Como sabemos, todos os acessos ao nosso servidor estão sendo feitos a partir do protocolo HTTP, que de forma resumida, permite transferir texto do lado do cliente para o servidor e vice-versa.

Por exemplo, quando acessamos a URL http://localhost:8080/notes via navegador, estamos pedindo ao nosso Controller por uma resposta a partir do método GET.

Já que ele não tem nada configurado para responder a esse tipo de requisição, a resposta 404…

A ideia do @RestController é fazer com que a resposta das funções do Controller que foram mapeadas, como é o caso da nossa list(), tenham o @ResponseBody por padrão, ou seja, não precisamos mais indicá-lo!

https://medium.com/collabcode/criando-um-web-service-base-no-spring-boot-com-kotlin-962a51317d63