//First non repeating character in a string
//Time Complexity O(n^2) | Space Complexity O(1)
public class FirstNonRepeatingCharInStringNaive 
{
	public static void main(String[] args) 
	{
		String st = "ravindra";
		
		char first = getFirstNonRepeatingChar(st);
		System.out.println("First Non RepeatingChar in String is");
		System.out.println(first);
		
	}
	public static char getFirstNonRepeatingChar(String st)
	{
		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			boolean inLeft = isInLeft(ch,i-1,st);
			boolean inRight = isInRight(ch,i+1,st);
			if(! (inLeft || inRight ))
			{
				return st.charAt(i);
			}
		}
		return (Character) null;
	}
	public static boolean isInLeft(char ch , int idx , String st)
	{
		if(idx == -1)
		{
			return false;
		}
		
		while(idx >= 0)
		{
			if(ch == st.charAt(idx))
			{
				return true;
			}
			idx--;
		}
		return false;
		
	}
	public static boolean isInRight(char ch,int idx,String st)
	{
		if(idx == st.length())
		{
			return false;
		}
		while(idx<st.length())
		{
			if(ch == st.charAt(idx))
			{
				return true;
			}
			idx++;
		}
		return false;
	}
	

}
