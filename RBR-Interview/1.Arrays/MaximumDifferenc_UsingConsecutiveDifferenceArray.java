//Time Complexity O(n) | Space Complexity O(n)
//Space Complexity can be reduced to O(1) , if instead of storing all the difference
//as we require only last two value in diff array at any time,so we will use
//2 variables to store last two valuse 
import java.util.Arrays;

public class MaximumDifferenc_UsingConsecutiveDifferenceArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] arr = new int[] {4,3,10,2,9,1,6};
		
		int max_diff = getMaxDiff(arr);
		System.out.println(max_diff);

	}
	public static int getMaxDiff(int[] arr)
	{
		int[] diff = new int[arr.length];
		for(int i = 0 ; i < diff.length-1 ; i++)
		{
			diff[i] = arr[i+1]-arr[i-0];
		}
		System.out.println(Arrays.toString(diff));
		return maxSubArraySum(diff);
	}
	public static int maxSubArraySum(int[] arr)
	{
		int max = 0;
		int maxTillHere = 0;
		for(int i = 1 ; i < arr.length ; i++)
		{
			maxTillHere = maxTillHere + arr[i];
			if(max < maxTillHere)
			{
				max = maxTillHere;
			}
			if(maxTillHere < 0)
			{
				maxTillHere = 0;
			}
			
			
			
		}
		return max;
	}

}
