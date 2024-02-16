package com.test.tester;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
  
@SpringBootApplication
@RestController
class TesterApplicationTests {

    @RequestMapping("/products")
    public String home() {
        return "A brand new product";
    }

    @RequestMapping("/app") 
    public String getMessage() { 
        return "Dockerizing Spring Boot Application"; 
    } 

    public static void main(String[] args) { 
        SpringApplication.run(TesterApplicationTests.class, args); 
    } 

}
