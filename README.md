# CHALLENGE ONE - FORUMHUB - JAVA

## Sobre o projeto
Este projeto é uma versão simplificada do Fórum da Alura, 
com as funcionalidades de cadastrar e fazer login com um Usuario além de fazer registro, listagem, remoção e atualização de tópicos

## Tecnologias usadas
- Java 17
- Maven
- Spring boot
- Spring web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security

## Como rodar

- Fazer o clone do repósitório e entrar no projeto.
  
- Antes de rodar é necessário fazer umas configurações nas variaveis de ambiente. Nos três pontinhos, tem que clicar no ``Edit``
  
<img width="746" height="226" alt="image" src="https://github.com/user-attachments/assets/c53d3623-8d2b-4b8f-b9ec-818096ddc3f3" />

- Clique no ``Modify Options`` e ative o ``Environment varibles`` se não estiver ativo ainda
  
<img width="681" height="332" alt="image" src="https://github.com/user-attachments/assets/067112f9-f34a-4013-9637-7f11cfc61bda" />

- Dentro do ``Environment varibles``, você vai colocar as seguintes variáves:

  - Nome do seu banco que você deve criar
  ````bash
  DB_NAME
  ````

  - O seu usuario do banco
  ````bash
  DB_USER
  ````

  - A sua senha do banco
  ````bash
  DB_PASSWORD
  ````

- Após configurar, é só rodar o projeto que as migrations vão criar as tabelas em seu banco.

**OBS: Deve ser criado um schema(banco de dados) no MySQL antes de fazer essas configurações**

## Como Usar

Com o projeto rodando você utilizar uma plataforma de API de sua escolha, como o ``Postman``. Lá você vai criar os endpoints que irei colocar aqui em baixo:

### Usuário/Login

 - POST Cadastro de Usuario
  
 ````bash
 http://localhost:8080/cadastrar
 ````
 exemplo de cadastro:
 ````bash
 {
    "nome" : "Carlos",
    "email" : "carlos.teste@gmail.com",
    "senha" : "789456"
 }
 ````

 **Onde será cadastrado um usuario para fazer o login**

- POST Login
 ````bash
  http://localhost:8080/login
 ````
 exemplo de login:
 ````bash
 {
    "email" : "carlos.teste@gmail.com",
    "senha": "789456"
 }
 ````

 **Onde vai ser feito o login/validação, após a validação vai ser mandado como resposta um tokem, que deve ser usado nos outros endpoints para desbloquea-los**


### Tópico

 - POST Registrar topico
   ````bash
   http://localhost:8080/topicos
   ````
   exemplo de registro
   ````bash
   {
      "titulo" : "teste",
      "mensagem" : "teste de api",
      "autor" : "carlos"
   }
   ````


  - GET Listar todos os topicos
    ````bash
    http://localhost:8080/topicos
    ````


  - GET Listar topico(especifico por id)
    ````bash
    http://localhost:8080/topicos/{colocar ID}
    ````


  - PUT Atualizar topico
    ````bash
    http://localhost:8080/topicos
    ````
    exemplo de atualização
    ````bash
    {
      "id" : 1,
      "titulo" : "teste de atualização",
      "mensagem" : "teste de api"
    }
    ````


  - DELETE Deletar topico
    `````bash
    http://localhost:8080/topicos/{colocar ID}
    ``````
    
    

  
