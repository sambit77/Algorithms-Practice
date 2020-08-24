//Question 1.4 
//Time Complexity O(n) | Space Complexity O(min(n,c)) 
//n = length of input string , c= no of elements in set of chars in string
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String st = "addemam";
		boolean res = canPermutedToPallindrome(st);
		System.out.println(res);
		
	}
	public static boolean canPermutedToPallindrome(String st)
	{
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			if(map.containsKey(ch))
			{
				int val = map.get(ch);
				val++;
				map.put(ch,val);
			}
			else
			{
				map.put(ch,1);
			}

		}
		return checkMaxOneOdd(map);
	}
	public static boolean checkMaxOneOdd(HashMap<Character,Integer> map)
	{
		boolean foundOddOnce = false;
		for(char ch : map.keySet())
		{
			if(map.get(ch) % 2 == 1)
			{
				if(foundOddOnce)
				{
					return false;
				}
				foundOddOnce=true;
			}
		}
		return true;
	}
}