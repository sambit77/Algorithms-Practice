//Time Complexity O(n^2) | Space Complexity O(n)
import java.util.Arrays;

//Count the number of smallest elements on the right of the element in array
public class NoOfSmallestElementsToRight 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,3,4,5,7,1,3,2};
		
		int[] smallersToRight = getSmallersToRight(arr);
		
		System.out.println(Arrays.toString(smallersToRight));
		
	}
	public static int[] getSmallersToRight(int[] arr)
	{
		
		int[] res = new int[arr.length];
		res[arr.length-1] = 0;
		
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			res[i] = getSmallersToRightOfThisIdx(i,arr);
		}
		return res;
	}
	public static int getSmallersToRightOfThisIdx(int idx ,int[] arr)
	{
		int count = 0;
		for(int i = idx+1 ; i < arr.length ; i++)
		{
			if(arr[i] < arr[idx])
			{
				count++;
			}
		}
		return count;
	}

}
