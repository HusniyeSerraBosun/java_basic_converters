package converters;
import java.util.*;
public class Decimal_Hexadecimal {

	public static void main(String[] args) {
		//A Java program to convert from decimal to hexadecimal.
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter a decimal number: ");
			int decimal=scanner.nextInt();
			
			String hexa="";
			
			while (decimal>0) {
				int remainder= decimal%16;
				
				if (remainder == 10) {
                    hexa = "A" + hexa;
                } else if (remainder == 11) {
                    hexa = "B" + hexa;
                } else if (remainder == 12) {
                    hexa = "C" + hexa;
                } else if (remainder == 13) {
                    hexa = "D" + hexa;
                } else if (remainder == 14) {
                    hexa = "E" + hexa;
                } else if (remainder == 15) {
                    hexa = "F" + hexa;
                } else {
                    hexa = remainder + hexa;
                }
				decimal=decimal/16;
			}
			System.out.println("Hexadecimal equivalent is "+hexa);
		}

	}

}
