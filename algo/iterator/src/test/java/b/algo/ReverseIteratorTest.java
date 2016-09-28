package b.algo;
import org.junit.Test;
import static org.junit.Assert.*;
public class ReverseIteratorTest{
	
	
	@Test
	public void test1(){
		String[] a = new String[]{"A", "B", "C", "D", "E", "F"};
		Iterator i = new ReverseIterator(new ArrayIterator(a));
		i.first();
		assertFalse(i.isDone());
		assertEquals(a[5], i.current());
		i.next();
		assertFalse(i.isDone());
		assertEquals(a[4], i.current());
		i.next();
		assertFalse(i.isDone());
		assertEquals(a[3], i.current());
		i.next();
		assertFalse(i.isDone());
		assertEquals(a[2], i.current());
		i.next();
		assertFalse(i.isDone());
		assertEquals(a[1], i.current());
		i.next();
		assertFalse(i.isDone());
		assertEquals(a[0], i.current());
		i.next();
		assertTrue(i.isDone());
		
	}
	
	
	
}