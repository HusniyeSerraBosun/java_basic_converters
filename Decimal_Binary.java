package converters;
import java.util.*;
public class Decimal_Binary {

	public static void main(String[] args) {
		//A Java program to convert from decimal to binary.
			Scanner scanner=new Scanner(System.in);
			
			while (true) {
				System.out.print("Enter a decimal number: ");
				int decimal=scanner.nextInt();
				
				String binary="";
				
				while (decimal>0) {
					binary=(decimal%2)+binary;
					decimal=decimal/2;
				}
				System.out.println("Binary equivalent is "+binary);
		}
	}
}
