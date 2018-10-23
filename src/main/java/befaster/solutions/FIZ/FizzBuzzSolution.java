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
            returnValue=  returnValue + "buzz ";
        }
        if (number > 10) {
            boolean isIdentical = true;
            for (int i = 1; i < value.length(); i++) {
                if (value.charAt(i) != value.charAt(0)) {
                    isIdentical = false;
                    break;
                }
            }
            if (isIdentical) {
                if (number %2 ==0) {
                    returnValue = returnValue + "deluxe";
                }
                else {
                    returnValue = returnValue+ "fake deluxe";
                }
            }

        }
        return returnValue.trim().equals("") ? value: returnValue.trim();

    }

}
