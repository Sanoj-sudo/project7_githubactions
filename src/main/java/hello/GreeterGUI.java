package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class GreeterWeb {

    public static void main(String[] args) {
        SpringApplication.run(GreeterWeb.class, args);
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello " + name + ", how may I help you?";
    }
}
