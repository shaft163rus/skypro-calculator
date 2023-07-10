package pro.sky.skyprocalculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import pro.sky.skyprocalculator.exception.NotAllParamsGivenException;

@Service

public class BaseMathFunctionServiceImpl implements BaseMathFunctionService {


    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(IllegalArgumentException e) {
        return "An error occurred: " + e.getMessage();
    }

    @ExceptionHandler(NotAllParamsGivenException.class)
    public String handleNotAllParamsGivenException(NotAllParamsGivenException e) {
        return "An error occurred: " + e.getMessage();
    }

    @Override
    public String plus(String a, String b) {
        checkParamsGiven(a, b);
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return Integer.toString(result);
    }

    @Override
    public String minus(String a, String b) {
        checkParamsGiven(a, b);

        int result = Integer.parseInt(a) - Integer.parseInt(b);
        return Integer.toString(result);
    }

    @Override
    public String multiply(String a, String b) {
        checkParamsGiven(a, b);

        int result = Integer.parseInt(a) * Integer.parseInt(b);
        return Integer.toString(result);

    }

    @Override
    public String divide(String a, String b) {
        try {
            int result = Integer.parseInt(a) / Integer.parseInt(b);
            return Integer.toString(result);

        } catch (IllegalArgumentException e) {
            throw e;
        }

    }

    @Override
    public void checkParamsGiven(String a, String b) throws NotAllParamsGivenException {

        if (a == null || b == null) {
            throw new NotAllParamsGivenException("One or all parameters cannot be null");
        }
    }





}
