package pieces;

public class Pawn {
	private static final String COLOR_EMPTY = "";
	private static final String SYMBOL_EMPTY = ".";
	String color;
	
	public Pawn(){
		color = COLOR_EMPTY;
	}
	
	public Pawn(String color){
		this.color = color;
	}

	public String print() {
		if (color == "black")
			return String.valueOf(Character.toUpperCase('p'));
		else if (color == "white")
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
