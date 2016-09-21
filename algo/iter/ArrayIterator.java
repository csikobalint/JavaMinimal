package algo.iter;

public class ArrayIterator<T> implements Iterator {

	private final T[] array;
	private int current;
	private final int first;
	private final int last;

	public ArrayIterator(T[] array){
		if (array == null) throw new IllegalArgumentException();
		this.array = array;
		this.first = 0;		
		this.last = array.length - 1;
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
		return array[current];
	}
}