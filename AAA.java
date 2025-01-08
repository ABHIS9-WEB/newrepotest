import java.util.Arrays;
import java.util.Scanner;

public class AAA {

	public static void main(String[] args) 
	{ 
		//Create an object of scanner class
		Scanner scanner=new Scanner(System.in);
		
		//User's inputs
		System.out.println("Enter first string: ");
		String str1 = scanner.nextLine();//.replaceAll("\\s+", "").toLowerCase();
		System.out.println("Enter second string: ");
		String str2 = scanner.nextLine();//.replaceAll("\\s+", "").toLowerCase();
		
		
		//Checking for same length
		if(str1.length()==str2.length())
		{
		
			//Convert strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			//Sort the char array
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1,charArray2);
			
			if(result)
			{ 
				System.out.println(str1 + " and " + str2 + " are anagram");
			}
			else
			{
				System.out.println(str1 + " and " + str2 + " are not anagram");
			}
		}
		scanner.close();
	}
}
	