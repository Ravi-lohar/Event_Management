<div align = "center">
  <h1> University Event Management</h1>
 </div>



## Framework and Language
* Java 
* SpringBoot

## Dependencies
  * SpringWeb
  * Lombok
  * Validation
  * JPA
  * h2 database
    
## Database Used 
  * h2 Database
    
## Data flow
  **The project has four main packages which are following** 
  
* Controller - Controller package has all the api and Crud operations.
* Services - Service class has all the business logic and it will return the result of that method which is called by controller class . 
* Repository - Respository has all the datasource in it i uses h2 database
* Model - Model class has two main class with student and event
> The flow of data is from controller has all the api and logics of that api has in service class and
service class is using the repository class which has all the data it keeps data source.The api called by user call the controller method
return the logic which is written in service class so service class object is called and service class use data source of repo class.

## Data Structure
    ArrayList
## Project Summary 
  This is a University Event Management we can do many more operations in this project like
  * Add student
  * update student department
  * delete student
  * Get all students 
  * Get student by Id
  * Add event
  * Update event
  * Delete event
  * Get All events by date
