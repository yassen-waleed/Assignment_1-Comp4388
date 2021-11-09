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

import model.Match;
import model.MatchArrayAdapter;

public class DetailsActivity extends AppCompatActivity {

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        listView = findViewById(R.id.listview);
        Gson gson = new Gson();
        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        String json = mPrefs.getString("MyObject", "");
        Type type = new TypeToken<ArrayList<Match>>() {
        }.getType();
        ArrayList<Match> matches = gson.fromJson(json, type);
        MatchArrayAdapter adapter = new MatchArrayAdapter(this, R.layout.adapter_view_layout, matches);
        listView.setAdapter(adapter);

    }
}