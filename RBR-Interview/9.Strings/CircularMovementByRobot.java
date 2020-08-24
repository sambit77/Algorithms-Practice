//check if given sequence of moves for a robot is circular or not
//sequence contaings G and L,R only
//G = go Striaght 1 unit
//L = turn left
//R = turn Right
//ime Complexity O(n) | Space Complexity O(1)
public class CircularMovementByRobot 
{
	public static void main(String[] args) 
	{
		String moves = "GLGLGLGL";
		boolean val = isACircularMove(moves);
		System.out.println("Given sequence is Circular move ? ");
		System.out.println(val);
			
		
	}
	public static boolean isACircularMove(String moves)
	{
		final int N = 0;
		final int E = 1;
		final int S = 2;
		final int W = 3;
		
		int x = 0 ;
		int y = 0;
		int dir = N;
		
		for(int i = 0 ; i < moves.length() ; i++)
		{
			char move = moves.charAt(i);
			if(move == 'R')
			{
				dir = (dir+1)%4;
			}
			else if(move == 'L')
			{
				dir = (4+dir-1)%4;
			}
			else
			{
				if(dir == N)
				{
					y++;
				}
				else if(dir == E)
				{
					x++;
				}
				else if(dir == S)
				{
					y--;
				}
				else
				{
					x--;
				}	
			}
		}
		return (x==0) & (y==0);
	}

}
