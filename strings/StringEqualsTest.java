package strings;


/**
* strings\StringEqualsTest.java:3: error: class StringTest is public, should be declared in a file named StringTest.java
* public class StringTest{
*/
public class StringEqualsTest{

	public static void main(String... args){
		dontUseEqualsSignForComparison();
		dontUseEqualsForStringBuilderComparison();
	}

	private static void dontUseEqualsSignForComparison(){
		System.out.println("String\n");
		String a = "labda";
		String b = "labda";
		System.out.println("a == b: " + (a == b));
		System.out.println("a.equals(b): " + a.equals(b));
	}

	private static void dontUseEqualsForStringBuilderComparison(){
		System.out.println("\nStringBuilder");
		StringBuilder a = new StringBuilder("labda");
		StringBuilder b = new StringBuilder("labda");
		System.out.println("a == b: " + (a == b));
		System.out.println("a.equals(b): " + a.equals(b));
	}


}