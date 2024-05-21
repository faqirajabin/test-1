package package1;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		if(n%2==0)
		{
			s=n*n;
			System.out.println(s);
			
		}
		else 
		{
			System.out.println("number is not even");
		}

	}

}
