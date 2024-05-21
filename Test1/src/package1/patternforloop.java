package package1;

public class patternforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
