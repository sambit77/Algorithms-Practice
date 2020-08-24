//find the duplicates in an array of size n 
//where the inputs are i range 1 <= input < n
//Time Complexity O(n) | Space Complexity O(1)
public class DuplicatesInArrayQuestion1 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {5,2,3,4,5,1};
		
		int duplicate = getDuplicate(arr);
		
		System.out.println("Duplicate in array is "+duplicate);
		
	}
	public static int getDuplicate(int[] arr)
	{
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[Math.abs(arr[i])]>0)
			{
				arr[Math.abs(arr[i])] = -1*arr[Math.abs(arr[i])];
			}
			else
			{
				return -1*arr[i];
			}
		}
		
		return -1; 
	}
	

}
