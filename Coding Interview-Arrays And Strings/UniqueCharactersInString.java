//is the String contains unique characters only
//Time Complexity O(n) | Space Complexity O(1) (storing all the char set asymptotically O(1))
// n -> length of input string
//more accurately its min (n,c) || n -> string length || c-> no of chars in char set considered
//here char set considered in extended ASCII (128 chars)
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String st = "sambiit";
		System.out.println("The String contains unique chars true or false");
		System.out.println(isUniqueChar(st));

	}
	public static boolean isUniqueChar(String st)
	{
		boolean[] val = new boolean[128];

		for(int i = 0 ;i < st.length() ; i++)
		{
			int asc = st.charAt(i);
			if(val[asc])
			{
				return false;
			}
			val[asc]=true;
		}
		return true;
	}
}