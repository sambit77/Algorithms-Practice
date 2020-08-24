//Time Complexity O(n) Space Complexity O(1)
//Given an unsorted array n , of positive integers only find sub array which sums to 
//given value X
public class FindSubArrayWithGivenSumOnlyPositiveIntArray 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {9,8,5,4,3,4};
		int x = 9;
		
		int left = 0 ;
		int right = 0;
		
		int currSum = 0;
		while(left < arr.length && right < arr.length)
		{
			if(currSum == x)
			{
				System.out.println(left+1 +" "+right);
				break;
			}
			if(currSum < x)
			{
				right++;
				currSum = currSum + arr[right];
			}
			if(currSum > x)
			{
				left++;
				currSum = currSum - arr[left];
			}
			
			
		}
		
	}

}
