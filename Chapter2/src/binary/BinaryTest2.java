package binary;

public class BinaryTest2 {

	public static void main(String[] args) {
		int num1 = 0B00000000000000000000000000000101; //2진수 5
		int num2 = 0B11111111111111111111111111111011; //2진수 -5
		
		int sum = num1 + num2; //num1 과 num2 을 .
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
	}

}
