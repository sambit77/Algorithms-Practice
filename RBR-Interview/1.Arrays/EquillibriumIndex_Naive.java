//O(n^2) Time | O(1) Space
//find the equillibrium index in array
//if i is equillibrium index then
// a0 + a1 + a2 + ... + ai == ai+1 + ai+2 .... an
public class EquillibriumIndex_Naive 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,5,15,3,4,21,2};
		
		int left = 0;
		int right = 0;
		int eqindex = -1;
		for(int i = 0; i < arr.length ; i++)
		{
			right = 0;
			left = left + arr[i];
			for(int j = i+1 ; j < arr.length ; j++)
			{
				right = right+arr[j];
				
			}
			if(left == right)
			{
				eqindex = i;
			}
		}
		System.out.println(eqindex);
		
	}
	

}
