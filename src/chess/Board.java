package chess;
import java.util.ArrayList;

import pieces.Pawn;
import util.StringUtil;


public class Board {
	private int numOfPawn = 0;
	private ArrayList<Pawn> pawnList= new ArrayList<Pawn>();
	private ArrayList<ArrayList<Pawn>> chessBoard = new ArrayList<ArrayList<Pawn>>();
	
	public void initialize(){
		RowLine.doInit(chessBoard);
	}

	public void addPawn(Pawn pawn){  
		pawnList.add(pawn);
		numOfPawn++;
	}
	
	public int getNumOfPawn(){
		return numOfPawn;
	}
	
	public boolean hasPawn(Pawn pawn){
		return pawnList.contains(pawn);
	}

	public void printBoard(){
		for (int idx = 7;idx >=0; idx--)
			System.out.print(printRow(idx));
	}
	
	public String printRow(int i) {
		ArrayList<Pawn> rowListPawn = chessBoard.get(i);
		StringBuilder sb = new StringBuilder();
				
		for (int idx = 0;idx < rowListPawn.size(); idx++)
			sb.append(rowListPawn.get(idx).print());
		
		return StringUtil.appendNewLine(sb.toString());
	}
	
}
