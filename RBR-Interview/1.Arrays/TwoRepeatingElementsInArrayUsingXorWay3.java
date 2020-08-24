import java.util.Arrays;

//Time Complexity O(n) | Space Complexity O(1)
//find 2 repeating elements in array
//given n+2 elements
//1 <= a[i] <= n 
//all elements from 1 to n occur once except two elements which occur twice
public class TwoRepeatingElementsInArrayUsingXorWay3 
{
	public static void main(String[] args) 
	{
	
		int[] arr = new int[] {1,2,1,3,4,4,5};
		
		Integer[] duplicates = getTwoRepeaters(arr);
		
		System.out.println("Duplicates are");
		System.out.println(Arrays.toString(duplicates));

	}
	public static Integer[] getTwoRepeaters(int[] arr)
	{
		int n = arr.length-2;
		int xor = arr[0];
		for(int i = 1  ; i < arr.length ; i++)
		{
			xor = xor ^ arr[i];
		}
		for(int i = 1; i <= n ; i++)
		{
			xor = xor ^ i;
		}
		int setbit = xor & ~(xor-1);
		int x = 0;
		int y = 0;
		for(int num : arr) 
		{
		    if((num & setbit) == 0)
		    {
		    	x = x ^ num;
		    }
		    else
		    {
		    	y = y ^ num;
		    }
			
		}
		for(int i = 1 ; i <= n ; i++)
		{
			if((i & setbit) == 0  )
			{
				x = x ^ i;
			}
			else
			{
				y = y ^ i;
			}
		}
		
		return new Integer[] {x,y};
		
	}

}
