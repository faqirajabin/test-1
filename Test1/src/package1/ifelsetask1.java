package package1;

import java.util.Scanner;

public class ifelsetask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		if(age>=18 && age<=14) {
			System.out.println("eligible for donating blood");
		}
		else
		{
			System.out.println("not eligible for donating blood");
		}
	}

}
