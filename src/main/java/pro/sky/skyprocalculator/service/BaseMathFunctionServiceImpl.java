package pro.sky.skyprocalculator.service;

import org.springframework.stereotype.Service;

@Service

public class BaseMathFunctionServiceImpl implements BaseMathFunctionService {


    @Override
    public String plus(String a, String b) {
        if (a == null || b == null) {
            throw   new IllegalArgumentException("null values are not allowed");
        }

        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return Integer.toString(result);
    }

    @Override
    public String minus(String a, String b) {
        if (a == null || b == null) {
            throw   new IllegalArgumentException("null values are not allowed");
        }

        int result = Integer.parseInt(a) - Integer.parseInt(b);
        return Integer.toString(result);
    }

    @Override
    public String multiply(String a, String b) {
        if (a == null || b == null) {
            throw   new IllegalArgumentException("null values are not allowed");
        }

        if (b.equals("0")) {
            throw   new IllegalArgumentException("division by zero is not allowed");
        }


        int result = Integer.parseInt(a) * Integer.parseInt(b);
        return Integer.toString(result);

    }

    @Override
    public String divide(String a, String b) {


        if (a == null || b == null) {
            throw   new IllegalArgumentException("null values are not allowed");
        }

            int result = Integer.parseInt(a) / Integer.parseInt(b);
            return Integer.toString(result);


        

    }


}
