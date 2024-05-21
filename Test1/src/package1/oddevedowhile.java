package package1;

public class oddevedowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			if(i%2==0 && i<=50) 
			{
				System.out.println(i);
			}
			else if(i%2==1 && i<=100 && i>=51) {
				System.out.println(i);
			}
			
			i++;
		}while(i<=100);

	}

}
