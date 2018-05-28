package com.example.android.footballscoreboard;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    int scoreTeamA, scoreTeamB = 0;
    int posA, posB = 0;
    int shotA, shotB = 0;
    int cornerA, cornerB = 0;
    int foulA, foulB = 0;
    int yellowA, yellowB = 0;
    int redA, redB = 0;
    int offsideA, offsideB = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.help) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    // increment when clicked

    public void addGoalTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        scoreView.setText(String.valueOf(score));
    }

    public void addPossessionA(View v) {
        posA += 5;
        displayPossTeamA(posA);
    }

    public void displayPossTeamA(int poss) {
        TextView scoreView = (TextView) findViewById(R.id.addPossessionByOneA);
        scoreView.setText(String.valueOf(poss));
    }

    public void addPossessionB(View v) {
        posB += 5;
        displayPossTeamB(posB);
    }

    public void displayPossTeamB(int poss) {
        TextView scoreView = (TextView) findViewById(R.id.addPossessionByOneB);
        scoreView.setText(String.valueOf(poss));
    }

    public void addShotA(View v) {
        shotA += 1;
        displayShotTeamA(shotA);
    }

    public void displayShotTeamA(int shot) {
        TextView scoreView = (TextView) findViewById(R.id.addShotByOneA);
        scoreView.setText(String.valueOf(shot));
    }

    public void addShotB(View v) {
        shotB += 1;
        displayShotTeamB(shotB);
    }

    public void displayShotTeamB(int shot) {
        TextView scoreView = (TextView) findViewById(R.id.addShotByOneB);
        scoreView.setText(String.valueOf(shot));
    }

    public void addCornerA(View v) {
        cornerA += 1;
        displayCornerTeamA(cornerA);
    }

    public void displayCornerTeamA(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.addCornerByOneA);
        scoreView.setText(String.valueOf(corner));
    }

    public void addCornerB(View v) {
        cornerB += 1;
        displayCornerTeamB(cornerB);
    }

    public void displayCornerTeamB(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.addCornerByOneB);
        scoreView.setText(String.valueOf(corner));
    }

    public void addYellowA(View v) {
        yellowA += 1;
        displayYcardTeamA(yellowA);
    }

    public void displayYcardTeamA(int yc) {
        TextView scoreView = (TextView) findViewById(R.id.addYellowByOneA);
        scoreView.setText(String.valueOf(yc));
    }

    public void addYellowB(View v) {
        yellowB += 1;
        displayYcardTeamB(yellowB);
    }

    public void displayYcardTeamB(int yc) {
        TextView scoreView = (TextView) findViewById(R.id.addYellowByOneB);
        scoreView.setText(String.valueOf(yc));
    }

    public void addRedA(View v) {
        redA += 1;
        displayRcardTeamA(redA);
    }

    public void displayRcardTeamA(int rc) {
        TextView scoreView = (TextView) findViewById(R.id.addRedByOneA);
        scoreView.setText(String.valueOf(rc));
    }

    public void addRedB(View v) {
        redB += 1;
        displayRcardTeamB(redB);
    }

    public void displayRcardTeamB(int rc) {
        TextView scoreView = (TextView) findViewById(R.id.addRedByOneB);
        scoreView.setText(String.valueOf(rc));
    }

    public void addFoulA(View v) {
        foulA += 1;
        displayFoulTeamA(foulA);
    }

    public void displayFoulTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.addFoulByOneA);
        scoreView.setText(String.valueOf(foul));
    }

    public void addFoulB(View v) {
        foulB += 1;
        displayFoulTeamB(foulB);
    }

    public void displayFoulTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.addFoulByOneB);
        scoreView.setText(String.valueOf(foul));
    }

    public void addOffsideA(View v) {
        offsideA += 1;
        displayOffTeamA(offsideA);
    }

    public void displayOffTeamA(int offside) {
        TextView scoreView = (TextView) findViewById(R.id.addOffsideByOneA);
        scoreView.setText(String.valueOf(offside));
    }

    public void addOffsideB(View v) {
        offsideB += 1;
        displayOffTeamB(offsideB);
    }

    public void displayOffTeamB(int offside) {
        TextView scoreView = (TextView) findViewById(R.id.addOffsideByOneB);
        scoreView.setText(String.valueOf(offside));
    }


    public void resetScore(View v) {
        Toast toast =Toast.makeText(this, "Thanks for using Football Score Board", Toast.LENGTH_SHORT);
        toast.show();
        scoreTeamA = 0;
        scoreTeamB = 0;
        posA = 0;
        posB = 0;
        shotA = 0;
        shotB = 0;
        cornerA = 0;
        cornerB = 0;
        foulA = 0;
        foulB = 0;
        yellowA = 0;
        yellowB = 0;
        redA = 0;
        redB = 0;
        offsideA = 0;
        offsideB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayPossTeamA(posA);
        displayPossTeamB(posB);
        displayShotTeamA(shotA);
        displayShotTeamB(shotB);
        displayCornerTeamA(cornerA);
        displayCornerTeamB(cornerB);
        displayFoulTeamA(foulA);
        displayFoulTeamB(foulB);
        displayYcardTeamA(yellowA);
        displayYcardTeamB(yellowB);
        displayRcardTeamA(redA);
        displayRcardTeamB(redB);
        displayOffTeamA(offsideA);
        displayOffTeamA(offsideB);
    }
}