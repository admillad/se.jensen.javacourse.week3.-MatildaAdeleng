package se.jensen.javacourse.week3.MatildaAdeleng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@SpringBootApplication
@RestController
public class MatildaAdelengApplication {
    public static void main(String[] args) {
        SpringApplication.run(MatildaAdelengApplication.class, args);
    }


    @GetMapping("/author")
    public Object JsonPerson() {
        return new Person("Matilda", "Adeleng", 26);
    }

    @GetMapping("/square-number/{nr}")
    public String squareNumber(@PathVariable("nr") String strNr) {
        double dobNr;
        try {
            dobNr = Double.parseDouble(strNr);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "enter a number");
        }
        return "" + dobNr * dobNr;
    }
}
