package b.algo;

public class ReverseIterator implements Iterator{
	
	private Iterator i;
	
	
	public ReverseIterator(Iterator i){
		this.i = i;
	}
	
	
	public void first(){
		i.last();
	}

	public void last(){
		i.first();
	}

	public void next(){
		i.previous();
	}
	

	public void previous(){
		i.next();
	}

	public boolean isDone(){
		return i.isDone();
	}

	public Object current() throws	IteratorOutOfBoundsException{
		return i.current();
	}
	
	
	
	
}