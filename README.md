# GreenStitch
Application of spring security for login and signup with Jwt token. Maintaining the Login and Signup with the Jwt token with role where they have authorities accoring to their role. Like Admin have authority to see the all customer list. 

## REST API Use for below functions
- Create Admin an Customer account.
- Customer can Login and Signup.

## Tech Stack
- Java
- Hibernate
- Spring Framework
- Spring Boot with JPA
- MySQL
- Maven
- Lombak

## Modules
- Customer

## MySql database details

Install and connect with database

```bash
#db specific properties
spring.datasource.url=jdbc:mysql://localhost:8888/green
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=port
```
## API Functionality are-

- #### Customer features
1.  User can Login and Signup.
2.  User can see one particular.
3.  User can see all the list.
