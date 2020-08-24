import java.util.ArrayList;
//Time Complexity O(n log n) | sPAce Complexity O(1)
import java.util.Arrays;

//Given a number n , find the smallest number that has same set of diguts as n
//and is just greater than n

public class NextGreaterNumberOptimal 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {2,1,8,7,6,5};
		int i = arr.length-1;
		
		//check if there is a number which is greater than its preceeding num
		for( i = arr.length-1 ; i > 0 ; i--)
		{
			if(arr[i]>arr[i-1])
				break;
			if(i==0)
			{
				System.out.println("Not Possible this is the largest");
			}
		}
		//then assume tha num as smallest for the time being
		int smallest = i;
		//x = i-1 we have to find a smallest of all remaining nums in right halve
		//provided that smallest should be greater than x
		int x = arr[i-1];
		for(int j = i+1 ; j < arr.length ; j++)
		{
			if(arr[j] > x && arr[j]<arr[smallest])
			{
				smallest = j;
			}
		}
		//swap the smallest num with i-1 num
		swap(smallest,i-1,arr);
		//sort the remaining right halve number to get the minimum
		sort(arr,i,arr.length-1);
		System.out.println("Next Greater elemnt is");
		System.out.println(Arrays.toString(arr));
	   	
		
		
	}
	public static void swap(int i , int j,int[] arr)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void sort(int[] arr,int start,int end)
	{
		for(int i = start ; i <= end ; i++)
		{
			for(int j = i+1 ; j <=end ; j++)
			{
				if(arr[i]>arr[j])
				{
					swap(i,j,arr);
				}
			}
		}
	}
	

}
