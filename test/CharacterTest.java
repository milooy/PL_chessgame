import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	public void testWhitespace() throws Exception {
		assertTrue(Character.isWhitespace('\n'));
		assertTrue(Character.isWhitespace('\t'));
		assertTrue(Character.isWhitespace(' '));
	}
	
	public void testIdentifier() throws Exception {
		assertEquals(false, Character.isJavaIdentifierPart('^'));  // 인자가 Identifier 규칙에 맞는지 검사
		assertEquals(true, Character.isJavaIdentifierPart('_'));
		assertEquals(true, Character.isJavaIdentifierPart('2'));
	}
}
