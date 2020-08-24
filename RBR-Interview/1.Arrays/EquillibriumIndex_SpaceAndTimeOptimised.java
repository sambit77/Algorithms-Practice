//Time Complexity O(n)  Space Complexity O(1)
public class EquillibriumIndex_SpaceAndTimeOptimised 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,5,15,3,4,21,2};
		
		int leftSum = 0;
		int totalSum = 0;
		int rightSum = 0;
		
		
		for(int i = 0; i < arr.length ; i++)
		{
			totalSum = totalSum + arr[i];
		}
		for(int i = 0 ; i < arr.length ; i++)
		{
			leftSum = leftSum + arr[i];
			rightSum = totalSum - leftSum ;
			
			if(leftSum == rightSum)
			{
				System.out.println("Equillibrium inde x is "+i);
			}
			
		}
		
		
		
	}


}
