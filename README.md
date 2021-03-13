# Previous Topic

# spring5webapp
Simple Web Application

JPA : Java Persistence API

JPA is what Hibernate is written to. 

POJO : Plain Old Java Objects

Entity Relationship Diagram


To com.amdcloudguru.petclinic.model relations --> start.jhipstres.tech/jdl-studio/

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

Spring uses a com.amdcloudguru.petclinic.model called Spring MVC, stands for Model, View, and Controller.

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

### 3. Liskov Substitution Principle
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



## Dependency Injection

* A needed dependency is injected by another object

* Annotation used in Spring to indicate you want a dependency injected --> `@Autowired`

### Types of Dependency Injection:

* By Class Properties --> not preferred
* By Setters --> Area of much debate
* By Constructor --> Most Preferred

### Concrete Class vs Interfaces

Dependency Injection can be done by either concrete class or via Interfaces. `Dependency Injection using Interfaces` is most preferred.


### Inversion of Control (IOC)

Technique to allow dependencies to be injected at runtime. Control is done by the framework i.e., Spring.

### Inversion of Control vs Dependency Injection

* IoC and DI are easily confused
* DI refers much to the composition of your class
* IOC is the runtime environment of your code (i.e., Spring Framework's IoC Container)
* Spring is in control of the injection of dependencies

`Dependency Inversion` addresses `abstractions`, while `Dependency Injection` refers to the injection of dependencies into a Class.

### Best Practices:

* Use `Constructor` injection over `Setter` injection
* Use `final` properties for injected components
* Whenever practical, code to an interface

### Qualifiers
The qualifier annotation helps disambiguate bean references when Spring would otherwise not be able to do so.

It's an annotation used to connect a controller to a specific Service(Business Logic) if there's multiple services and Spring cannot identify which Service should the Controller call.

### Bean
In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.

`Primary Bean` is used in Services to mark it as a primary service to use if there's multiple services and your main application fails to identify which service to call.

### Spring Profiles

Default Profile: `@Profile({"XYZ", "default"})`


### Spring Bean Lifecycle

Two callback interfaces you can implement to tap into the bean lifecycle:

1. InitializingBean
2. DisposableBean

Two annotations used to access the Spring Bean Lifecycle:

1. `@PostConstruct`
2. `@PreDestroy`

`Q`. How do you specify a bean name you want injected?

`Ans`. @Qualifier


### Multi-Module Project for Data Model

Data Model - Hibernate & JPA

### Difference between super() and this() in java

`super()` as well as `this()` both are used to make constructor calls. `super()` is used to call Base class’s constructor(i.e, Parent’s class) while `this()` is used to call current class’s constructor.

### Spring Configuration Options

1. `XML Based Configuration` (Introduced in SpringBoot V2 and still used in V5)

- Common in legacy Spring Applications
- Still supported in Spring Framework 5.X


2. `Annotation Based Configuration`
- Introduced in Spring Framework 3.0
- Picked up via 'Component Scans'
- Refers to class level annotations
- @Controller, @Service, @Component, @Repository

3. `Java Based Configuration`
- Introduced in Spring Framework 3.0
- Uses Java Classes to define Spring Beans
- Configuration classes are defined with @Configuration annotaton
- Beans are declared with @Bean annotation - bring Spring components in context

4. `Groovy Bean Definition DSL Configuration`
- DSL (Domain Specific Language)
- Introduced in Spring Framework 4.0
- Allows you to declare beans in Groovy
- Borrowed from Grails

### Which Configuration option to use?

- You can use combination of all methods
- They will work seamlessly together to define beans in Spring Context
- Industry trend is to favor Java based configuration


### Spring Framework Stereotypes

- Stereotype - a fixed general image or set of characteristics which represent a particular type of person or thing.
- Spring Stereotypes are used to define Spring Beans in the Spring context
- Available Stereotypes - @Component, @Controller, @RestController, @Repository (access Data Layer), @Service (Backing up usually a Controller)

### Spring Bean Scopes

1. `Singleton` (default) Only one instance of the bean is creating in the IoC container

2. `Prototype` - A new instance is created each time the bean is requested

3. `Request` - A single instance per http request. Only valid in the context of a web-aware Spring ApplicationContext.

4. `Context` -  A single instance per http session. Only valid in the context of a web-aware Spring ApplicationContext.

5. `Global-session` - A single instamce per global session. Typically Only used in a Portlet context. Only valid in the context of a web-aware Spring ApplicationContext.

6. `Application` - Bean is scoped to the lifecycle of a ServletContext. Only valid in the context of a web aware.

7. `Websocket` - Scopes a single bean definition to the lifecycle of a WebSocket. Only valid in the context of a web-aware Spring ApplicationContext.

`Custom Scope` - Spring Scopes are extensible, and you can define your own scop by implementing Spring's "Scope" interface. You will almost never create one.

You cannot override Singleton scope, spring will stop you from that. You do not need declaration for singleton scope. In Java configuration use @Scope annotation for any other scopes you want to use.

---------------------
### Spring Framework Stereotypes :

There is no difference between `@Service` and `@Component`

`@RestController` :  Convenience annotation representing @Controller and @ResponseBody - Used for writing REST APIs


--- 
`@Component`: Indicates that an annotated class is a "component" and it will be created as a bean
`@Controller`: Indicates that an annotated class has the role of a Spring MVC "Controller"
`@RestController`: Convenience Annotation which extends @Controller, and adds @ResponseBody
`@Repository`: Indicates class is a "Repository", originally defined by Domain-Driven Design (Evas, 2003) as "a mechanism for encapsulation storage, retrieval, and search behavior which emulates a collection of objects"
`@Service`: Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design(Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."


#### Spring Component Scan

1. Spring Beans defined with Spring Stereotypes are detected with Spring component scan
2. On startup Spring is told to scan packages for classes with Spring Stereotype annotations
3. This configuration is Spring Framework specific, NOT Spring Boot
4. Spring Boot's auto configuration will tell Spring to perform a component scan of the package of the main class
    - This includes all sub packages of the main class package
5. When using Spring Boot, if clas is outside of the main class package tree, you must declare the package scan


### Java Based Configuration

Instead of using @Service in a class name as Spring Annotation for `Annotation Based Configuration`, we can create a `config` and annotate it with @Configuration and create beans with @Bean annotation and their names will be the Class names of the Service class you just removed @Service annotation from. 


### Load Data

`Spring Boot Method`: 
```
implements CommandLineRunner
```