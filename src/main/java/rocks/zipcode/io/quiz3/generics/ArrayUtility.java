package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if(count % 2 == 1)
                return array[i];
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if(count % 2 == 0)
                return array[i];
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for(SomeType type : array)
            if(type.equals(valueToEvaluate)){
                count++;
            }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        ArrayList<SomeType> target = new ArrayList<>();
        Arrays.stream(array).filter(predicate::apply).forEach(target::add);
        return target.toArray(Arrays.copyOf(array,0));
    }
}
