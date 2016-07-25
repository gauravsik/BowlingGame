package main.java.bowl;

/**
 * Created by gauravsi on 7/23/2016.
 */
public class BowlingGame {
    private int noOfFrames = 10;
    private int scoreOfTry[] = new int[21]; // the array of tries will be off 21 because bowler has to get
    // an extra try for bowling a spare or strike in the last frame
    private int currentTry = 0;

    public void addToFrame(int pins) {
        scoreOfTry[currentTry++] = pins;
    }

    public int totalScore() {
        int totalScore = 0 , trial = 0;
        totalScore = calculateScore(totalScore, trial);
        return totalScore;
    }

    public int calculateScore(int totalScore, int trial) {
        for(int frame = 0; frame < noOfFrames ; frame++) {
            if (isSpare(trial)) {
                totalScore = totalScore + 10 + getScoreForSpare(trial);
                trial = trial + 2;
            } else if (isStrike(trial)) {
                totalScore += 10 + getScoreForStrike(trial);
                trial++;
            } else {
                totalScore += getTotalTries(trial);
                trial = trial + 2;
            }
        }
        return totalScore;
    }

    public int getTotalTries(int trial) {
        return scoreOfTry[trial] + scoreOfTry[trial + 1];
    }

    public int getScoreForSpare(int trial) {
        return scoreOfTry[trial + 2];
    }

    public int getScoreForStrike(int trial) {
        return scoreOfTry[trial + 1] + scoreOfTry[trial + 2];
    }

    private boolean isStrike(int trial) {
        return scoreOfTry[trial] == 10;
    }

    public boolean isSpare(int trie) {
        return scoreOfTry[trie] + scoreOfTry[trie + 1] == 10;
    }

}
