package com.example.assigment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;

import model.team.Team;
import model.team.TeamData;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void veiwgroups(View view) {
        TeamData model = new TeamData();
        ArrayList<Team> result = model.getTeams();

        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(result);
        prefsEditor.putString("teams", json);
        prefsEditor.apply();

        Intent groups = new Intent(this, GroupActivity.class);
        startActivity(groups);


    }

    public void viewMatchesActivity(View view) {

        Intent matchesview = new Intent(this, MatchesActivity.class);
        startActivity(matchesview);


    }


}