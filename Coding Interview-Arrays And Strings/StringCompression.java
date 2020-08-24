//question 1.6
//Time Complexity O(n) | Space Complexity O(n) (at worst case)
//one programatically good approach will be computing the size of the StringBuilder
//before hand so that StringBuilder does not need to double its space again and again
//this is implemented in way 2
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String input = "aaaaaaaabbbbbdddddccffcffg";
		String compressed = getCompressed(input);
		System.out.println(compressed);
		
	}
	public static String getCompressed(String st)
	{
		int consecutive = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < st.length() ; i++)
		{
			consecutive++;
			if(i+1 >= st.length() || st.charAt(i) != st.charAt(i+1))
			{
				sb.append(st.charAt(i));
				sb.append(consecutive);
				consecutive=0;
			}
		}

		return sb.length()<st.length() ? sb.toString() :st;
	}
}