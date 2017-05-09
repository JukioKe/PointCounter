package com.example.jukka1.pointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Keeps track for Team A score
    int scoreTeamA = 0;

    //Keeps track for Team B score
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method displays the given score for Team A.
     */
    private void displayForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the given score for Team A.
     */
    private void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method resets the scores to 0.
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method adds three points for Team A.
     */
    public void addThreeForA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method adds two points for Team A.
     */
    public void addTwoForA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method adds one point for Team A.
     */
    public void addOneForA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method adds three points for Team B.
     */
    public void addThreeForB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method adds two points for Team B.
     */
    public void addTwoForB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method adds one point for Team B.
     */
    public void addOneForB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

}
