package fizzbuzz;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;


public class FizzBuzzTest {

    @Test
    public void supplyIntegerReturnsInteger() {
        FizzBuzz tester = new FizzBuzz(asList(1));
        assertEquals(asList("1"), tester.convert());
    }
    @Test
    public void supplyTwoIntsGetTwoInts() {
        FizzBuzz tester2 = new FizzBuzz(asList(1, 2));
        assertEquals(asList("1", "2"), tester2.convert());
    }
    @Test
    public void supplyThreeGetFizz() {
        FizzBuzz tester3 = new FizzBuzz(asList(3));
        assertEquals(asList("fizz"), tester3.convert());
    }
}