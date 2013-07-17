package chess;
import java.util.ArrayList;

/**
 * @author kimminhyeok
 * 체스판 만드는 클래스.
 */
public class Board {
	private int NumOfPawn = 0;
	private ArrayList<Pawn> PawnList= new ArrayList<Pawn>();
	
	/**
	 * 폰을 추가하고 폰의 개수도 하나씩 올려줌.
	 * @param addPawn
	 */
	public void addPawn(Pawn addPawn){
		PawnList.add(addPawn);
		NumOfPawn++;
	}
	
	/**
	 * 폰의 개수를 반환하는 메소
	 * @return
	 */
	public int getNumOfPawn(){
		return NumOfPawn;
	}
	
	/**
	 * 인자로 받은 폰이 폰리스트에 들어가 있는지 확인하는 메소드.
	 * @param testPawn
	 * @return
	 */
	public boolean hasPawn(Pawn testPawn){
		return PawnList.contains(testPawn);
	}
}
