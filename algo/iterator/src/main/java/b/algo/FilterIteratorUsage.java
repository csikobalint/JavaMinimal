package b.algo;

import java.util.Arrays;
import java.util.logging.Filter;
import java.util.stream.Stream;

/**
 * Created by Bálint on 2016. 10. 02..
 */
public class FilterIteratorUsage {

    public static void main(String[] args){
        String[] strings = {"A", "b", "C", "D", "e", "f"};
        FilterIterator<String> i = new FilterIterator<String>(new ArrayIterator<String>(strings), new Predicate<String>() {
            public boolean evaluate(String s) {
                return s.toUpperCase().equals(s);
            }
        });
        for (i.first();!i.isDone(); i.next()){
            System.out.println(i.current());
        }

        System.out.println("Same effect with java 8");
        Arrays.stream(strings).filter(s->s.toUpperCase().equals(s)).forEach(System.out::println);

    }
}
