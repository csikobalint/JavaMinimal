package algo.iter;

public class PowerCalculator{
	private PowerCalculator(){}

	public static final PowerCalculator INSTANCE = new PowerCalculator();

	public int calculate(int a, int b){
		if (a < 0 || b < 0) throw new IllegalArgumentException();
		int product = 1;
		for (int i = 0; i < b; i++){
			product *= a;
		}
		return product;
	}

}