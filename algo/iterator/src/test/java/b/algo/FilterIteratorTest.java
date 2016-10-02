package b.algo;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Bálint on 2016. 10. 02..
 */
public class FilterIteratorTest {

    private final static String[] ARRAY = {"A", "B", "C"};


    @Test
    public void testNoFilter(){
        Iterator expectedIterator = new ArrayIterator<String>(ARRAY);
        Iterator underlyingIterator = new ArrayIterator<String>(ARRAY);

        Iterator iterator = new FilterIterator(underlyingIterator, new DummyPredicate<String>(true, expectedIterator));
        iterator.first();

        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());

        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[1], iterator.current());

        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[2], iterator.current());

        iterator.next();
        assertTrue(iterator.isDone());
        try{
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e){
            System.out.println("exception as expected");
        }

        assertTrue(expectedIterator.isDone());
        assertTrue(underlyingIterator.isDone());
    }

    @Test
    public void testFilterAll(){
        Iterator expectedIterator = new ArrayIterator<String>(ARRAY);
        Iterator underlyingIterator = new ArrayIterator<String>(ARRAY);

        Iterator iterator = new FilterIterator(underlyingIterator, new DummyPredicate<String>(false, expectedIterator));
        iterator.first();

        assertTrue(iterator.isDone());
        try{
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e){
            System.out.println("exception as expected");
        }

        assertTrue(expectedIterator.isDone());
        assertTrue(underlyingIterator.isDone());
    }


    private static class DummyPredicate<T> implements Predicate<T> {
        private final Iterator expectedIterator;
        private final boolean result;

        public DummyPredicate(boolean result, Iterator expectedIterator) {
            this.result = result;
            this.expectedIterator = expectedIterator;
        }

        public boolean evaluate(T o) {
            assertSame(expectedIterator.current(), o);
            expectedIterator.next();
            return result;
        }
    }
}