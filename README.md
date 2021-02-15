# Previous Topic

# spring5webapp
Simple Web Application

JPA : Java Persistence API

JPA is what Hibernate is written to. 

POJO : Plain Old Java Objects

Entity Relationship Diagram


To model relations --> start.jhipstres.tech/jdl-studio/

```
*_* --> many-to-many relationship
```

JPA Entities are put in package called Domain or Model.

JPA require a zero arg constructor


JPA is an ORM (object relational mapping) tool, there is sometimes "leakage" in mappings.

### Equality

Equals & Hash Code


### Spring Data Repositories

Spring Data JPA is made to work with Hibernate

It implements repository pattern.

### H2 In-Memory Database:

To view console, add this line to the `application.propeties`:
```
spring.h2.console.enabled=true
```

Copy the JDBC connect string from the Spring Console when you ru the app.

### Spring MVC:

Spring uses a model called Spring MVC, stands for Model, View, and Controller.

It is a common design pattern, dates back to 70s developed by a Xerox Engineer.

This is widely used across different platforms and languages. It is not a new paradigm, it is so successful is because it is good at separating out concerns.

`Client(Request)` ---> `Controller(Traffic Cop)` ---> `Model`  ---> `Controller` ---> `View`  ---> `Controller`  ---> `Client`


* Model should not have a Business Logic
* Controller should be a traffic cop
* View is used to render the view

We will be using Thymeleaf as `View`.

### Thymeleaf

Pronounced as Time Leaf

Thymeleaf is a natural templating engine, works from an HTML document via the Thymeleaf namespace, where `th` are Thymeleaf directives to tell Thymeleaf how to render the document.


### Spring Framework Petclinic

Sample application designed to show how the Spring application frameworks can be used to build simple, but powerful database-oriented applications.


#### Software Layers:

* Views
* Controller
* Service
* Repository

---

* Spring Project: https://github.com/spring-projects/spring-petclinic
* SpringBoot Project: https://github.com/spring-petclinic/spring-framework-petclinic



# Pet Clinic
