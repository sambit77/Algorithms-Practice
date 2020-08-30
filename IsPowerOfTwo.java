import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{


		int num = sc.nextInt();
		if(num==0)
		{
			break;
		}

		//a number is power of two if it cintains exactly one set bit in its binary representation
		boolean exacltyOneSetBit = (num & (num-1)) == 0;			
		if(exacltyOneSetBit)
		{
			System.out.println("power of two");
		}
		else
		{
			System.out.println("not a power of two");
		}
		System.out.println("enter new num or enter 0 to exit");
		
		}
	}
}