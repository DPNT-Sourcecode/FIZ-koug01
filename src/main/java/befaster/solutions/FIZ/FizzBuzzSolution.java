package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String value = String.valueOf(number);
        if (number %15 == 0 || (value.contains("3") && value.contains("5"))) {
            return "fizz buzz";
        }
        if (number % 3 == 0 || value.contains("3")) {
            return "fizz";
        }
        if (number % 5 == 0 || value.contains("5")) {
            return "buzz";
        }
        return String.valueOf(number);
    }

}
