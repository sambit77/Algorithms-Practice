//Time Complexity O(n^3) | Space Complexity O(1)
import java.util.Arrays;

//Find Largest Sub Array With equal number of 0 and 1
public class FindLargestSubArrayWithEqual0and1Naive 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,1,1,0};
		
		int[] maxIndex = new int[2];
		maxIndex[0] = -1;
		maxIndex[1] = -1;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				int count = getCountInSubArray(i,j,arr);
				if(count == 0)
				{
					
					if(j-i > maxIndex[1]-maxIndex[0])
					{
						maxIndex[0] = i;
						maxIndex[1] = j;
					}
				}
				
			}
		
		}
		
		System.out.println("The Sub Array is ");
		System.out.println(Arrays.toString(maxIndex));
		
	}
	public static int getCountInSubArray(int i , int j , int[] arr)
	{
		int ones = 0;
		int zeros = 0;
		
		for(int idx = i ; idx <= j ; idx++)
		{
			if(arr[idx]==0)
			{
				zeros++;
			}
			else
			{
				ones++;
			}
		}
		return zeros-ones;
	}

}
