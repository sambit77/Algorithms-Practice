import java.util.HashMap;
import java.util.LinkedHashMap;

//Time Complexity O(n) | Space Complexity O(n)
//but the relative order of character in input & output string will not be
//maintained if we use hashmap ,
//we can use LinkedHashMap to maintain the ordering
public class RemoveDuplicatesFromStringUsingHashMapOptimal 
{
	public static void main(String[] args) 
	{
		String st = "ravindraababu";
		
		String result = removeDuplicates(st);
		
		System.out.println(" removing duplicates "+result);
		
		
	}
	public static String removeDuplicates(String st)
	{
		StringBuffer sb = new StringBuffer("");
		
		LinkedHashMap<Character,Boolean> count = new LinkedHashMap<Character,Boolean>();
	    //HashMap<Character,Boolean> count = new HashMap<Character,Boolean>();
	    for(int i = 0 ; i < st.length() ; i++)
	    {
	    	count.put(st.charAt(i),true);
	    }
	    
	    for(Character c : count.keySet())
	    {
	    	sb.append(c);
	    }
	    return sb.toString();
	}

}
