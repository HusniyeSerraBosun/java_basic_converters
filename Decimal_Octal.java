package converters;
import java.util.*;
public class Decimal_Octal {

	public static void main(String[] args) {
		//A Java program to convert from decimal to octal.
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a decimal number: ");
			int decimal=scanner.nextInt();
			
			String octal="";
			
			while (decimal>0) {
				octal=(decimal%8)+octal;
				decimal=decimal/8;
			}
			System.out.println("Octal equivalent is "+octal);
		}
	}
}
