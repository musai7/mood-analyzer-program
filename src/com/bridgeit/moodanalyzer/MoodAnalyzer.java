package com.bridgeit.moodanalyzer;

public class MoodAnalyzer {
	
	public String message;
	
	public MoodAnalyzer() {
		
	}
	
	public MoodAnalyzer(String message) {
		
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalysisException {
		
		try {
			if(message.contains("sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		} catch (NullPointerException npe) {
			throw new MoodAnalysisException("please enter valid message");
		}
	}
}
