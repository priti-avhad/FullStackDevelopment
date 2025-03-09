/*Q1. Demonstrate manual boxing and unboxing for all primitive types in Java. 
	Write methods for each type, such as converting a double into a Double.

Example:

    Double dObj = Double.valueOf(12.5);
    double d = dObj.doubleValue();*/

import java.util.*;
public class boxing_unboxing
{
	public static void main(String x[])
	{
		//integer type
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer");
		int intPrimitive=scanner.nextInt();
		Integer intBoxed=Integer.valueOf(intPrimitive);//boxed
		int intUnboxed=intBoxed.intValue();//unboxed
		System.out.println("Boxed integer:"+intBoxed);
		System.out.println("unboxed integer:"+intUnboxed);
		
		//double type
		System.out.print("Enter a double: ");
        double doublePrimitive = scanner.nextDouble();
        Double doubleBoxed = Double.valueOf(doublePrimitive); // Boxing
        double doubleUnboxed = doubleBoxed.doubleValue(); // Unboxing
        System.out.println("Boxed Double: " + doubleBoxed);
        System.out.println("Unboxed Double: " + doubleUnboxed);
		
		//float type
		System.out.print("Enter a float: ");
        float floatPrimitive = scanner.nextFloat();
        Float floatBoxed = Float.valueOf(floatPrimitive); // Boxing
        float floatUnboxed = floatBoxed.floatValue(); // Unboxing
        System.out.println("Boxed Float: " + floatBoxed);
        System.out.println("Unboxed Float: " + floatUnboxed);
		
		//long type
		System.out.print("Enter a long: ");
        long longPrimitive = scanner.nextLong();
        Long longBoxed = Long.valueOf(longPrimitive); // Boxing
        long longUnboxed = longBoxed.longValue(); // Unboxing
        System.out.println("Boxed Long: " + longBoxed);
        System.out.println("Unboxed Long: " + longUnboxed);
		
		//short type
		System.out.print("Enter a short: ");
        short shortPrimitive = scanner.nextShort();
        Short shortBoxed = Short.valueOf(shortPrimitive); // Boxing
        short shortUnboxed = shortBoxed.shortValue(); // Unboxing
        System.out.println("Boxed Short: " + shortBoxed);
        System.out.println("Unboxed Short: " + shortUnboxed);

		//byte type
		System.out.print("Enter a byte: ");
        byte bytePrimitive = scanner.nextByte();
        Byte byteBoxed = Byte.valueOf(bytePrimitive); // Boxing
        byte byteUnboxed = byteBoxed.byteValue(); // Unboxing
        System.out.println("Boxed Byte: " + byteBoxed);
        System.out.println("Unboxed Byte: " + byteUnboxed);

		//character type
		System.out.print("Enter a character: ");
        char charPrimitive = scanner.next().charAt(0);
        Character charBoxed = Character.valueOf(charPrimitive); // Boxing
        char charUnboxed = charBoxed.charValue(); // Unboxing
        System.out.println("Boxed Character: " + charBoxed);
        System.out.println("Unboxed Character: " + charUnboxed);
		
		//boolean type
		System.out.print("Enter a boolean (true/false): ");
        boolean booleanPrimitive = scanner.nextBoolean();
        Boolean booleanBoxed = Boolean.valueOf(booleanPrimitive); // Boxing
        boolean booleanUnboxed = booleanBoxed.booleanValue(); // Unboxing
        System.out.println("Boxed Boolean: " + booleanBoxed);
        System.out.println("Unboxed Boolean: " + booleanUnboxed);

	}
	
}