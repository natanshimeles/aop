package example.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello";
    }
}
