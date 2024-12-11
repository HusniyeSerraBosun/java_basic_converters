package converters;

import java.util.Scanner;

public class Binary_Hexadecimal {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a binary number (type 'exit' to quit : ");
			String binary=scanner.next();
			
			if(binary.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the program...");
				break;
			}
			while(binary.length()%4!=0) {
				binary="0"+binary;
			}
			StringBuilder hexa = new StringBuilder();
			
			for(int i=0;i<binary.length();i+=4) {
				String group = binary.substring(i,i+4);
				int decimalValue=Integer.parseInt(group,2);
				String hexaChar=Integer.toHexString(decimalValue).toUpperCase();
				hexa.append(hexaChar);
			}
			String result=hexa.toString().replaceFirst("^0+","");
			System.out.println("The hexadecimal result is: "+hexa);
		}
		scanner.close();
	}

}
