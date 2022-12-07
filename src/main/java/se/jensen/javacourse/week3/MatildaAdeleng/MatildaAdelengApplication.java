package se.jensen.javacourse.week3.MatildaAdeleng;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MatildaAdelengApplication {
    public static void main(String[] args) {
        SpringApplication.run(MatildaAdelengApplication.class, args);
    }

    @GetMapping("/author/name")
    public static String firstName() {
        return "Matilda";
    }

    @GetMapping("/author")
    public Person getPerson(HttpServletRequest req,
                            @RequestBody Person reqBody) {
        Person matilda = new Person("Matilda", "Adeleng", 26);
        return reqBody;
    }

    @GetMapping("/square-number/{nr}")
    public double squared(@PathVariable double input) {
        double square = input * input;
        return square;
    }
    //return a 400 status with response entity (body: , httpStatus.BAD_Request)

}
