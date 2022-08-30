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

spring.datasource.url: Trata-se do endereço do banco de dados que será utilizado, ou seja, jdbc:hsqldb:file:database/main/db
É válido mencionar que essa configuração também indica que o banco de dados será armazenado em um arquivo (file) dentro do diretório database/main/db.

spring.datasource.username: como próprio nome diz é o usuário do banco de dados, como podemos ver, está sendo o sa
o valor sa é o usuário padrão do hsqldb.

spring.datasource.driver-class-name: Driver que permite a comunicação entre a aplicação e o banco de dados HSQLDB por meio do JDBC, por isso adicionamos org.hsqldb.jdbc.JDBCDriver
spring.jpa.properties.hibernate.dialect: SQL que o Hibernate vai gerar durante o processo de transação com o banco de dados. Nesse caso o valor org.hibernate.dialect.HSQLDialect indica que o SQL gerado dará suporte ao HSQLDB
spring.jpa.hibernate.ddl-auto: Nessa configuração indicamos ao Hibernate que ele vai criar as tabelas automaticamente de acordo com as entidades do ORM, por isso do valor ser update
Configuração por meio 

@Entity: indica que a classe Note vai será considerada uma entidade controlada pelo Hibernate
@Id: torna a property id como primary key da entidade
@GeneratedValue: configura a primary key para que seja computada automaticamente de forma incremental.