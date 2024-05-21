package package1;

import java.util.Scanner;

public class gradeusingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		String grade=null;
		switch(mark/5)
		{
		case 4:
		case 3:
			grade="A";
			break;
		case 2:
			grade="B";
			break;
		case 1:
			grade="C";
			break;
			default:
			grade="F";
		}
		System.out.println("Grade ="+grade);
	}
}
