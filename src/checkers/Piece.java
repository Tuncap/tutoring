package assingments;

public class Piece {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Piece(String type) {
		this.type = type;
	}
		
	@Override
	public String toString() {
		return this.type;
	}
}
