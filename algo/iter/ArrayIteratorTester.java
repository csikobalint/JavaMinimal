package algo.iter;
import org.junit.Test;

public class ArrayIteratorTester{

	@Test
	public void firstTest(){
		Iterator iter = new ArrayIterator<String>(new String[]{"A","B", "C"});
		iter.first();
		while (!iter.isDone()){
			System.out.println(iter.current());
			iter.next();
		}
	}

}