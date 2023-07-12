package pro.sky.skyprocalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.skyprocalculator.service.BaseMathFunctionService;
import pro.sky.skyprocalculator.service.BaseMathFunctionServiceImpl;
import pro.sky.skyprocalculator.service.GreetingsService;
import pro.sky.skyprocalculator.service.GreetingsServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SkyproCalculatorApplicationTests {
	GreetingsService greetingsService;
	BaseMathFunctionService baseMathFunctionService;

	@BeforeEach
	public void setUp(){

		baseMathFunctionService = new BaseMathFunctionServiceImpl();
	}

	@Test
	void testGreetings() {
		greetingsService = new GreetingsServiceImpl();
        String actual = greetingsService.showGreeting();
        String expected = "Welcome to calculator";

		assertEquals(expected, actual);
    }


	@Test
	void plus() {
		String actual = baseMathFunctionService.plus("1", "2");
        String expected = "3";

        assertEquals(expected, actual);
	}

	@Test
	void minus() {
		String actual = baseMathFunctionService.minus("1", "2");
		String expected = "-1";

		assertEquals(expected, actual);
	}

	@Test
	void multiply() {
		String actual = baseMathFunctionService.multiply("4", "2");
		String expected = "8";

		assertEquals(expected, actual);
	}

	@Test
	void divide() {
		String actual = baseMathFunctionService.divide("4", "2");
		String expected = "2";

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("getMultiplyData")
	void testMultiply(String a, String b, String expected) {
		assertEquals(baseMathFunctionService.multiply(a, b), expected);
	}

	private static Stream<Arguments> getMultiplyData() {
		return Stream.of(
				Arguments.of("2", "3", "6"),
				Arguments.of("4", "3", "12"),
				Arguments.of("-3", "3", "-9")
		);
	}

	@ParameterizedTest
	@MethodSource("getPlusData")
	void testPlus(String a, String b, String expected) {
		assertEquals(baseMathFunctionService.plus(a, b), expected);
	}

	private static Stream<Arguments> getPlusData() {
		return Stream.of(
				Arguments.of("2", "3", "5"),
				Arguments.of("4", "3", "7"),
				Arguments.of("-3", "3", "0")
		);
	}

	@ParameterizedTest
	@MethodSource("getMinusData")
	void testMinus(String a, String b, String expected) {
		assertEquals(baseMathFunctionService.minus(a, b), expected);
	}

	private static Stream<Arguments> getMinusData() {
		return Stream.of(
				Arguments.of("2", "3", "-1"),
				Arguments.of("4", "3", "1"),
				Arguments.of("-3", "3", "-6")
		);
	}







	@Test
	void contextLoads() {
	}

}
