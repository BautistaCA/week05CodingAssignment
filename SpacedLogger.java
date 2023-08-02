package loggerInterface;

class SpacedLogger implements Logger {
	String word;
	
	public String getWord() {
	return word;
}

public void setWord(String word) {
	this.word = word;
}
	@Override
	public void log() {
		// TODO Auto-generated method stub
	StringBuilder spacedWord = new StringBuilder(); //basic for loop to space the words
		for (int i = 0; i < word.length(); i++) {
			spacedWord.append(word.charAt(i));
			spacedWord.append(" ");
	}
		spacedWord.deleteCharAt(spacedWord.length() - 1); //There's probably a better way
		System.out.println(spacedWord);//to not have to use 'deleteCharAt', not sure though 
	}

	@Override
	public void error() {
		// TODO Auto-generated method stub
		StringBuilder spacedWord = new StringBuilder(); //I realized after making this 
		for (int i = 0; i < word.length(); i++) {//that i could've made a single method
			spacedWord.append(word.charAt(i));//to use for both the log and error on this one
			spacedWord.append(" ");
	}
		spacedWord.deleteCharAt(spacedWord.length() - 1);
		System.out.println("ERROR: " + spacedWord);
	}

}
