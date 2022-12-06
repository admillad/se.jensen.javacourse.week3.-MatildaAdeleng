package se.jensen.javacourse.week3.MatildaAdeleng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Methods {

    @GetMapping("/author/name")
    //PostMapping?
    public static String firstName(){
        return "Matilda";
    }

    @GetMapping
    //PostMapping        ("/author")
    @ResponseBody
    public Person postPerson (){
        return new Person("Matilda", "Adeleng", 26);
    }

    //  @GetMapping ("/square-number/{nr}")
   // public
    //return a 400 status with response entity (body: , httpStatus.BAD_Request)


}
