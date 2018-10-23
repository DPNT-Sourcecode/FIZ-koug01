package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String value = String.valueOf(number);
        String returnValue = "";
        if (number % 3 == 0 || value.contains("3")) {
            returnValue= "fizz ";
        }
        if (number % 5 == 0 || value.contains("5")) {
            returnValue=  returnValue + "buzz";
        }

        return returnValue.trim().equals("") ? value: returnValue.trim();

    }

}
