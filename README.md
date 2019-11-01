# AutoMaster-Backend-Server
Backend server has been developed using Springboot, MySQL and Firebase. To run the backend server, you need to have

-	Java 8 or above
-	Apache Maven 3.2.2 or above
-	MySQL 5.7.21 or above
-	Firebase project/database

Database configuration for MySQL
1.	Create a MySQL database called car_1
2.	Open automaster-backend-server – src/main/resources/application.properties and add you MySQL username and password
```
Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)\
spring.datasource.url= jdbc:mysql://localhost:<MySQL port>/car_1\
spring.datasource.username= <username>\
spring.datasource.password= <password>\
```
3.	There are 3 USER ROLES that you need to enter into the table called roles in MySQL database.
```
INSERT INTO roles(name) VALUES('ROLE_USER');\
INSERT INTO roles(name) VALUES('ROLE_PM');\
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```
Run these commands to run the backend server
```
1.	mvn –U idea:idea
2.	mvn clean install
3.	mvn spring-boot:run
```
now the backend server is running

## Account Creating 
**Admin Account**

In order to create an admin account in the system (In order to get admin privileges), you need to follow below steps:
1.	Open Postman application
2.	Set it to POST and give the url as: http://localhost:8081/api/auth/signup

3.	Set the JSON body as follow for admin account and hit the button Send
```
{
	"name" : "Admin",
	"username" : "admin",
	"email" : "<admin email>",
	"role": [
		"admin"
	],
	"password" : "<admin password>"
}
```
4.	Set the JSON body as follow for superAdmin account and hit the button Send
```
{
	"name" : "SuperAdmin",
	"username" : "superAdmin",
	"email" : "<superAdmin email>",
	"role": [
		"admin",
		"pm",
		"user"
	],
	"password" : "<super admin password>"
}
```
**User Account**

Basic functionalities and services of Automaster vehicle consultancy application you can get without registering in the system. But in order to get a full comprehensive consultancy service, you need to have get registered yourself in the system by creating an account.

Any vehicle user can get theirself registered in the system without any trouble just by giving their personal information and creating an account in Automaster vehicle consultancy application.
