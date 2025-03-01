package firstSteps;

public class FloatPointPrecisionAndChallenge {

	public static void main(String[] args) {
		
		int myIntValue = 5;
		float myFloatValue = 5f;
		double myDoubleValue = 5d;
		
		System.out.println(myIntValue);
		System.out.println(myFloatValue);
		System.out.println(myDoubleValue);

		myIntValue = 5 / 2;
		System.out.println(myIntValue);
		
		myFloatValue = 5f / 2f;
		System.out.println(myFloatValue);
		
		myDoubleValue = 5d / 2d;
		System.out.println(myDoubleValue);
		
		myIntValue = 5 / 3;
		System.out.println(myIntValue);
		
		myFloatValue = 5f/ 3f;
		System.out.println(myFloatValue);
		
		myDoubleValue = 5d / 3d;
		System.out.println(myDoubleValue);
		
		myDoubleValue = 5.00 / 3.00;
		System.out.println(myDoubleValue);
		
		myDoubleValue = 5.00 / 3;
		System.out.println(myDoubleValue);
		
		double numberOfPounds = 200d;
		
		double convertedKilograms = numberOfPounds * 0.45359237d;
		
		System.out.println(convertedKilograms);
		
		double pi = 3.1415927d;
		
		System.out.println(pi);
		
		double anotherNumber = 3_000_000.4_567_890d;
		
		System.out.println(anotherNumber);
	}

}
