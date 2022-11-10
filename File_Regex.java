package arrayafter;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileReader;
import java.io.BufferedReader;

public class File_Regex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("/home/krishna/Documents/Contact.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String name = br.readLine();
		while (name != null) {
			// System.out.println(name);

			Pattern pattern = Pattern.compile("(0|91|91-)?[6-9][0-9]{9}");
			Matcher matcher = pattern.matcher(name);
			if (matcher.find()) {
				System.out.println(matcher.group());
			}

			name = br.readLine();
		}
	}
}
