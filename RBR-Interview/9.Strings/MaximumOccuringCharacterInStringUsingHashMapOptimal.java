import java.util.HashMap;

//find the maximum occuring character in a string
//Time Complexity O(n) | Space Complexity O(1)
public class MaximumOccuringCharacterInStringUsingHashMapOptimal 
{
	public static void main(String[] args) 
	{
		String st = "ravindraa";
		char ch = getMaxOccuring(st);
		System.out.println("Maximum occurd Character is "+ch);
		
		
	}
	public static char getMaxOccuring(String st)
	{
		HashMap<Character,Integer > count = new HashMap<Character, Integer>();
		
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
				count.put(ch,1);
			}
		}
		
		int maxCount =  0;
		Character maxOccuring = null;
		
		for(Character c : count.keySet())
		{
			if(count.get(c)>maxCount)
			{
				maxCount = count.get(c);
				maxOccuring = c;
				
			}
		}
		return maxOccuring;
	}
	

}
