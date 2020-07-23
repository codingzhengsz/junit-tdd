package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_1() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;

        // when
        String result = fizzBuzz.play(inputNumber);

        // then
        assertEquals("1", result);
    }

    @Test
    void should_return_Fizz_when_count_off_given_3() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;

        // when
        String result = fizzBuzz.play(inputNumber);

        // then
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_count_off_given_5() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;
        // when

        String result = fizzBuzz.play(inputNumber);
        // then
        assertEquals("Buzz", result);
    }
}