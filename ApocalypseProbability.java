import java.util.*;
class A
{
	public static void main(String[] args) 
	{

		System.out.println(runNFamily(10));
	}
	public static int[] runOneFamily()
	{
		Random rm = new Random();
		int boys = 0;
		int girls = 0;

		while(girls == 0)
		{
			if(rm.nextBoolean())
			{
				girls++;
			}
			else
			{
				boys++;
			}
		}
		int[] genders = new int[]{girls,boys};
		return genders;
	}
	public static double runNFamily(int n)
	{
		int boys = 0;
		int girls = 0;
		for(int i = 0 ; i < n ; i++)
		{
			int[] genders = runOneFamily();
			girls += genders[0];
			boys += genders[1];
		}
		
		return (double)girls/(double)(boys+girls);
	}
}