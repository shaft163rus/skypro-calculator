package pro.sky.skyprocalculator.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



import org.springframework.web.bind.annotation.ControllerAdvice;
@RestControllerAdvice


public class ExceptionHandlerController {
    @ExceptionHandler({IllegalStateException.class, ArithmeticException.class})
    public String incorrectValue(RuntimeException e) {
        return e.getMessage();

}


}
