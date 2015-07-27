import java.util.regex.*;

public class Regex{
	public static void main(String[] args) throws Exception {
	  // Email address validation.
		String pattern1 = "^[^@]+@[\\w]+(\\.[\\w]+)*$";
		String email = "xiaeryu@u.nus.edu";
		boolean ok = Pattern.matches( pattern1, email );
		System.out.println( ok );
		
		// Match Href in html files
		String patternString = "\\s*(href|src)\\s*=\\s*(\"([^\"]*\")|(\'[^\']*\')|([^\'\">\\s]+))"; 
		String text = "<a href=\"http://aaa.htm\">bbb</a> <img src=\"http://bb.com/pic.jpg\">";
		Pattern pattern2 = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern2.matcher( text );
		StringBuffer buffer = new StringBuffer();
		while (matcher.find()) {
			buffer.append("Captured: " + matcher.group()); 
			buffer.append(" The website is: " + matcher.group(2)); 
			buffer.append("\r\n");
		}
		System.out.println(buffer.toString());
		
		// Replacement.
		Pattern pattern3 = Pattern.compile("cat");
		Matcher matcher2 = pattern3.matcher("one cat, two cats in the yard");
		StringBuffer sb = new StringBuffer();
		while(matcher2.find()) {
			matcher2.appendReplacement(sb, "big $0"); // replace 'cat' with 'big cat'.
		}
		matcher2.appendTail(sb);
		// The Matcher appendReplacement() and appendTail() methods are used to replace string tokens in an input text, 
		// and append the resulting string to a StringBuffer.
		System.out.println(sb.toString());
		
		// Split based on regular expression.
		Pattern pattern4 = Pattern.compile( "[, \\s]+");
		String[] result = pattern4.split( "one,two, three   four ,  five ");
		for (int i=0; i<result.length; i++)
			System.out.println(result[i]);
	}  
}
