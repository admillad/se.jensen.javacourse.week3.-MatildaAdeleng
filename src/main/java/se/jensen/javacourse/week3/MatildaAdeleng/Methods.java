package se.jensen.javacourse.week3.MatildaAdeleng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Methods {

    @GetMapping("/author/name")
    public static String firstName() {
        return "Matilda";
    }

    @GetMapping("/author")
    public Person postPerson() {
        return new Person("Matilda", "Adeleng", 26);
    }

    @GetMapping ("/square-number/{nr}")
     public double square () {
       return 0;
    }
    //return a 400 status with response entity (body: , httpStatus.BAD_Request)

}
