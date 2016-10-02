package b.algo;

/**
 * Created by Bálint on 2016. 10. 02..
 */
public class FilterIterator<T> implements Iterator {
    private final Iterator<T> i;
    private final Predicate<T> p;

    public FilterIterator(Iterator underlyingIterator, Predicate<T> predicate) {
        i = underlyingIterator;
        p = predicate;
    }

    public void first() {
        i.first();
        filterForwards();
    }


    public void last() {
        i.last();
        filterBackwards();
    }

    public void next() {
        i.next(); filterForwards();
    }

    public void previous() {
        i.previous();
        filterBackwards();
    }

    public boolean isDone() {
        return i.isDone();
    }

    public T current() throws IteratorOutOfBoundsException {
        return i.current();
    }


    private void filterForwards() {
        while (!isDone() && !p.evaluate(i.current())){
            i.next();
        }
    }

    private void filterBackwards() {
        while (!isDone() && !p.evaluate(i.current())){
            i.previous();
        }
    }
}
