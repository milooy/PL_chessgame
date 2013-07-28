package pieces;
import junit.framework.TestCase;
import static pieces.Pawn.*;

public class PawnTest extends TestCase {
	
	public void testCreate() throws Exception {
		Pawn myPawn = new Pawn(WHITE);
		String pawnColor = myPawn.color;
		assertEquals(WHITE, pawnColor);

		Pawn mySecondPawn = new Pawn(BLACK);
		String mySecondpawnColor = mySecondPawn.color;
		assertEquals(BLACK, mySecondpawnColor);
	}
	
	public void testPrintPawn() throws Exception {
		Pawn whitePawn = new Pawn(WHITE);
		Pawn blackPawn = new Pawn(BLACK);
		
		assertEquals("P", blackPawn.print());
		assertEquals("p", whitePawn.print());
	}
}
