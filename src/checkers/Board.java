package assingments;

public class Board {
	private Piece[][] bdArray;

	public Piece[][] getBdArray() {
		return bdArray;
	}

	public void setBdArray(Piece[][] bdArray) {
		this.bdArray = bdArray;
	}

	public Board(Piece[][] bdArray) {
		this.bdArray = bdArray;
	}

	public void addPiece(int row, int column, Piece piece) {
		if (row >= bdArray.length || column >= bdArray[0].length) {
			System.out.println("Unable to place piece.  Coordinates are outside of board.");
		} else {
			bdArray[row][column] = piece;
		}
	}

	public void move(int fromRow, int fromCol, int toRow, int toCol) {
		final int MAX_ROW = bdArray.length;
		final int MAX_COL = bdArray[0].length;

		if (fromRow > MAX_ROW || fromRow < 0 || fromCol > MAX_COL || fromRow < 0 || bdArray[fromRow][fromCol] == null) {
			System.out.println("Piece does not exist on board");
		}

		if (isLegal(fromRow, fromCol, toRow, toCol)) {
			bdArray[toRow][toCol] = bdArray[fromRow][fromCol];
			bdArray[fromRow][fromCol] = null;
		} else {
			System.out.println("MOVE NOT LEGAL\n");
		}
	}

	private boolean isLegal(int fromRow, int fromCol, int toRow, int toCol) {
		if (fromRow == toRow || fromCol == toCol) {
			return false;
		}

		final int MAX_ROW = bdArray.length;
		final int MAX_COL = bdArray[0].length;

		if ((toRow < 0 || toRow > MAX_ROW) || toCol < 0 || toCol > MAX_COL) {
			return false;
		}

		if ((fromRow - 1 == toRow) || (fromRow + 1 == toRow) && ((toCol == fromCol - 1) || (toCol == fromCol + 1))) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String rows = "";
		for (int row = 0; row < bdArray.length; row++) {
			String currentRow = "";

			for (int column = 0; column < bdArray[row].length; column++) {
				Piece currentPiece = bdArray[row][column];
				if (currentPiece == null) {
					currentRow = currentRow + " _";
				} else {
					currentRow = currentRow + " " + currentPiece.toString();
				}
			}

			rows = rows + currentRow + "\n";
		}
		return "BOARD\n" +  rows + "\n";
	}

}
