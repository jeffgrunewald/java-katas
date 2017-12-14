package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static String convert(Integer input) {
        String output;
        if (input % 5 == 0 && input % 3 == 0) {
            output = "fizzbuzz";
        } else if (input % 5 == 0) {
            output = "buzz";
        } else if (input % 3 == 0) {
            output = "fizz";
        } else {
            output = input.toString();
        }
        return output;
    }

    public static List<String> game(List<Integer> input) {
        List<String> output = new ArrayList<>();
        input.stream()
                .map(intElem -> convert(intElem))
                .forEachOrdered(output::add);
        return output;
    }
}