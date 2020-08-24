import java.util.Arrays;

//Find the smallest window in a String containing all characters of another String
//Time Complexity O(n^4) to be specific O(n^2 * m^2) | Space Complexity O(m)
//n = Stirng 1 length
//m = String 2 length
public class SmallestWindowInStringContainingAllCharOfAnotherString 
{
	public static void main(String[] args) 
	{
		String s1 = "a string containing";
		String s2 = "aig";
		
		int[] window = getSmallestWindow(s1,s2);
		System.out.println("Smallest Window in S1 containg all chars of s2");
		System.out.println(Arrays.toString(window));
		
		
	}
	public static int[] getSmallestWindow(String s1,String s2)
	{
		int minSize = Integer.MAX_VALUE;
		int[] arr = new int[2];
		
		for(int i = 0 ; i < s1.length() ; i++)
		{
			for(int j = i+1 ; j < s1.length() ; j++)
			{
				if(containedInString1(s2,s1,i,j))
				{
					if(j-i < minSize)
					{
						minSize = j-i;
						arr[0] = i;
						arr[1] = j;
					}
				}
			}
		}
		return arr;
	}
	public static boolean containedInString1(String s2,String s1,int start,int end)
	{
		boolean[] res = new boolean[s2.length()];
		for(int i = 0 ; i < s2.length() ; i++)
		{
			char c = s2.charAt(i);
			for(int j = start ; j <= end ; j++)
			{
				if(s1.charAt(j)==c)
				{
					res[i] = true;
				}
			}
		}
		
		boolean result = true;
		for(boolean val : res)
		{
			result = result & val;
		}
		return result;
	}

}
