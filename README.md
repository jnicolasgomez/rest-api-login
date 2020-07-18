# rest-api-login
Rest API with login made in Java, uses jwt Token for authentication

### Getting Started
1. Clonar el repositorio
2. Para ejecutar con maven, en la carpeta del repositorio ingresar los siguientes comandos 

  `mvn compile`
  
  `mvn spring-boot:run`
  
 El servicio queda corriendo en el puerto 8080


### Endpoints

**POST /api/register/**

Request Body:

`{
    "userName": "user1",
    "password": "123"
}`

**POST /api/login/**

Request Body:

`{
    "userName": "user1",
    "password": "123"
}`


**GET /api/user/history/**

Reponse Body:

`[
    {
        "amount": 130000.0,
        "name": "retiro",
        "date": "2020-07-18T17:34:39.142+00:00"
    },
    {
        "amount": 15000.0,
        "name": "retiro",
        "date": "2020-07-18T17:34:39.142+00:00"
    },
    {
        "amount": 600000.0,
        "name": "consignacion",
        "date": "2020-07-18T17:34:39.142+00:00"
    }
]`

**GET /api/restaurant/** (Not implemented yet)






