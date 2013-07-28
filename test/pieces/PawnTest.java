package pieces;
import junit.framework.TestCase;
import static pieces.Piece.*;

public class PawnTest extends TestCase {
	
	public void testCreate() throws Exception {
		Piece myPawn = new Piece(WHITE);
		String pawnColor = myPawn.color;
		assertEquals(WHITE, pawnColor);

		Piece mySecondPawn = new Piece(BLACK);
		String mySecondpawnColor = mySecondPawn.color;
		assertEquals(BLACK, mySecondpawnColor);
	}
	
	public void testPrintPawn() throws Exception {
		Piece whitePawn = new Piece(WHITE);
		Piece blackPawn = new Piece(BLACK);
		
		assertEquals("P", blackPawn.print());
		assertEquals("p", whitePawn.print());
	}
}
