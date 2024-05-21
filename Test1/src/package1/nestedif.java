package package1;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int exam =sc.nextInt();
		int viva =sc.nextInt();
		if(exam >=30)
		{
			if(viva>=10)
			{
				System.out.println("Eligible  ");
			}
			else
			{
				System.out.println("not eligible in viva");
			}
			
		}
		else
		{
			System.out.println("not eligible");
		}

	}

}
