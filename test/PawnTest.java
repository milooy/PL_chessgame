import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn myPawn = new Pawn();
		String pawnColor = myPawn.color;
		assertEquals("white", pawnColor);
		
		Pawn mySecondPawn = new Pawn("black");
		String mySecondpawnColor = mySecondPawn.color;
		assertEquals("black", mySecondpawnColor);
	}
}
