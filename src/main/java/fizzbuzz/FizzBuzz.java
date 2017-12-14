package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
        return input.stream()
                .map(FizzBuzz::convert)
                .collect(toList());
    }
}