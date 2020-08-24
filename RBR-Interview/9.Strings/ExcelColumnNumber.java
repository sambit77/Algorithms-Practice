//Find Excel Column name for given excel column number
//Time Complexity O(n) | Space Complexity O(1)
public class ExcelColumnNumber 
{
	public static void main(String[] args) 
	{
	
		int colNo = 29;
		String colName = getColName(colNo);
		System.out.println(colName);
	}
	public static String getColName(int colNo)
	{
		StringBuffer sb = new StringBuffer();
		while(colNo > 0)
		{
			int rem = colNo % 26;
			if(rem == 0)
			{
				sb.append('Z');
				colNo = ( colNo / 26 ) + 1;
			}
			else
			{
				sb.append((char)(rem-1+'a'));
				colNo = colNo/26;
			}
		}
		
		return sb.reverse().toString();
	}

}
