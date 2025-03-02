package firstSteps;

public class OperatorsOperandsExpressions {

	public static void main(String[] args) {
		
		int result = 1 + 2; // 1 + 2 = 3
		
		System.out.println(result);
		
		int previousResult = result;
		
		System.out.println(previousResult);
		
		result = result - 1; // 3 - 1 = 2
		
		System.out.println(result);
		
		System.out.println("Previous Result = "+previousResult);
		
		char firstChar = 'A';
		
		char secondChar = 'B';
		
		System.out.println(firstChar+secondChar);
		
		System.out.println(""+ firstChar + secondChar);
		
		result = 2;
		
		result = result * 10; // 2 * 10 = 20
		
		System.out.println(result);
		
		result = result / 4; // 20 / 4 = 5
		
		System.out.println(result);
		
		result = 5;
		
		result = result % 3; // the remainder of (5 % 3) = 2
		
		System.out.println(result);

	}

}
