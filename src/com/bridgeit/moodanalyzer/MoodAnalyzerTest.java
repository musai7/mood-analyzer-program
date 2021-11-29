package com.bridgeit.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	public static MoodAnalyzer moodAnalyzer;
	
	@BeforeClass
	public static void initialize() {
		moodAnalyzer = new MoodAnalyzer();
	}

	@Test
	public void test_Analyse_Mood_Return_Happy() {
		
		String message = "i am in happy mood";
		String currentMood = moodAnalyzer.analyzerMood(message);
		
		assertEquals("HAPPY", currentMood);	
	}
	
	@Test
	public void test_Analyse_Mood_Return_Sad() {
		
		String message = "i am in sad mood";
		String currentMood = moodAnalyzer.analyzerMood(message);
		
		assertEquals("SAD", currentMood);	
	}
}
