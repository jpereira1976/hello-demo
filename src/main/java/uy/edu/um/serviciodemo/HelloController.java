package uy.edu.um.serviciodemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    @PostMapping("/hello")
    public String helloWorld(@RequestBody HelloRequest request) {
        return String.format(request.getSayHello().sayHello(request.getFirstName()));
    }
}
