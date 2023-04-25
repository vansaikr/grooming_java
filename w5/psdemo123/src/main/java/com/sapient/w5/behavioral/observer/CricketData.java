package com.sapient.w5.behavioral.observer;

import lombok.Data;

class CricketData {
    int runs;
    int wickets;
    float overs;
    CurrentScoreDisplay currentScoreDisplay;
    AverageScoreDisplay averageScoreDisplay;

    public CricketData(CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }
    private int getLatestRuns() {
        return currentScoreDisplay.getRuns();
    }
    private int getLatestWickets() {
        return currentScoreDisplay.getWickets();
    }
    private float getLatestOvers() {
        return currentScoreDisplay.getOvers();
    }

    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScoreDisplay.update(runs,wickets,overs);
        averageScoreDisplay.update(runs,wickets,overs);
    }
}

class AverageScoreDisplay {
    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float overs) {
        this.runRate = (float)runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    public void display() {
        System.out.println("\nAverage Score Display:\n" +
                "Run Rate: " + runRate +
                "\nPredictedScore for 50 overs: " + predictedScore);
    }
}

@Data
class CurrentScoreDisplay {
    private int runs;
    private int wickets;
    private float overs;

    public CurrentScoreDisplay(int runs,int wickets,float overs){
        this.runs=runs;
        this.wickets=wickets;
        this.overs=overs;
    }

    public void update(int runs,int wickets,float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\nCurrent Score Display: \n" +
                "Runs: " + this.runs +"\nWickets:"
                + this.wickets + "\nOvers: " + this.overs );
    }
}

// Driver class
class MainApp
{
    public static void main(String args[]) {
        CricketData cricketData = new CricketData(new CurrentScoreDisplay(100,4,6.7f), new AverageScoreDisplay());
        cricketData.dataChanged();
    }
}

