package package1;

import java.util.Scanner;

public class digitpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>99 && a<1000)
		{
				System.out.println(a+" is a positive 3 digit number");
		}
		else
		{
			System.out.println(a+" is not 3 digit positive number");
		}

	}

}
