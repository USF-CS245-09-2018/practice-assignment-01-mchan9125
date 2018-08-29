public class FactorialRecursive implements Factorial {

	public int factorial(int n){
		return n*factorial(n-1);
	}
	
}