//Time Complexity O(n^2) | Space Complexity O(n)
public class RemoveDuplicatesFromStringNaive 
{
	public static void main(String[] args) 
	{
		String st = "ravindraababu";
		
		String result = removeDuplicates(st);
		
		System.out.println("After removing duplicates "+result);
		
		
	}
	public static String removeDuplicates(String st)
	{
		StringBuffer sb = new StringBuffer("");
		
		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			if(sb.indexOf(""+ch) == -1)
			{
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
