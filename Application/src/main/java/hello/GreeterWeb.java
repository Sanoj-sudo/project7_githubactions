package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@SpringBootApplication
@Controller
public class GreeterWeb {

    public static void main(String[] args) {
        SpringApplication.run(GreeterWeb.class, args);

        // Print Java version for debug
        System.out.println("Running on Java version: " + System.getProperty("java.version"));
    }

    // Root route: HTML form
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                    <head>
                        <meta charset="UTF-8">
                        <title>Greeter App</title>
                    </head>
                    <body>
                        <h2>Welcome to the Greeter App</h2>
                        <form action="/greet" method="get">
                            <label for="name">Enter your name:</label>
                            <input type="text" id="name" name="name" required>
                            <button type="submit">Submit</button>
                        </form>
                    </body>
                </html>
               """;
    }

    // /greet route: Shows the greeting message
    @GetMapping("/greet")
    @ResponseBody
    public String greet(@RequestParam(defaultValue = "Guest") String name) {
        String safeName = HtmlUtils.htmlEscape(name);
        return String.format("""
                <!DOCTYPE html>
                <html>
                    <head>
                        <meta charset="UTF-8">
                        <title>Greeting</title>
                    </head>
                    <body>
                        <h2>Hello %s, how may I help you?</h2>
                        <a href="/">Back</a>
                    </body>
                </html>
               """, safeName);
    }
}
