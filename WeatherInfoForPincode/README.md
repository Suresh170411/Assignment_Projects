# Weather Info For Pincode

![](https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/HeroImage_WP.jpg)

## About
This application is to generate a single REST API for weather information for a particular day for a provided pincode.

## Schemas
<p align="left">
  <img width="400" height="100" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/Schema_1.png">
</p>

<p align="left">
  <img width="400" height="320" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/Schema_2.png">
</p>

<p align="left">
  <img width="400" height="370" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/Schema_3.png">
</p>

## Features

- User can provide a pincode and can get all the weather information for that particular location.


## Setup and user guide
```
Starting up the server from the springBoot application
```
<p align="left">
  <img width="500" height="297" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/ServerRun_WP.png">
</p>

```
Swagger-ui
```
- Select the Try it out button on the top right corner
<p align="left">
  <img width="500" height="250" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/Swagger_1.png">
</p>

- In the check box pass the State Code or Pincode and then hit the Execute button
<p align="left">
  <img width="500" height="300" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/Swagger_2.png">
</p>

- After hitting the Excute button the result will be shown just like the following
<p align="left">
  <img width="500" height="300" src="https://github.com/Suresh170411/FreightFox_Assignment/blob/main/ScreenShots/WeatherPincode/Swagger_3.png">
</p>


## Technologies And Dependencies Used
- Java
- Spring Boot
- Spring Web
- Devtools
- Lombok
- Maven
- Swagger

## Swagger Documentation
```
http://localhost:8888/swagger-ui/index.html
```

## API Root And Endpoint

- Find the weather information about the specific pincode
- Method : GET
```
http://localhost:8888/find/{stateCode}
```
