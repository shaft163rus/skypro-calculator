package pro.sky.skyprocalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.service.GreetingsService;
import pro.sky.skyprocalculator.service.GreetingsServiceImpl;

@RestController

public class GreetingsController {
    private final GreetingsService greetingsService;

    public GreetingsController(GreetingsServiceImpl greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/calculator")
    public String showGreeting() {
        return greetingsService.showGreeting();
    }




}
