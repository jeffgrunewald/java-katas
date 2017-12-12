package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<Integer> input;
    private List<String> output;

    public FizzBuzz(List<Integer> input) {
        this.input = input;
        this.output = new ArrayList<>();
    }

    public List<String> convert() {
        for(Integer intElem: this.input) {
            String strElem;
            if (intElem % 5 == 0) {
                strElem = "buzz";
            } else if ( intElem % 3 == 0) {
                strElem = "fizz";
            }
            else {
                strElem = intElem.toString();
            }
            this.output.add(strElem);
        }
        return this.output;
    }

}