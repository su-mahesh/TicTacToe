import java.util.*;

class TicTacToe
{
	final int boardSize = 10;
	char computerLetter = ' ';
	char palyerLetter = ' ';
	char board[] = new char[boardSize];
	
	TicTacToe(){		
		for(int i = 0; i < boardSize; i++)
			board[i] = ' ';
			System.out.println("**Game started**");	
	}
		
	public static void main(String... args){
	
		TicTacToe TicTacToeGame = new TicTacToe();			
	}
}
