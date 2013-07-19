package pieces;
import junit.framework.TestCase;

public class PawnTest extends TestCase {

	private static final String WHITE = "white";
	private static final String BLACK = "black";
	
	public void testCreate() throws Exception {
		Pawn myPawn = new Pawn();
		String pawnColor = myPawn.color;
		assertEquals(WHITE, pawnColor);

		Pawn mySecondPawn = new Pawn(BLACK);
		String mySecondpawnColor = mySecondPawn.color;
		assertEquals(BLACK, mySecondpawnColor);
	}
	
	public void testPrintPawn() throws Exception {
		Pawn whitePawn = new Pawn();
		Pawn blackPawn = new Pawn(BLACK);
		
		assertEquals("P", blackPawn.print());
		assertEquals("p", whitePawn.print());
	}
}
