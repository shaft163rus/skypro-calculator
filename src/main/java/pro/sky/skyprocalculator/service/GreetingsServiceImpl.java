package pro.sky.skyprocalculator.service;

import org.springframework.stereotype.Service;

@Service

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String showGreeting() {
        return "Welcome to calculator";
    }

}
