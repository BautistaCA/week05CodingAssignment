package loggerInterface;

public class AsteriskLogger implements Logger {
String word;
	public String getWord() {
	return word;
}

public void setWord(String word) {
	this.word = word;
}
//	I added the getter/setter last so I wouldn't confuse myself while creating the rest of the code
//	For both the log and error I went with what I thought would be "the path of least resistance"
//	since there is absolute values involved in this project; the 6 asterisks that are on the same
//	line as the word in both the log/error, and the 13 asterisks that will always be above and 
//  below the word line in error. 
	@Override
	public void log() {
		// TODO Auto-generated method stub

		System.out.println("***" + word + "***");
	}

	@Override
	public void error() {
		// TODO Auto-generated method stub
//	I went with a stringbuilder to stay in the habit of not using immutable values whenever possible, 
//	there probably is a better way to implement it though
		System.out.println();
		StringBuilder asterisk = new StringBuilder();
		for (int i = 1; i <= (word.length() + 13); i++) {
			asterisk.append('*');
		}
		StringBuilder asterisk2 = new StringBuilder();
		asterisk2.append(asterisk);
		asterisk.append('\n');
		asterisk.append("***Error: ");
		asterisk.append(word);
		asterisk.append("***");
		asterisk.append('\n');
		asterisk.append(asterisk2);
		System.out.println(asterisk);
	}
	}

