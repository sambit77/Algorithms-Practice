//is the String contains unique characters only
//Time Complexity O(n) | Space Complexity O(1) 
//reducng the storage by factor of eight using bit vector
//assuming the input string contains only lowercase letters
// n -> length of input string
//more accurately its min (n,c) || n -> string length || c-> no of chars in char set considered
//here char set considered in extended ASCII (128 chars)
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String st = "sambit";
		System.out.println("The String contains unique chars true or false");
		System.out.println(isUniqueChar(st));

	}
	public static boolean isUniqueChar(String st)
	{
		int check = 0;

		for(int i = 0 ;i < st.length() ; i++)
		{
			int asc = st.charAt(i)-'a';
			if( (check & (1<<asc)) >0)
			{
				return false;
			}
		    check |= (1<<asc);
		}
		return true;
	}
}