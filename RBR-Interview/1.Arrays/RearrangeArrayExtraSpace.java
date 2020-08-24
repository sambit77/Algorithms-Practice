import java.util.Arrays;
//Time Complexity O(n) | Space Complexity O(n)
//arrange the array so that a[i] becomes a[a[i]]
public class RearrangeArrayExtraSpace 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {3,1,0,2,4};
		
		int[] temp = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			temp[i] = arr[arr[i]];
		}
		
		System.out.println(Arrays.toString(temp));
	}
	

}
