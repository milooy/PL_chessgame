package chess;
import java.util.ArrayList;

import pieces.Piece;
import util.StringUtil;


public class Board {
	private int numOfPawn = 0;
	private ArrayList<Piece> pawnList= new ArrayList<Piece>();
	private ArrayList<ArrayList<Piece>> chessBoard = new ArrayList<ArrayList<Piece>>();
	
	public void initialize(){
		numOfPawn = RowLine.doInit(chessBoard);
	}

	public void addPawn(Piece pawn){  
		pawnList.add(pawn);
		numOfPawn++;
	}
	
	public int getNumOfPawn(){
		return numOfPawn;
	}
	
	public boolean hasPawn(Piece pawn){
		return pawnList.contains(pawn);
	}

	public String printBoard(){
		StringBuilder sb = new StringBuilder();
		
		for (int idx = 7;idx >=0; idx--){
			System.out.print(printRow(idx));
			sb.append(printRow(idx));
		}
		
		return sb.toString();
			
	}
	
	public String printRow(int i) {
		ArrayList<Piece> rowListPawn = chessBoard.get(i);
		StringBuilder sb = new StringBuilder();
				
		for (int idx = 0;idx < rowListPawn.size(); idx++)
			sb.append(rowListPawn.get(idx).print());
		
		return StringUtil.appendNewLine(sb.toString());
	}
	
}
