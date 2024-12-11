package converters;
import java.util.*;
public class Binary_Octal {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Enter a binary number to convert octal ( or type 'exit' to quit):");
			String input=scanner.next();
			
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the program...");
				break;
			}
				StringBuilder octal= new StringBuilder();
				
				while(input.length()%3 !=0) {//to form groups of three correctly
					input="0"+input;
				}
				for(int i=0;i<input.length();i+=3) {
					String group=input.substring(i,i+3);
					int octaldigit=Integer.parseInt(group,2);//converts groups to decimal
					octal.append(octaldigit);//to add binaries together
				}
				
				String result = octal.toString().replaceFirst("^0+"," ");// remove leading zeros.
				System.out.println("The octal result is: "+result);
			
		}
		scanner.close();
	}

}
