package chess;
import pieces.Piece;
import util.StringUtil;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	Board testBoard = new Board();
	
	public void setUp(){
		testBoard = new Board();
	}
	public void testCreate() throws Exception {
		testBoard.initialize();
		assertEquals(32, testBoard.getNumOfPawn());
		
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(
				StringUtil.appendNewLine("RNBQKBNR") +
				StringUtil.appendNewLine("PPPPPPPP") +
				blankRank +blankRank+blankRank+blankRank+
				StringUtil.appendNewLine("pppppppp") +
				StringUtil.appendNewLine("rnbqkbnr"), testBoard.printBoard());
		
		assertEquals(16, Piece.numOfBlack);
		assertEquals(16, Piece.numOfWhite);
		
	}	

}
