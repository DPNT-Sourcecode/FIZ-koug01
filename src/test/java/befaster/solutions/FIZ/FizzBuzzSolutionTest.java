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
    public void fizzBuzzMultipleOfFifteen() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(30));
    }

    @Test
    public void fizzBuzzNotAMultipleOfThreeFiveFifteen() {
        assertEquals("19", fizzBuzzSolution.fizzBuzz(19));
    }
}