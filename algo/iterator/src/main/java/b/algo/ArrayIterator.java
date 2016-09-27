package b.algo;

public class ArrayIterator<T> implements Iterator {

	private final T[] array;
	private int current;
	private final int first;
	private final int last;

	public ArrayIterator(T[] array, int first, int count){
		if (array == null) throw new IllegalArgumentException();
		this.array = array;
		this.first = first;		
		this.last = first + count;
	}

	public ArrayIterator(T[] array){
		this(array, 0, array.length - 1);
	}

	public void first(){
		current = first;			
	}

	public void last(){
		current = last;
	}

	public void next(){
		current++;
	}

	public void previous(){
		current--;
	}

	public boolean isDone(){
		return current < first || current > array.length - 1;
	}

	public Object current() throws IteratorOutOfBoundsException {
		if (isDone()) throw new IteratorOutOfBoundsException("Iterator out of bounds");
		return array[current];
	}
}