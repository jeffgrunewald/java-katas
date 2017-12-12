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
    @Test
    public void supplyFiveGetBuzz() {
        FizzBuzz tester4 = new FizzBuzz(asList(5));
        assertEquals(asList("buzz"), tester4.convert());
    }
    @Test
    public void supplyNineGetFizz() {
        FizzBuzz tester5 = new FizzBuzz(asList(9));
        assertEquals(asList("fizz"), tester5.convert());
    }
    @Test
    public void supplyTenGetBuzz() {
        FizzBuzz tester6 = new FizzBuzz(asList(10));
        assertEquals(asList("buzz"), tester6.convert());
    }
    @Test
    public void supplyFifteenGetFizzBuzz() {
        FizzBuzz tester7 = new FizzBuzz(asList(15));
        assertEquals(asList("fizzbuzz"), tester7.convert());
    }
}