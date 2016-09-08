package strings;

class StringTest{

	public static void main(String... args){
		dontUseEqualsSignForComparison();
	}

	private static void dontUseEqualsSignForComparison(){
		String a = "labda";
		String b = "labda";
		System.out.println("a == b: " + (a == b));
		System.out.println("a.equals(b): " + a.equals(b));
	}

}