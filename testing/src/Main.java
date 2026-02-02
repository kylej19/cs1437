import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
	/* 8 primitive data types
	 * string, boolean, byte, short, int, float, double, char
	 */
	float rate = 2.3f;
	double cost = 123.45; 
	int age = 22; // 4 bytes
	byte month = 127; //byte range -128-127
	boolean registered = true;
	char letter = 'a';
	String first = "John";
	String last = "Doe";

	System.out.println("Float: " + Float.BYTES);
	System.out.println("Double: " + Double.BYTES);
	System.out.println("Integer: " + Integer.BYTES);
	//System.out.println("Byte: " + Byte.BYTES);
	//System.out.println("Boolean: " + Boolean.BYTES);
	//System.out.println("Char: " + Char.BYTES);
	//System.out.println("String: " + String.BYTES);
	
    }
}
