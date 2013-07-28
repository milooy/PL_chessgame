package pieces;

public class Piece {
	public static final String COLOR_EMPTY = "";
	public static final String SYMBOL_EMPTY = ".";
	public static final String WHITE = "white";
	public static final String BLACK = "black";
	
	String color;
	String type;

	private Piece(String color, String type){
		this.color = color;
		this.type = type;
	}

	public static Piece create(String color, String type){
		return new Piece(color, type);
	}	
	
	public String print() {
		/*
		if (color == BLACK)
			return String.valueOf(Character.toUpperCase('p'));
		else if (color == WHITE)
			return "p";
		else
			return SYMBOL_EMPTY;*/
		
		if (color == BLACK){
			if (type == "pawn")
				return String.valueOf(Character.toUpperCase('p'));
			else if(type == "knight")
				return String.valueOf(Character.toUpperCase('n'));
			else if(type == "rook")
				return String.valueOf(Character.toUpperCase('r'));
			else if(type == "bishop")
				return String.valueOf(Character.toUpperCase('b'));
			else if(type == "queen")
				return String.valueOf(Character.toUpperCase('q'));
			else if(type == "king")
				return String.valueOf(Character.toUpperCase('k'));		
			System.out.println("error!");
			return ("x");
		}
		else if(color == WHITE){
			if (type == "pawn")
				return "p";
			else if(type == "knight")
				return "n";
			else if(type == "rook")
				return "r";
			else if(type == "bishop")
				return "b";
			else if(type == "queen")
				return "q";
			else if(type == "king")
				return "k";	
			System.out.println("error!");
			return ("x");
		}
		else if (color == COLOR_EMPTY){
			return SYMBOL_EMPTY;
		}
		else {
			System.out.println("error!");
			return ("x");
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
}
