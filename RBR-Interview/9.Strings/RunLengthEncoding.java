//Run LengthEncoding Definition check wiki
// SSMMM -> Run length encodes -> S2M3

//Time Complexity O(n) | Space Complexity O(m)
//n = no of characters in original String
//m = count of set of characters in String
public class RunLengthEncoding 
{
	public static void main(String[] args) 
	{
		String input = "SSMMMAAARRRRTZ";
		String output = runLengthEncode(input);
		System.out.println("Run Length encode String is");
		System.out.println(output);
		
	}
	public static String runLengthEncode(String input)
	{
		input = input.concat("  ");
		StringBuffer sb = new StringBuffer();
		int count = 1;
		for(int i = 0 ; i < input.length()-1 ; i++)
		{
			if(input.charAt(i)==input.charAt(i+1))
			{
				count++;
			}
			else
			{
				sb.append(input.charAt(i));
				sb.append(count);
				count=1;
			}
		}
		return sb.toString();
	}
	

}
