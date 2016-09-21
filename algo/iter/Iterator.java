package algo.iter;
public interface Iterator{

	void first();

	void last();

	void next();

	void previous();

	boolean isDone();

	Object current() throws	IteratorOutOfBoundsException;

}