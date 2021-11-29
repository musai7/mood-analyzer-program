package com.bridgeit.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
	
	public static MoodAnalyzer moodAnalyzer;

	@Test
	public void test_Analyse_Mood_Return_Happy() {
		
		moodAnalyzer = new MoodAnalyzer(null);
		String currentMood = null;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(MoodAnalysisException.class);
			currentMood = moodAnalyzer.analyseMood();
			assertEquals("HAPPY", currentMood);	
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_Analyse_Mood_Return_Sad() throws MoodAnalysisException {
		
		moodAnalyzer = new MoodAnalyzer("i am in sad mood");
		String currentMood = moodAnalyzer.analyseMood();
		
		assertEquals("SAD", currentMood);
	}
}
