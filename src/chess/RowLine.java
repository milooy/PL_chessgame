package chess;

import java.util.ArrayList;

import pieces.Pawn;

public class RowLine {
	public static void doInit(ArrayList<ArrayList<Pawn>> chessBoard){
		ArrayList<Pawn> emptyList = new ArrayList<Pawn>();
		ArrayList<Pawn> blackList= new ArrayList<Pawn>();
		ArrayList<Pawn> whiteList= new ArrayList<Pawn>();
		
		for (int idx = 0;idx < 8;idx++){
			emptyList.add(new Pawn());
			blackList.add(new Pawn("black"));
			whiteList.add(new Pawn("white"));
		}
		
		chessBoard.add(emptyList);
		chessBoard.add(whiteList);
		for (int idx = 0;idx<4;idx++)
			chessBoard.add(emptyList);
		chessBoard.add(blackList);
		chessBoard.add(emptyList);
	}
}
