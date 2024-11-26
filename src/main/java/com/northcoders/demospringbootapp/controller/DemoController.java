package com.northcoders.demospringbootapp.controller;
import com.northcoders.demospringbootapp.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

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

//    public  String getCity(){
//        WebClient client = WebClient.create("https://geocoding-api.open-meteo.com/v1/search");
//
//    }

    @GetMapping("/city_{city_name}")
    public String city(@PathVariable String city_name){
        String uri = "https://geocoding-api.open-meteo.com/v1/search?name=" + city_name.toString();

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
//        return "yes";
    }
}
