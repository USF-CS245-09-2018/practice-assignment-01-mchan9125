
public class FibonacciIterative implements Fibonacci{
	public int fibonacci(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		
		else{
			int num1 = 1;
			int num2 = 1;
			int fibOutput = 0;
			for(int i = 3; i <= n; i++){
				fibOutput = num1 + num2;
				num1 = num2;
				num2 = fibOutput;
			}
			return fibOutput;
		}
	}

}