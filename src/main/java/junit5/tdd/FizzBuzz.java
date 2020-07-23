package junit5.tdd;

public class FizzBuzz {

    public String play(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "Fizz";
        }
        if (inputNumber % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(inputNumber);
    }

}
