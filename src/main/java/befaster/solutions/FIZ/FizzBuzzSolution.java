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
            returnValue+= "buzz ";
        }

        if ((number % 3 == 0 && value.contains("3") || (number %5 ==0 && value.contains("5")))) {
            if (number%2 != 0) {
                returnValue += "fake ";
            }
            returnValue +=  "deluxe";

        }

        return returnValue.trim().equals("") ? value: returnValue.trim();

    }

}