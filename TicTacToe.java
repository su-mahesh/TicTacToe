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
	
	public void inputSymbol()
	{
	System.out.println("Enter your symbol X or O :");
	
	char input = sc.next().charAt(0);
		if(input == 'X' || input == 'O' || input == 'x' || input == 'o')
	{
	switch(input)
	{
	case 'x':
	case 'X': 
		palyerLetter = 'X';
		computerLetter = 'O';
	case 'o':
	case 'O':
		palyerLetter = 'X';
		computerLetter = 'X';
	}
	}
	else
		System.out.println("wrong input");	
	}	
	
	public static void main(String... args){
	
		TicTacToe TicTacToeGame = new TicTacToe();			
		TicTacToeGame.inputSymbol();

	}
}
