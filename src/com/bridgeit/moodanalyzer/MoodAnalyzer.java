package com.bridgeit.moodanalyzer;

public class MoodAnalyzer {
	
	public String analyzerMood(String message) {
		
		if(message.contains("happy")) {
			return "HAPPY";
		}else {
			return "SAD";
		}
	}
}
