public class Actors{
	public static void main(String[] args){
	//char[] ca = {0x4e, \u004e, 78};
	// !! does not compile, unicode has to be between ''-s
	char[] ca = {0x4e, '\u004e', 78};
	System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));
	System.out.println(Character.getNumericValue(ca[1]));
	System.out.println((int)ca[0]);
	}
}