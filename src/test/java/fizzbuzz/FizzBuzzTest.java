package fizzbuzz;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;


public class FizzBuzzTest {

    @Test
    public void supplyIntegerReturnsInteger() {
        assertEquals(asList("1"), FizzBuzz.game(asList(1)));
    }
    @Test
    public void supplyTwoIntsGetTwoInts() {
        assertEquals(asList("1", "2"), FizzBuzz.game(asList(1, 2)));
    }
    @Test
    public void supplyThreeGetFizz() {
        assertEquals(asList("fizz"), FizzBuzz.game(asList(3)));
    }
    @Test
    public void supplyFiveGetBuzz() {
        assertEquals(asList("buzz"), FizzBuzz.game(asList(5)));
    }
    @Test
    public void supplyNineGetFizz() {
        assertEquals(asList("fizz"), FizzBuzz.game(asList(9)));
    }
    @Test
    public void supplyTenGetBuzz() {
        assertEquals(asList("buzz"), FizzBuzz.game(asList(10)));
    }
    @Test
    public void supplyFifteenGetFizzBuzz() {
        assertEquals(asList("fizzbuzz"), FizzBuzz.game(asList(15)));
    }
}