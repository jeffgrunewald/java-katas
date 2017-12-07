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
}