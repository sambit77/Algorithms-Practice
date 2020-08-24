import java.util.Arrays;
import java.util.HashMap;

//Given two Strings are Anagrams or not
//n = max(a,b)
//a = length of String 1 | b = length of String 2
//Time Complexity O(n) | Space Complexity O(n)
public class AnagramsUsingHashMapOptimal 
{
	public static void main(String[] args) 
	{
		String s1 = "angle";
		String s2 = "nbgel";
		 boolean res = isAnagram(s1,s2);
		 
		 System.out.println("Are 2 string sanagrams ? "+ res);
	}
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0 ; i < s1.length() ; i++)
		{
			char ch = s1.charAt(i);
			if(map.containsKey(ch))
			{
				int val = map.get(ch);
				val++;
				map.put(ch, val);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		for(int i = 0 ; i < s2.length() ; i++)
		{
			char ch = s2.charAt(i);
			if(map.containsKey(ch))
			{
				int val = map.get(ch);
				if(val == 0)
				{
					return false;
				}
				val--;
				map.put(ch, val);
			}
			else
			{
				return false;
			}
			
		}
		return true;
		
	}

}
