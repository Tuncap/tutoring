package assingments;

import java.util.Scanner;

public class BoardApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		
		Board board = new Board(new Piece[4][4]);
		board.addPiece(2, 2, new Piece("B"));
		board.addPiece(0, 1, new Piece("R"));

		while(userInput != 2) {
			System.out.println(board);
			System.out.println("Board Options\n 1. Move piece \n 2. Exit program");
			System.out.print("Enter a option: ");
			userInput = scanner.nextInt();
			
			if(userInput != 1 && userInput != 2) {
				System.out.println("\n Invalid option");
			}
			
			if(userInput == 1) {
				System.out.print("Enter row of starting piece: ");
				int fromRow = scanner.nextInt();
				System.out.print("Enter column of starting piece: ");
				int fromCol = scanner.nextInt();
				System.out.print("Enter row of destination: ");
				int toRow = scanner.nextInt();
				System.out.print("Enter column of destination: ");
				int toCol = scanner.nextInt();
				board.move(fromRow, fromCol, toRow, toCol);
				System.out.println();
			}
		}
		
		System.out.println("Program ended");
		scanner.close();
	}
}
