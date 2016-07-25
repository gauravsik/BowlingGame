package test.java.bowl;

import main.java.bowl.BowlingGame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by gauravsi on 7/23/2016.
 */

public class BowlingTest {
    BowlingGame bowlingGame = new BowlingGame();
    @Test
    public void itShouldTestBowlingGameForOneTry () {
        bowlingGame.addToFrame(0);
        Assert.assertEquals(0 , bowlingGame.totalScore());
    }

    @Test
    public void itShouldTestBowlingGameForMoreThanOneTry (){
        bowlingGame.addToFrame(2);
        bowlingGame.addToFrame(4);
        bowlingGame.addToFrame(6);
        bowlingGame.addToFrame(4);
        Assert.assertEquals(16 , bowlingGame.totalScore());
    }
    @Test
    public void itShouldCallItSpareWhenAllPinsDownInTwoTry(){
        bowlingGame.addToFrame(3);
        bowlingGame.addToFrame(7);
        bowlingGame.addToFrame(3);
        Assert.assertEquals(16 , bowlingGame.totalScore());
    }

    @Test
    public  void itShouldCallItStrikeWhenAllPinsDownInOneTry (){
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(3);
        bowlingGame.addToFrame(4);
        Assert.assertEquals(24 , bowlingGame.totalScore());
    }

    @Test
    public void itShouldCallItAPerfectGame () {
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        Assert.assertEquals(300 , bowlingGame.totalScore());
    }

    @Test
    public void itShouldGiveABonusTryIfSpareOrStrikeInTheLastFrame () {
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(0);
        bowlingGame.addToFrame(10);
        bowlingGame.addToFrame(10);
        Assert.assertEquals(20 , bowlingGame.totalScore());

    }

}
