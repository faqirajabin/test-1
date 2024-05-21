package package1;

import java.util.Scanner;

public class operationsswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a case 1 -4");
		int operations=sc.nextInt();
		System.out.println("enther the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		int sum=0;
		int sub=0;
		int mul=0;
		int div=0;
		switch(operations)
		{
		case 1:
			sum=a+b;
			System.out.println("sum = "+sum);
			break;
		case 2:
			sub=a-b;
			System.out.println("difference ="+sub);
			break;
		case 3:
			mul=a*b;
			System.out.println("multiplication ="+mul);
			break;
		case 4:
			div=a/b;
			System.out.println("division ="+div);
			break;
			default:
				System.out.println("invalied choice ");
		}
		

	}

}
