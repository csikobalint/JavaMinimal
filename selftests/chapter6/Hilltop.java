public class Hilltop{
	public static void main(String[] args){
		String[] horses = new String[5];
		horses[4] = null;
		for ( int i = 0; i < horses.length; i++){
		  if (i < args.length) 
		  	horses[i] = args[i];
			System.out.println(horses[i].toUpperCase() + " ");
 		  
		}
	}
}

