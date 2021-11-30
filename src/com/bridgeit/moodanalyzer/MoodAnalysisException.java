package com.bridgeit.moodanalyzer;

public class MoodAnalysisException extends Exception {
	
	enum ExceptionType {
		
		NULL_MOOD_TYPE_EXCEPTION,
		EMPTY_MOOD_TYPE_EXCEPTION
	}
	
	private static final long serialVersionUID = 1L;

	public MoodAnalysisException(String message) {
		
		super(message);
	}

}
