//find the maximum difference between two elements in array such that 
//larger element appears after smaller element
//Time Complexity O(n^2) | Space Complexity O(1)

public class MaximumDifference_Naive 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {4,3,10,2,9,1,6};
		
		int max_diff = getMaxDiff(arr);
		System.out.println(max_diff);
		
	}
	public static int getMaxDiff(int[] arr)
	{
		int max_diff = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				int currentdiff = arr[j]-arr[i];
				max_diff = Math.max(currentdiff, max_diff);
			}
		}
		return max_diff;
	}

}
