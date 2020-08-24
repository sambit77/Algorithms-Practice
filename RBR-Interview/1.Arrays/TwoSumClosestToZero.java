import java.util.Arrays;

public class TwoSumClosestToZero 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {-2,9,6,1,2,-5};
		
		Arrays.sort(arr);
		
		int left = 0;
		int right = arr.length - 2;
		int curr_sum = Integer.MAX_VALUE;
		int curr_diff = 0;
		
		while(left <= right)
		{
			curr_sum = arr[right]+arr[left];
			
			//System.out.println(curr_diff);
			if(curr_diff < Math.abs(curr_sum))
			{
				curr_diff = Math.abs(curr_sum);
			}
			if(curr_sum > 0)
			{
				
				right--;
			}
			if(curr_sum < 0)
			{
				left++;
			}
			if(curr_sum == 0)
			{
				break;
			}
			
		}
		System.out.println(curr_sum);
		
	}

}
