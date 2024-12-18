package io.github.naoreveze.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/exercises")
public class ExerciseController {


    @GetMapping
    public String alReady() {
        return "<h1> That's Ok! </h1>";
    }
}
