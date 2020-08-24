import java.util.Arrays;

//find the maximum occuring character in a string
//Time Complexity O(n log n) | Space Complexity O(n) (for sorting)
//can be optimised to O(1) space if we use in place sorting algorithm
public class MaximumOccuringCharacterInStringBySortingWay2 
{
	public static void main(String[] args) 
	{
		String st = "ravindraa";
		char ch = getMaxOccuring(st);
		System.out.println("Maximum occuring Character is "+ch);
		
		
	}
	public static char getMaxOccuring(String st)
	{
	   char[] crr = st.toCharArray();
	   Arrays.parallelSort(crr);
	   
	   int maxCount = 0;
	   int maxIdx = -1;
	   int count = 0;
	   for(int i = 0 ; i < crr.length-1 ; i++)
	   {
		   if(crr[i] == crr[i+1])
		   {
			   count++;
		   }
		   else
		   {
			   count = 0;
		   }
		   if(count>maxCount)
		   {
			   maxCount = count;
			   maxIdx = i;
		   }
	   }
	   return crr[maxIdx];
	}
	

}
