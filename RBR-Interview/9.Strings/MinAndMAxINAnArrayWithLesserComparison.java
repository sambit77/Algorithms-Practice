//Find the maximum and minimum of an array using minimum number of compariosn opertaion
//to find min of an array standalone ,minimum no of comparison is n-1
//to find max of an array standalone ,minimum no of comparison is n-1
//if we find min & max in an array in general way total comparioson is
//to find min (n-1) & to find max (n-1) .. total - 2n-2

//we need to reduce thi compariosn whem finding min and max for an array simultaneously
public class MinAndMAxINAnArrayWithLesserComparison
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {21,20,88,9,8,6,9,8};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		if(arr.length %2  != 0)
		{
			max = arr[0];
			min = arr[0];
			
			for(int i = 1; i < arr.length-1 ; i++)
			{
				if(arr[i]>arr[i+1])
				{
					if(arr[i]>max)
					{
						max=arr[i];
					}
					if(arr[i+1] < min)
					{
						min = arr[i+1];
					}
					
				}
				else
				{
					if(arr[i+1]>max)
					{
						max = arr[i+1];
					}
					if(arr[i]<min)
					{
						min = arr[i];
					}
				}
			}
		}
		else
		{
			if(arr[0]>arr[1])
			{
				max = arr[0];
				min = arr[1];
			}
			else
			{
				max = arr[1];
				min = arr[0];
			}
			
			for(int i = 2 ; i < arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					if(arr[i]>max)
					{
						max=arr[i];
					}
					if(arr[i+1] < min)
					{
						min = arr[i+1];
					}
					
				}
				else
				{
					if(arr[i+1]>max)
					{
						max = arr[i+1];
					}
					if(arr[i]<min)
					{
						min = arr[i];
					}
				}
				
			}
		}
		
		System.out.println("Minimum in array "+min);
		System.out.println("Maximum in array "+max);
		
	}

}
