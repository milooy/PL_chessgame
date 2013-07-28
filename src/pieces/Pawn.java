package pieces;

public class Pawn {
	public static final String COLOR_EMPTY = "";
	public static final String SYMBOL_EMPTY = ".";
	public static final String WHITE = "white";
	public static final String BLACK = "black";
	String color;
	
	public Pawn(){
		color = COLOR_EMPTY;
	}
	
	public Pawn(String color){
		this.color = color;
	}

	public String print() {
		if (color == BLACK)
			return String.valueOf(Character.toUpperCase('p'));
		else if (color == WHITE)
			return "p";
		else
			return SYMBOL_EMPTY;
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
		Pawn other = (Pawn) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
}
