package util;

public class StringUtil {
	private static final String NEWLINE = System.getProperty("line.separator");

	private StringUtil() {}
	
	public static String appendNewLine(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.append(NEWLINE);
		
		return sb.toString();
	}
}
