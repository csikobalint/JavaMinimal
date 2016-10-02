package b.algo;
public interface Iterator<T>{

	void first();

	void last();

	void next();

	void previous();

	boolean isDone();

	T current() throws	IteratorOutOfBoundsException;

}