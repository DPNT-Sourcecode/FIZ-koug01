package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }
    @Test
    public void fizzBuzzMultipleOfThree() {
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(13));
    }

    @Test
    public void fizzBuzzMultipleOfFive() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(51));
    }

    @Test
    public void fizzBuzzMultipleOfThreeAndAllValuesEqual() {
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(33));
    }

    @Test
    public void fizzBuzzMultipleOfThreeAndContainsFiveAndAllValuesEqual() {
        assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(555));
    }

    @Test
    public void fizzBuzzMultipleOfThreeAllValuesEqualEven() {
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(222));
    }

    @Test
    public void fizzBuzzMultipleOfThreeAllValuesEqualOdd() {
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(333));
    }

    @Test
    public void fizzBuzzNotAMultipleOfThreeFiveFifteen() {
        assertEquals("19", fizzBuzzSolution.fizzBuzz(19));
    }
}