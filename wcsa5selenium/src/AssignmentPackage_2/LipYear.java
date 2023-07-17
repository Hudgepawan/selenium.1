package AssignmentPackage_2;

import java.util.Scanner;

public class LipYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year =sc.nextInt();
		if(year%2==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
			      System.out.println("not leap year");
				}
			}
			else
			{
				System.out.println("normal leap year");
			}
			
		}
		else
		{
			System.out.println("normal year");
		}
		

	}

}
