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
            switch (intElem) {
                case 3: strElem = "fizz";
                    break;
                default: strElem = intElem.toString();
                    break;
            }
            this.output.add(strElem);
        }
        return this.output;
    }

}