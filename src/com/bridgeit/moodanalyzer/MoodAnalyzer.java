package com.bridgeit.moodanalyzer;

public class MoodAnalyzer {
	
	public String message;
	
	public MoodAnalyzer() {
		
	}
	
	public MoodAnalyzer(String message) {
		
		this.message = message;
	}
	
	public String analyzerMood() {
		
		if(message.contains("happy")) {
			return "HAPPY";
		}else {
			return "SAD";
		}
	}
}
