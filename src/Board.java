import java.util.ArrayList;

public class Board {
	private int NumOfPawn = 0;
	private ArrayList<Pawn> PawnList= new ArrayList<Pawn>();
	
	public void addPawn(Pawn addPawn){
		PawnList.add(addPawn);
		NumOfPawn++;
	}
	
	public int getNumOfPawn(){
		return NumOfPawn;
	}
	
	public boolean hasPawn(Pawn testPawn){
		return PawnList.contains(testPawn);
	}
}
