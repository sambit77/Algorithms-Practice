//Time Complexity O(n) | Space Complexity O(1)
public class ReverseWordsInASenetenceUsingPRedefinedMethods 
{
	public static void main(String[] args) 
	{
		String st = "This is a class";
		String wordreversed =  reverseWords(st);
		
		System.out.println(wordreversed);
		
	}
	public static String reverseWords(String st)
	{
		String[] words = st.split(" ");
		for(int i = 0 ; i < words.length ; i++)
		{
			words[i] = reverse(words[i]);
		}
		StringBuffer res = new StringBuffer();
		for(int i = 0 ; i < words.length ; i++)
		{
			res.append(" "+words[i]);
		}
		
		return res.reverse().toString().trim();
	}
	public static String reverse(String st)
	{
		return new StringBuffer(st).reverse().toString();
	}

}
