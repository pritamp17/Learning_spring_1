package com.pritamCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.sax.SAXResult;
import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
       SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")       // get request
    public GreetResponse greet()
    {
        GreetResponse response =  new GreetResponse(
                "Hello",
                List.of("C++","java","JS"),
                new Person("Pritam",28,100)
        );
        return response;
    }

    record Person(String name, int age, double cash)
    {

    }
    record GreetResponse( // record ->  classes whose objective is to simply contain data and carry it between modules
    String greet,
    List<String> favProgrammingLang,
    Person person
    ) {

    }  ///  for giving response in the form of json

    // and if not greet we could make the class below and output would be same
//    class GreetResponse{
//
//            private final String greet;
//
//            GreetResponse(String greet)
//            {
//                this.greet = greet;
//            }
//
//            public String getGreet(){
//                return greet;
//            }
//
//    }
}
