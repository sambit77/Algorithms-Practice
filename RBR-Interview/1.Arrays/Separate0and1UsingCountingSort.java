//Time Complexity O(n) | Space Compelxity O(1)
import java.util.Arrays;

//given array of 0's and 1's cluster together 0 and 1
public class Separate0and1UsingCountingSort 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {0,1,0,0,1,1,0,1,1,0,1,0,0};
		
		separate(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	public static void separate(int[] arr)
	{
		int[] count = new int[2];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i]==0)
			{
				count[0]++;
			}
			else
			{
				count[1]++;
			}
		}
		for(int i = 0 ; i  < count[0] ; i++)
		{
			arr[i] = 0;
		}
		for(int j = 0; j < count[1] ; j++)
		{
			arr[j+count[0]] = 1;
		}
	
		
		
	}

}
