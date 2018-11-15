import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		TicTacToe game=new TicTacToe();
		//game.initializeBoard();
		
		System.out.println("Tic Tac Toe Game");
		do {
			System.out.println("Current board layout");
			game.printBoard();
			int row;
			int col;
			do {
				System.out.println("Player "+game.currentPlayer+", enter empty row and column to place your mark");
				row=scan.nextInt();
				col=scan.nextInt();
			}while(!game.placeMark(row, col));
			game.changePlayer();
		}while(!game.checkForWin() && !game.boardFull());
		if(game.boardFull() && !game.checkForWin()) {
			System.out.println("We have a draw");
		}else {
			System.out.println("Current board layout:");
			game.printBoard();
			game.changePlayer();
			System.out.println("Player "+game.currentPlayer+" wins!");
		}
		scan.close();
	}
}
