package package1;

import java.util.Scanner;

public class elseiftask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark>=91 && mark<=100)
		{
			System.out.println("A+");
		}
		else if(mark>=81 && mark<=90)
		{
			System.out.println("A");
		}
		else if(mark>=71 && mark<=80)
		{
			System.out.println("B+");
		}
		else if(mark >=61 &&  mark <=70)
		{
			System.out.println("B");
		}
		else if(mark >=51 && mark<=60)
		{
			System.out.println("C+");
		}
		else if(mark>=41 && mark<=50)
		{
			System.out.println("C");
		}
		else if(mark>=31 && mark<=40)
		{
			System.out.println("D+");
		}
		else if(mark >= 21 && mark <=30)
		{
			System.out.println("D");
		}else if(mark <20)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("invalied mark");
		}

	}

}
