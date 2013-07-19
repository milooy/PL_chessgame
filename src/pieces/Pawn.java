package pieces;
/**
 * @author kimminhyeok
 * 폰 만드는 클래스.
 */
public class Pawn {
	
	String color;
	
	public Pawn(){
		color = "white";
	}
	
	public Pawn(String color){
		this.color = color;
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

	public char print() {
		if (color == "black")
			return 'P';
		else
			return 'p';
	}

}