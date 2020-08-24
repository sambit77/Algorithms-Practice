//Given sorted array of size n,find an element that occurs more than n/2 times
//O(n) Time | O(1) Space
public class Majority_Element_Linear 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,2,2,2,2,3,4};
		int res = getMajorityElement(arr);
		System.out.println("Majority element in array is");
		System.out.println(res);
		
	}
	public static int getMajorityElement(int[] arr)
	{
		int result = -1;
		int min_freq = arr.length/2;
		
		for(int i = 0 ; i < arr.length/2 + 1 ; i++ )
		{
			if(arr[i] == arr[i+min_freq])
			{
				result = arr[i];
			}
			
		}
		
		return result;
	}

}
