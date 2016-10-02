package b.algo;

import java.util.logging.Filter;

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
    }
}
