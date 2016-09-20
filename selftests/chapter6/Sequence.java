import java.util.*;
public class Sequence{
	public static void main(String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("apple");
		myList.add("carrot");
		myList.add("banana");
		myList.add(1, "plum");
		System.out.println(myList);
	}
}