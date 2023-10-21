package saptamana1.tema.problema3.primitive;

import java.math.BigInteger;

/**
 * Rezolvati greselile din acest cod
 */
public class Primitive1
{
	public static void main(String[] args)
	{
		int intValue1= 1;
		int intValue2 = (int)5.1; //float intValue2 = 5.1; -> In any code unless some algorithm is done the values are correct and the variable type needs changing

		long longValue1 = 150000L;
		//long longValue2 = 10000000000000000000000000000000000L; //Issue to be fixed
		//Since long is limited to 15 the easy is to remove port of the number
		long longValue2 = 1000000000000000000L;
		//Or if the actual number is required it can be converted to a String and used as a BigInteger when calculations are needed
		String longValue2String = "10000000000000000000000000000000000";
		BigInteger longValue2BigNumber = new BigInteger(longValue2String);

		float floatValue1 = 1.3f;
		float floatValue2 = (float)23.123123; // OR float floatValue2 = 23.123123f;

		double doubleValue1 = 2.5d;
		double doubleValue2 = 123.443423d;

		boolean booleanValue1 = true;
		int booleanValue2 = 5; //boolean booleanValue2 = false;
		boolean booleanValue21 = false;

		char charValue1 = 'a';
		String charValue2 = "67c";  //char charValue2 = 'c';
		char charValue21 = 'c';

		System.out.println("Initial 'int value1 = 1' Fixed as 'int intValue1= 1' == " + intValue1);
		System.out.println("Initial 'int intValue2 = 5.1' Fixed as 'int intValue2 = (int)5.1' == " + intValue2);
		System.out.println("Initial 'long longValue1 = 150000L' Fixed as 'long longValue1 = 150000L' == " + longValue1);
		System.out.println("Initial 'long longValue2 = 10000000000000000000000000000000000L' Fixed as 'long longValue2 = 1000000000000000000L' == " + longValue2);
		System.out.println("Acesta este numarul meu lung scris ca String transformat in BigInteger: || Version 2 pentru longValue2 == " + longValue2BigNumber);
		System.out.println("Initial 'float floatValue1 = 1.3f' Fixed as 'float floatValue1 = 1.3f' == " + floatValue1);
		System.out.println("Initial 'float floatValue2 = 23.123123' Fixed as 'float floatValue2 = (float)23.123123' == " + floatValue2);
		System.out.println("Initial 'double doubleValue1 = 2.5d' Fixed as 'double doubleValue1 = 2.5d' == " + doubleValue1);
		System.out.println("Initial 'double doubleValue2 = 123.443423' Fixed as 'double doubleValue2 = 123.443423d' == " + doubleValue2);
		System.out.println("Initial 'boolean booleanValue1 = true' Fixed as 'boolean booleanValue1 = true' == " + booleanValue1);
		System.out.println("Initial 'boolean booleanValue2 = 5' Fixed as 'int booleanValue2 = 5' == " + booleanValue2 + " Version2 fix 'boolean booleanValue21 = false' == " + booleanValue21);
		System.out.println("Initial 'char charValue1 = 'a'' Fixed as 'char charValue1 = 'a'' == " + charValue1);
		System.out.println("Initial 'char charValue2 = 67c' Fixed as 'String charValue2 = \"67c\" ' == " + charValue2 + " Version2 fix 'char charValue21 = 'c'' == " + charValue21);

	}
}