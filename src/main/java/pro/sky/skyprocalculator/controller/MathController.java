package pro.sky.skyprocalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.service.BaseMathFunctionService;
import pro.sky.skyprocalculator.service.BaseMathFunctionServiceImpl;

@RestController

public class MathController {
    private final BaseMathFunctionService mathFunctionService;

    public MathController(BaseMathFunctionServiceImpl mathFunctionService) {
        this.mathFunctionService = mathFunctionService;
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " + " + num2 + " = " + mathFunctionService.plus(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " - " + num2 + " = " + mathFunctionService.minus(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam String num2) {
        return num1 + " * " + num2 + " = " + mathFunctionService.multiply(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " / " + num2 + " = " + mathFunctionService.divide(num1, num2);
    }

}
