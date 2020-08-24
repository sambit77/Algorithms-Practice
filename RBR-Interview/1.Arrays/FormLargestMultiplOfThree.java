import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

//find the largest possible multiple of 3 from array of digits
public class FormLargestMultiplOfThree 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {8,3,2,8,8,8,6,5,1,1};
		Arrays.sort(arr);
		
		Queue<Integer> q0 = new LinkedList<Integer>();
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		
		int arrsum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arrsum = arrsum + arr[i];
			if(arr[i] % 3 == 0)
			{
				q0.add(arr[i]);
			}
			else if(arr[i] % 3 == 1)
			{
				q1.add(arr[i]);
			}
			else
			{
				q2.add(arr[i]);
			}
		}
		
		
	
		if(arrsum%3 == 1)
		{
			if(!q1.isEmpty())
			{
				q1.poll();
			}
			else
			{
				if(!q2.isEmpty())
				{
					q2.poll();
				}
				
				else
				{
					System.out.println("multiple of 3 is not possible");
				    return;
				}
					
				if(!q2.isEmpty())
				{
					q2.poll();	
				}
				else
				{
					System.out.println("multiple of 3 is not possible");
					return;
				}
					
			}
		}
		else if(arrsum % 3 == 2)
		{
			if(!q2.isEmpty())
			{
				q2.poll();
			}
			else
			{
				if(!q1.isEmpty())
				{
					q1.poll();
				}
					
				else
				{
					System.out.println("multiple of 3 is not possible");
					return;
				}
					
				if(!q1.isEmpty())
				{
					q1.poll();
				}
				
				else
				{
					System.out.println("multiple of 3 is not possible");
					return;
				}
					
					
			}
		}
		
		ArrayList<Integer> finalnum = new ArrayList<Integer>();
		while(!q0.isEmpty())
		{
			finalnum.add(q0.poll());
		}
		while(!q1.isEmpty())
		{
			finalnum.add(q1.poll());
		}
		while(!q2.isEmpty())
		{
			finalnum.add(q2.poll());
		}
		
		//sort the ArrayList in reverse order
		
		Collections.sort(finalnum, new Comparator<Integer>() 
		{

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1 > o2)
				{
					return -1;
				}
				return 0;
			}

		
			
		});
		
		System.out.println(finalnum.toString());
		
		//form final num
		int result = 0;
		
		Collections.sort(finalnum);
		//System.out.println(finalnum.toString());
		int factor = 1;
		for(int i = 0 ; i < finalnum.size() ; i++)
		{
			int sum = factor * finalnum.get(i);
			//System.out.println(sum);
			result = result + sum;
			factor = factor * 10;
			
		}
		System.out.println(result);
		
		
		
		
		
		
	}
	

}
