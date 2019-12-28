

public class FizzBuzz {
    static String of(int number) {
        String s = "";
        if (number <= 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
           s += "FizzBuzzWhizz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            s += "FizzBuzz";
        } else if (number % 3 == 0 && number % 7 == 0) {
            s += "FizzWhizz";
        } else if (number % 5 == 0 && number % 7 == 0) {
            s += "BuzzWhizz";
        } else if (number % 3  == 0) {
            s += "Fizz";
        } else if (number % 7  == 0) {
            s += "Whizz";
        } else if (number % 5 == 0) {
            s += "Buzz";
        } else {
            s += number;
        }
        return s;
    }


}
