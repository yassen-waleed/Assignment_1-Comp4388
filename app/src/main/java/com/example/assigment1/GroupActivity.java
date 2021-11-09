package com.example.assigment1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import model.team.Team;
import model.team.TeamAdabter;

public class GroupActivity extends AppCompatActivity {
public ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        listView = findViewById(R.id.listview1)  ;
        Gson gson = new Gson();
        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        String json = mPrefs.getString("teams", "");
        Type type = new TypeToken<ArrayList<Team>>() {
        }.getType();
        ArrayList<Team> teams = gson.fromJson(json, type);
        TeamAdabter adapter = new TeamAdabter(this, R.layout.adabter_group_layout, teams);
        listView.setAdapter(adapter);
    }
}