angularjs-springmvc-sample-boot
===============================

An example application using AnguarJS/Bootstrap as frontend and Spring MVC as REST API producer.

This version improved the original version, including:

* Introduction of Gulp build system to processing the static resources
* The frontend UI can be run standalone via NodeJS eco-system
* An option provided and allow you to package the static resources as part of final jar and run the application via `mvn spring-boot:run` directly

##Requirements

* JDK 8

 Oracle Java 8 is required, go to [Oracle Java website](http://java.oracle.com) to download it and install into your system. 
 
 Optionally, you can set **JAVA\_HOME** environment variable and add *&lt;JDK installation dir>/bin* in your **PATH** environment variable.

* Apache Maven

 Download the latest Apache Maven from [http://maven.apache.org](http://maven.apache.org), and uncompress it into your local system. 

 Optionally, you can set **M2\_HOME** environment varible, and also do not forget to append *&lt;Maven Installation dir>/bin* your **PATH** environment variable.  

* NodeJS

 NodeJS is required to build the frontend static resources.
 
 Download [NodeJS](http://nodejs.org) and install it into your local system. 
 
 After it is installed, open terminal, and using `node -v` command to confirm.
 
      node -v 
      >v4.2.2
 
  `bower` is also requried to install the runtime dependencies, and `gulp` is chosen as our build tools for the statics resources.
 
      npm install -g bower
      npm install -g gulp
 
## Get the source codes

Get a copy of the source codes into your local system.

    git clone https://github.com/hantsy/angularjs-springmvc-sample-boot


## Run the project

### Run frontend UI and backend respectively

1. Run the backend API server via Spring Boot.

        spring-boot:run

  The backend APIs will run on port 9000.

2. Run the frontend UI standalone.
   
        npm install
        bower install
        gulp serve

  By default, gulp serves the frontend UI static resources on port 3000.

3. Go to [http://localhost:3000](http://localhost:3000) to test it.

### Run the project via Spring Boot maven plugin
     
1. Run the following command to resovle the dependencies of the frontend static resources.
   
        npm install
        bower install

2. Run the backend API server with `spring-boot` command.

        spring-boot:run -Dstatic-resources

3. Go to [http://localhost:9000](http://localhost:9000) to test it. 

If you want to explore the REST API docs online, there is a *Swagger UI* configured for visualizing the REST APIs, just go to [http://localhost:9000/swagger-ui.html](http://localhost:9000/swagger-ui.html).


