package chess;

import java.util.ArrayList;

import pieces.Piece;

public class RowLine {
	public static final String WHITE = "white";
	public static final String BLACK = "black";

	public static int doInit(ArrayList<ArrayList<Piece>> chessBoard){
		ArrayList<Piece> emptyList = new ArrayList<Piece>();
		ArrayList<Piece> blackListOfPawn= new ArrayList<Piece>();
		ArrayList<Piece> whiteListOfPawn= new ArrayList<Piece>();
		ArrayList<Piece> blackListOfNotPawn= new ArrayList<Piece>();
		ArrayList<Piece> whiteListOfNotPawn= new ArrayList<Piece>();
		
		for (int idx = 0;idx < 8;idx++){
			emptyList.add(Piece.create("", ""));
			blackListOfPawn.add(Piece.create(BLACK, "pawn"));
			whiteListOfPawn.add(Piece.create(WHITE, "pawn"));
		}
		
		blackListOfNotPawn.add(Piece.create(BLACK, "rook"));
		blackListOfNotPawn.add(Piece.create(BLACK, "knight"));
		blackListOfNotPawn.add(Piece.create(BLACK, "bishop"));
		blackListOfNotPawn.add(Piece.create(BLACK, "queen"));
		blackListOfNotPawn.add(Piece.create(BLACK, "king"));
		blackListOfNotPawn.add(Piece.create(BLACK, "bishop"));
		blackListOfNotPawn.add(Piece.create(BLACK, "knight"));
		blackListOfNotPawn.add(Piece.create(BLACK, "rook"));
		
		whiteListOfNotPawn.add(Piece.create(WHITE, "rook"));
		whiteListOfNotPawn.add(Piece.create(WHITE, "knight"));
		whiteListOfNotPawn.add(Piece.create(WHITE, "bishop"));
		whiteListOfNotPawn.add(Piece.create(WHITE, "queen"));
		whiteListOfNotPawn.add(Piece.create(WHITE, "king"));
		whiteListOfNotPawn.add(Piece.create(WHITE, "bishop"));
		whiteListOfNotPawn.add(Piece.create(WHITE, "knight"));
		whiteListOfNotPawn.add(Piece.create(WHITE, "rook"));
		
		
		chessBoard.add(whiteListOfNotPawn);
		chessBoard.add(whiteListOfPawn);
		for (int idx = 0;idx<4;idx++)
			chessBoard.add(emptyList);
		chessBoard.add(blackListOfPawn);
		chessBoard.add(blackListOfNotPawn);
		
		return blackListOfNotPawn.size()+
				blackListOfPawn.size()+
				whiteListOfNotPawn.size()+
				whiteListOfPawn.size();
	}
	
	
}
