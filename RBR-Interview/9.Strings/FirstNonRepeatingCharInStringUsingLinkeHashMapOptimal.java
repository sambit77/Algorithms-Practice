import java.util.LinkedHashMap;

//First non repeating character in a string
//Time Complexity O(n) | Space Complexity O(n)
public class FirstNonRepeatingCharInStringUsingLinkeHashMapOptimal 
{
	public static void main(String[] args) 
	{
		String st = "ravindra";
		
		char first = getFirstNonRepeatingChar(st);
		System.out.println("First Non Repeating Char in String is");
		System.out.println(first);
		
	}
	public static char getFirstNonRepeatingChar(String st)
	{
		LinkedHashMap<Character,Integer> count = new LinkedHashMap<Character, Integer>();
		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			if(count.containsKey(ch))
			{
				int val = count.get(ch);
				val++;
				count.put(ch, val);
			}
			else
			{
				count.put(ch, 1);
			}
		}
		
		for(Character ch : count.keySet())
		{
			if(count.get(ch) == 1)
			{
				return ch;
			}
		}
		return (Character) null;
	}
	
}
