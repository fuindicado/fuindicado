# fuindicado

##Tecnologias usadas até o momento
Java/Spring
Jpa
Rest
Tomcat
H2
json

##Ferramenta
Spring Tool Suite

## Rodar o back-end da aplicação
Rodar o projeto é muito simples, bastar entrar na classe "br.com.fuindicado.FuindicadoApplication" e rodar o método main.
Ha um servidor tomcat embarcado com o spring-book e ele vai rodar na porta 8080. Link para acessar a aplicação: localhost:8080/users.

## Base de dados
A base de dados que esta sendo usada no momento é uma base em memória chamada H2.
Caso queiram executar alguma query nesta base, basta iniciar a aplicação no método main e acessar a seguinte URL: http://localhost:8080/h2-console. 
Ao acessar o link vai abrir a pagina do gerenciador da base do H2. Alterar a propriedade 'JDBC URL:' para 'jdbc:h2:mem:testdb' sem as aspas e clique em connect. 

