import java.util.Arrays;
//Time Complexity O(n) | Space Complexity O(1)
//arrange the array so that a[i] becomes a[a[i]]
public class RearrangeArraySpaceOptmised
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {3,1,0,2,4};
		int size = arr.length;
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = arr[i]+(arr[arr[i]]%size)*size;
		}
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = arr[i]/size;
		}
		System.out.println(Arrays.toString(arr));
	}

}
