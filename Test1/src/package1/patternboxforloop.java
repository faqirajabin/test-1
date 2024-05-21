package package1;

public class patternboxforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		for(int i=0;i<row;i++)
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
