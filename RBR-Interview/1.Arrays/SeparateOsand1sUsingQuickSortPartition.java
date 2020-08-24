//Time Complexity O(n) | Space Complexity O(1)
import java.util.Arrays;

//Same conecpt can be extended  to segregation of odd & even numbers
public class SeparateOsand1sUsingQuickSortPartition 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {0,1,0,0,1,1,0,1,1,0,1,0,0};
		
		separate(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	public static void separate(int[] arr)
	{
		int left = 0;
		int right = arr.length-1;
		
		
		while(left <= right)
		{
			if(arr[left] == 1 && arr[right] == 0)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			if(arr[left] == 0)
			{
				left++;
			}
			if(arr[right]==1)
			{
				right--;
			}
		}
	}
	

}
