# Dynamic PDF Generator

![](https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/HeroImage.jpg)

## About
Dynamic PDF Generator is a application using which user can generate the pdf of all the details which they store in the database.

## ER Diagram
<p align="left">
  <img width="700" height="297" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/ER%20Diagram.png">
</p>

## Features

- Seller and Buyer record can be registerd to the database
- All the data can be shown in a PDF format
- User can download the PDF file into it's local machine
- Seller can see all the details by entering the seller ID


## Setup and user guide
```
Starting up the server from the springBoot application
```
<p align="left">
  <img width="500" height="297" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/DataBaseRunning.png">
</p>

```
Home page for front end of Swagger-ui
```
<p align="left">
  <img width="500" height="250" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/LandingPage_Swagger.png">
</p>
<p align="left">
  <img width="500" height="250" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/Swagger_Schema.png">
</p>

## Technologies And Dependencies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Web
- Devtools
- MySQL
- Lombok
- Maven
- Swagger

## Swagger Documentation
```
http://localhost:8888/swagger-ui/index.html
```

## API Root And Endpoint

- Register one Seller to the database
- Method : POST
```
http://localhost:8888/seller/register
```

- Register one Buyer to the database
- Method : POST
```
http://localhost:8888/buyer/register/{sellerId}
```

- Get the Seller by id from the database
- Method : GET
```
http://localhost:8888/seller/{sellerId}
```

- Get the Buyer by id from the database
- Method : GET
```
http://localhost:8888/buyer/{buyerId}
```

- Download the PDF by passing the sellerId
- Method : GET
```
http://localhost:8888/pdf/{sellerId}
```
