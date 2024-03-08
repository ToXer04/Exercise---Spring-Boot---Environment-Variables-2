package develhope.exercise.Exercise.Spring.Boot.Environment.Variables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
    @Autowired
    Environment environment;

    @GetMapping("/hello")
    public String helloMessage() {
        return "Hello from " + environment.getProperty("varTree.envName");
    }
}
