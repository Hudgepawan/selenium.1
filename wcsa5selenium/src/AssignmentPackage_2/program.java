package AssignmentPackage_2;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		String avg="";
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String Value = sc.next();
		
		for(int i=0;i<Value.length();i++)
		{
			ch=Value.charAt(i);
			avg=ch+avg;
			
		}
		System.out.println("Reversed word is:"+ avg);
		
		
		

	}

}
