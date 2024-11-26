package com.northcoders.demospringbootapp.controller;
import com.northcoders.demospringbootapp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello there!";
    }

    Person person = new Person("Simon", 21, "simon@northcoders.co", "North", "Beans");
    @GetMapping("/person")
    public Person getPerson() {
        return person;
    }
}
