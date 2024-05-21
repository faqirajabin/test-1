package package1;

import java.util.Scanner;

public class primenumberforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean isPrime = true;
		if(number<=1)
		{
			isPrime=false;
		}else
		{
			for(int i=2;i<=Math.sqrt(number);i++)
			{
				if(number%2==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println("number is prime");
		}else
		{
			System.out.println("number is not a prime");
		}

	}

}
