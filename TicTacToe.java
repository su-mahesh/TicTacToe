import java.util.*;

class TicTacToe
{
	final int boardSize = 10;
	char computerLetter = ' ';
	char playerLetter = ' ';
	char toss = ' ';
	char board[] = new char[boardSize];
	Scanner sc = new Scanner(System.in);
		
	TicTacToe(){
		for(int i = 0; i < boardSize; i++)
			board[i] = ' ';
			System.out.println("**Game started**");	
	}
	
	public void inputSymbol(){
	System.out.println("Enter your symbol X or O :");
	
	char input = sc.next().charAt(0);
		if(input == 'X' || input == 'O' || input == 'x' || input == 'o')
	{
	switch(input)
	{
	case 'x':
	case 'X': 
		playerLetter = 'X';
		computerLetter = 'O';
	case 'o':
	case 'O':
		playerLetter = 'X';
		computerLetter = 'X';
	}
	}
	else
		System.out.println("wrong input");	
	}	
	
	public void showBoard(){
	int charIndex = 0;
	for(int i = 1; i <= 3; i++){
	
		for(int j = 1; j <= 3; j++){
			System.out.print(" "+board[charIndex]+" ");
			charIndex++;
			if(j !=  3)
			System.out.print("|");
		}
		System.out.println("");
		
		for(int j = 1; j <= 11 && i != 3; j++)
			System.out.print("-");
			System.out.println("");				
	}
	System.out.println("");
	}
	
	public void drawMove(){
		System.out.println("draw move, enter index: ");
		int index = sc.nextInt();	
		if(index > 0 && index < boardSize)
		{
			if(board[index] == ' '){
				board[index] = playerLetter;
				System.out.println("move drawn");
				}
			else
				System.out.println("index is not empty");
		}	
		else
		System.out.println("wrong index");
	}
	public void computerMove()	{
		System.out.println("computer move");
	}
	public void toss(){
	
	System.out.println("Toss: Heads 'H' or Tails 'T' :");
	toss = sc.next().charAt(0);
	String tossResult = (int) (Math.random() * 10) % 2	== 0 ? "Heads" : "Tails";
	System.out.println("Tossed: "+tossResult);
	
	if( toss != tossResult.charAt(0))
		computerMove();		
	}
	public static void main(String... args){
	
		TicTacToe TicTacToeGame = new TicTacToe();		
		TicTacToeGame.inputSymbol();		
		TicTacToeGame.showBoard();
		TicTacToeGame.toss();
		TicTacToeGame.drawMove();

	}
}
