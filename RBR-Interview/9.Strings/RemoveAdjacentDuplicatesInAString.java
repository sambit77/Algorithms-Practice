//Time Complexity O(n) avg case | Space Complexity O(n) (as we use StringBuffer)
//Space Complexity will be O(1) if we will directly take input as StringBuffer instead of String

public class RemoveAdjacentDuplicatesInAString 
{
	public static void main(String[] args) 
	{
		String st = "ravinniva";
		String result = removeDuplicates(st);
		System.out.println("After removing adjacent duplcates in string");
		System.out.println(result);
		
	}
	public static String removeDuplicates(String st)
	{
		StringBuffer sb = new StringBuffer(st);
		
	    boolean deleteHappened = true;
	    
	    while(deleteHappened)
	    {
	    	deleteHappened = false;
	    	for(int i = 0 ; i < sb.length()-1 ; i++)
	    	{
	    		if(sb.charAt(i)==sb.charAt(i+1))
	    		{
	    			sb.delete(i,i+2);
	    			deleteHappened = true;
	    		}
	    	}
	    }
		
		
		
		return sb.toString();
	}

}
