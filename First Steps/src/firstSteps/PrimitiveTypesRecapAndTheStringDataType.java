package firstSteps;

public class PrimitiveTypesRecapAndTheStringDataType {

	public static void main(String[] args) {
		
		String myString = "This is a string";
		
		System.out.println(myString);
		
		System.out.println("myString is equals to "+myString);
		
		myString = myString + ", and this is more.";
		
		System.out.println(myString);

		System.out.println("myString is equals to "+myString);
		
		myString = "I wish i had \u00241,000,000.00";
		
		System.out.println(myString);
		
		String numberString = "250.55";
		
		numberString = numberString + "49.45";
		
		System.out.println(numberString);
		
		String lastString = "10";
		
		int myInt = 50;
		
		lastString = lastString + myInt;
		
		System.out.println(lastString);
		
		double doubleNumber = 120.47;
		
		lastString = lastString + doubleNumber;
		
		System.out.println(lastString);
	}

}
