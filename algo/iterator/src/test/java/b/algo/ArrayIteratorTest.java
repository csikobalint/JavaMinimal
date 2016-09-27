package b.algo;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIteratorTest{

	@Test
	public void firstTest(){
		String[] array = new String[]{"A","B", "C"};
		Iterator iter = new ArrayIterator<String>(array);
		iter.first();
		assertFalse(iter.isDone());
		assertEquals(array[0], iter.current());
		iter.next();
		assertFalse(iter.isDone());
		assertEquals(array[1], iter.current());
		iter.next();
		assertFalse(iter.isDone());
		assertEquals(array[2], iter.current());
		iter.next();
		assertTrue(iter.isDone());
		try{
			iter.current();
			fail("should have thrown exception");
		} catch (IteratorOutOfBoundsException e){
			//exception as expected
		}
	}


	@Test
	public void secondTest(){
				String[] array = new String[]{"A", "B", "C", "D", "E", "F"};
		Iterator iter = new ArrayIterator<String>(array, 2, 4);
		iter.first();
		assertFalse(iter.isDone());
		assertEquals(array[2], iter.current());
		iter.next();
		assertFalse(iter.isDone());
		assertEquals(array[3], iter.current());
		iter.next();
		assertFalse(iter.isDone());
		assertEquals(array[4], iter.current());
		assertFalse(iter.isDone());
		iter.next();
		assertEquals(array[5], iter.current());
		assertFalse(iter.isDone());
		iter.next();
		assertTrue(iter.isDone());
	}
	
	//TODO test invalid params

}