package firstSteps;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		
		System.out.println(byteValue);
		
		short shortValue = 20;
		
		System.out.println(shortValue);
		
		int intValue = 50;
		
		System.out.println(intValue);
		
		long longValue = 50000L + (10L * (byteValue + shortValue + intValue));
		
		System.out.println(longValue);
		
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		
		System.out.println(shortTotal);
		
	}

}
