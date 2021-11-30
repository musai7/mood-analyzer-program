package com.bridgeit.moodanalyzer;

public class MoodAnalyzer {

	public String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {

		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {

		if (message == null) {
			throw new MoodAnalysisException(
					MoodAnalysisException.ExceptionType.NULL_MOOD_TYPE_EXCEPTION + "  please enter valid message");
		}else if(message.isEmpty()) {
			throw new MoodAnalysisException(
					MoodAnalysisException.ExceptionType.EMPTY_MOOD_TYPE_EXCEPTION + "  please enter valide message ");
		}
		else if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
