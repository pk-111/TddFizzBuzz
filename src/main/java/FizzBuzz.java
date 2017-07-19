public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {
        if ((number % 15) == 0)
            return "FizzBuzz";
        else if ((number % 3) == 0)
            return "Fizz";
        else if ((number % 5) == 0)
            return "Buzz";
        return String.valueOf(number);
    }
}
