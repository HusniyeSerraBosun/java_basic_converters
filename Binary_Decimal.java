package converters;
import java.util.*;
public class Binary_Decimal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a binary number (or type 'exit' to quit): ");
			String binary=scan.nextLine();
			
			if (binary.equalsIgnoreCase("exit")) {
				System.out.println("Exiting program...");
				break;
			}
			int length=binary.length();
			int decimal=0;
			
			for(int i=0;i<length;i++) {
		
				char bit=binary.charAt(length-1-i);
				
				if (bit=='1') {
					decimal+=Math.pow(2,i);
				}
				
			}
			System.out.println("The result is "+decimal);
		}
	}
}