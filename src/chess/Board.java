package chess;
import java.util.ArrayList;

import pieces.Pawn;

/**
 * @author kimminhyeok
 * 체스판 만드는 클래스.
 */
public class Board {
	private int numOfPawn = 0;
	
	private ArrayList<Pawn> pawnList= new ArrayList<Pawn>();
	private ArrayList<ArrayList<Pawn>> chessBoard = new ArrayList<ArrayList<Pawn>>();
	
	public void initialize(){
		ArrayList<Pawn> emptyList = new ArrayList<Pawn>();
		ArrayList<Pawn> blackList= new ArrayList<Pawn>();
		ArrayList<Pawn> whiteList= new ArrayList<Pawn>();
		
		for (int idx = 0;idx < 8;idx++){
			blackList.add(new Pawn("black"));
			whiteList.add(new Pawn());
		}
		
		chessBoard.add(emptyList);
		chessBoard.add(whiteList);
		for (int idx = 0;idx<4;idx++)
			chessBoard.add(emptyList);
		chessBoard.add(blackList);
	}
	
	/**
	 * 폰을 추가하고 폰의 개수도 하나씩 올려줌.
	 * @param addPawn -> 문제 2-8 : Pawn 클래스를 인자로 받고 있기 때문에 다른 객체가 추가될 리 없다
	 */
	public void addPawn(Pawn addPawn){  
		pawnList.add(addPawn);
		numOfPawn++;
	}
	
	/**
	 * 폰의 개수를 반환하는 메소
	 * @return
	 */
	public int getNumOfPawn(){
		return numOfPawn;
	}
	
	/**
	 * 인자로 받은 폰이 폰리스트에 들어가 있는지 확인하는 메소드.
	 * @param testPawn
	 * @return
	 */
	public boolean hasPawn(Pawn testPawn){
		return pawnList.contains(testPawn);
	}

	public String printRow(int i) {
		ArrayList<Pawn> rowListPawn = chessBoard.get(i);
		StringBuilder sb = new StringBuilder();
		
		for (int idx = 0;idx < rowListPawn.size(); idx++){
			sb.append(rowListPawn.get(idx).print());
		}
		return sb.toString();
	}
}
