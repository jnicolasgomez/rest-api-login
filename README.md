# rest-api-login
Rest API with login made in Java

### Getting Started
1. Clonar el repositorio
2. Para ejecutar con maven, en la carpeta del repositorio ingresar los siguientes comandos 

  `mvn compile`
  
  `mvn spring-boot:run`
  
 El servicio queda corriendo en el puerto 8080


### Endpoints

**POST /api/register/**

Body:

`{
    "userName": "user1",
    "password": "123"
}`

**POST /api/login/**

Body:

`{
    "userName": "user1",
    "password": "123"
}`


**GET /api/user/history/**



