package package1;

public class digitdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 100;
		System.out.println("all 3 digit numbers");
		do
		{
		    System.out.println(i);
			i++;
		}while(i<1000);
		
		System.out.println("all 3 digit even numbers");
		i =100;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			} 
			i++;
		}while(i<1000);
		System.out.println("all 3 digit odd numbers");
		i=100;
		do
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;
		}while(i<1000);
	
	}

}
