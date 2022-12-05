package se.jensen.javacourse.week3.MatildaAdeleng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EndNotes {

    @GetMapping("/author/name")
    public String firstName(){
        return "Matilda";
    }

    @GetMapping ("/author")
    @ResponseBody
    public Person postPerson (){
        return new Person("Matilda", "Adeleng", 26);
    }


}
