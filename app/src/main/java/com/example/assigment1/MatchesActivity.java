package com.example.assigment1;

import static android.content.SharedPreferences.Editor;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;

import model.Match;
import model.MatchData;

public class MatchesActivity extends AppCompatActivity {
    public Spinner spinner;
    public EditText list;
    public ListView list_view ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        spinner = findViewById(R.id.spinner);


        PapulateSpinner();
    }

    private void PapulateSpinner() {

        MatchData obj = new MatchData();
        String[] types = obj.getStatusType();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, types);
        spinner.setAdapter(adapter);

    }

    public void view_match_data(View view) {

        String type = spinner.getSelectedItem().toString();
        MatchData model = new MatchData();
        ArrayList<Match> result = model.getMatchbystatus(type);
        Match[] matches = new Match[result.size()] ;

        for (int i = 0; i <result.size() ; i++) {
            matches[i] = result.get(i) ;
        }
        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(matches);
        prefsEditor.putString("MyObject", json);
        prefsEditor.apply();
        Intent detail = new Intent(this,DetailsActivity.class) ;
        startActivity(detail);




    }
}