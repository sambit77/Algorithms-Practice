import java.util.Arrays;

//Given two Strings are Anagrams or not
//n = max(a,b)
//a = length of String 1 | b = length of String 2
//Time Complexity O(n log n) | Space Complexity O(n)
public class AnagramsNaive 
{
	public static void main(String[] args) 
	{
		String s1 = "angle";
		String s2 = "nagel";
		 boolean res = isAnagram(s1,s2);
		 
		 System.out.println("Are 2 string sanagrams ? "+ res);
	}
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		char[] crr1 = s1.toCharArray();
		char[] crr2 = s2.toCharArray();
		
		Arrays.parallelSort(crr1);
		Arrays.parallelSort(crr2);
		
		return Arrays.equals(crr1,crr2);
	}

}
