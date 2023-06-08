package pro.sky.skyprocalculator.service;

import org.springframework.stereotype.Service;

@Service

public class BaseMathFunctionServiceImpl implements BaseMathFunctionService {

    @Override
    public Integer plus(String a, String b) {
        Integer result = Integer.parseInt(a) + Integer.parseInt(b);

        return result;
    }

    @Override
    public Integer minus(String a, String b) {
        Integer result = Integer.parseInt(a) - Integer.parseInt(b);

        return result;
    }

    @Override
    public Integer multiply(String a, String b) {
        Integer result = Integer.parseInt(a) * Integer.parseInt(b);

        return result;

    }

    @Override
    public Integer divide(String a, String b) {
        Integer result = Integer.parseInt(a) / Integer.parseInt(b);

        return result;

    }


}
