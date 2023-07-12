package pro.sky.skyprocalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.service.BaseMathFunctionService;
import pro.sky.skyprocalculator.service.BaseMathFunctionServiceImpl;

@RestController
@RequestMapping("/calculator")

public class MathController {
    private final BaseMathFunctionService mathFunctionService;

    public MathController(BaseMathFunctionServiceImpl mathFunctionService) {
        this.mathFunctionService = mathFunctionService;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return mathFunctionService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return mathFunctionService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return mathFunctionService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return mathFunctionService.divide(num1, num2);
    }

}
