import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask1 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		String regex = "(^\\+359)(\\s)2(\\s)(\\d{3})(\\s)(\\d{4})$|(^\\+359)-2-(\\d{3})-(\\d{4})$";
		Pattern pattern = Pattern.compile(regex);

		while (userInput != null) {
			Matcher matcher = pattern.matcher(userInput);
			if (matcher.matches()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			userInput = reader.readLine();
		}
	}
}
