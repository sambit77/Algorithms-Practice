//Time Complexity O(n) | Space Complexity O(1)
public class ReverseWordsInASenetenceInGeneralMethod 
{
	public static void main(String[] args) 
	{
		String st = "This is a class";
		String wordreversed =  reverseWords(st);
		
		System.out.println(wordreversed);
		
	}
	public static String reverseWords(String st)
	{
		StringBuffer sb = new StringBuffer();
		
		String[] words = st.split(" ");
		for(int i = words.length-1 ; i >= 0 ; i--)
		{
			sb.append(words[i]+" ");
		}
		return sb.toString().trim();
	}

}
