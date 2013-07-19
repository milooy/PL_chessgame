package chess;
import pieces.Pawn;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	private static final String WHITE = "white";
	private static final String BLACK = "black";
	private Board myBoard;
	
	public void setUp(){
		myBoard = new Board();
	}
	public void testCreate() throws Exception {
		Board testBoard = new Board();
		testBoard.initialize();
		assertEquals(0, testBoard.getNumOfPawn());
		
		assertEquals("pppppppp", testBoard.printRow(1));
		assertEquals("PPPPPPPP", testBoard.printRow(6));
	}
	
	public void testaddPawn() throws Exception {
		myBoard.addPawn(new Pawn(BLACK));
		myBoard.addPawn(new Pawn(WHITE));
		
		assertEquals(2, myBoard.getNumOfPawn());
		assertEquals(true, myBoard.hasPawn(new Pawn(BLACK)));
	}
	

}
