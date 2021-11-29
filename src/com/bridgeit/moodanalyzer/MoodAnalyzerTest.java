package com.bridgeit.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {
	
	public static MoodAnalyzer moodAnalyzer;

	@Test
	public void test_Analyse_Mood_Return_Happy() {
		
		moodAnalyzer = new MoodAnalyzer("i am in happy");
		String currentMood = moodAnalyzer.analyzerMood();
		
		assertEquals("HAPPY", currentMood);	
	}
	
	@Test
	public void test_Analyse_Mood_Return_Sad() {
		
		moodAnalyzer = new MoodAnalyzer("i am in sad mood");
		String currentMood = moodAnalyzer.analyzerMood();
		
		assertEquals("SAD", currentMood);
	}
}
