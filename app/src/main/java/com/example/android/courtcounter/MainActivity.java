package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Team 1 by 6 point.
     */
    public void addSixForTeam1(View v) {
        scoreTeam1 += 5;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 3 points.
     */
    public void addThreeForTeam1(View v) {
        scoreTeam1 += 3;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 1 points
     */
    public void addOneForTeam1(View v) {
        scoreTeam1 += 1;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 2 points
     */
    public void addTwoForTeam1(View v) {
        scoreTeam1 += 2;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Same thing as the first four methods but for team 2
     */
    public void addSixForTeam2(View v) {
        scoreTeam2 += 6;
        displayForTeam2(scoreTeam2);
    }

    public void addThreeForTeam2(View v) {
        scoreTeam2 += 3;
        displayForTeam2(scoreTeam2);
    }

    public void addOneForTeam2(View v) {
        scoreTeam2 += 1;
        displayForTeam2(scoreTeam2);
    }

    public void addTwoForTeam2(View v) {
        scoreTeam2 += 2;
        displayForTeam2(scoreTeam2);
    }


    /**
     * Displays the given reset score for both teams.
     */
    public void startOver(View v) {
        scoreTeam1 = 0;
        displayForTeam1(scoreTeam1);
        scoreTeam2 = 0;
        displayForTeam2(scoreTeam2);
    }

    public void displayForTeam1(int score) {
        TextView scoreView = findViewById(R.id.team1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam2(int score) {
        TextView scoreView = findViewById(R.id.team2_score);
        scoreView.setText(String.valueOf(score));
    }
}