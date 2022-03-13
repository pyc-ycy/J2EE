package boot.hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hello {
    public static void main(String[] args) {
        SpringApplication.run(Hello.class);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot";
    }
}
