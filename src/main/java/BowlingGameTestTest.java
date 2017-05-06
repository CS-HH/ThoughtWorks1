package main.java;

import org.junit.Test;

/**
 * Created by Tom on 2017/5/6.
 */
public class BowlingGameTestTest {

    @Test
    public void testTestGetBowlingScore() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.getBowlingScore("X|X|X|X|X|X|X|X|X|X||XX");
        System.out.println(score);
    }
}