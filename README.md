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

### H2 In-Memory Database

To view console, add this line to the `application.propeties`:
```
spring.h2.console.enabled=true
```

Copy the JDBC connect string from the Spring Console when you ru the app.

### Spring MVC

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

## SOLID OOP Principles

* Date back to March 1995
* From Robert Uncle Bob Martin
* 5 principles focus on dependency management

### 1. Single Responsibility Principle
```Just because you can doesn't mean you should```

* Every Class should have a single responsibility
* There should never be more than one reason for a class to change
* Your classes should be small. No more than a screen full of code
* Avoid 'god' classes
* Split big classes into smaller classes

### 2. Open Closed Principle
```Open Chest Surgery is NOT Needed when Putting on a Coat```

* Your classes should be open for extension
* But closed for modification
* You should be able to extend a classes behavior, without modifying it
* Use private variables with getters and seters - ONLY when you need them
* Use abstract base classes

### 3. Liskob Substitution Principle
```If it looks like a duck, quaks like a duck, but needs batteries - You probably have the wrong abstraction```

* By Barbara Liskov in 1998
* Objetcts in a program would be replaceable with instances of their subtypes WITHOUT altering the correctness of the program
* Violations will often fail the "Is a" test
* A Square is a "Recangle"
* However, a rectangle "Is Not" a Square

### 4. Interface Segregation Principle
```You want me to plug this in, where?```

* Make fine grained interfaces that are client specific
* Many client specific interfaces are better than one "general purpose" interface
* Keep your components focused and minimize dependencies between them
* Notice replationship to the Single Responsibility Principle?
* i.e., avoid 'god' interfaces

### 5. Dependency Inversion Principle
```Would you solder a lamp directly to the electical wiring in a wall?```

* Abstractions should not depend upon details
* Details should depend upon abstractions
* Important that higher level and lower level objects depend on the same abstraction interaction
* This is not the same as Dependency Injection - whici is how objects obtain dependent objects

### SUMMARY
* The SOLID Principles of OOP will lead you to better quality code
* Your code will be more testable and easier to maintain
* A key theme is avoiding tight coupling in your code



