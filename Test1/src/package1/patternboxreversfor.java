package package1;

public class patternboxreversfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		for(int i=row-1;i>=0;i--)
		{
			for(int j=0;j<row-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
