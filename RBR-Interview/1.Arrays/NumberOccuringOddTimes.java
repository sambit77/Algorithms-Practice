//find the number occuring odd number of times in an array
//all elemnts occur even times , only one element will be occuring odd times

//Time Compelxity O(n) | Space Complexity O(1)
public class NumberOccuringOddTimes 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,2,3,3,1,2,4,4,2};
		int result = 0;
		for(int num : arr)
		{
			result = result ^ num;
			
		}
		System.out.println(result);
		
		
	}

}
