# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.9-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.9-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.9-SNAPSHOT/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

# FOR BUILDING THE APPLICAITON

* First build the applicaiton (JAVA MAVEN - spring-boot)
    - command for build 
    - $mvn dependency:resolve        - for dependency resolve from other lib as mentioned in pom.xml
    - $mvn spring-boot:run           - test dry run locally at mentioned or default port number (http://localhost:8080/)
    - $mvn clean package             - Build Applicaiton and create a JAR file for applicaiton execution
    - $docker-compose up             - For build the docker images test run locally at desired hosting applicaiton endpoints via NGINX (http://localhost/)