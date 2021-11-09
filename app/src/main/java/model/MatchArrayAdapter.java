package model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.assigment1.R;

import java.util.ArrayList;

public class MatchArrayAdapter extends ArrayAdapter<Match> {
public static final String TAG = "MatchArrayAdapter" ;
private Context mcontext ;
int mresource ;

    public MatchArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Match> objects) {
        super(context, resource, objects);
        mcontext=context ;
        mresource=resource ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       String team_1 = getItem(position).getTeam_1_name() ;
        String team_2 = getItem(position).getTeam_2_name() ;
        int score_1 = getItem(position).getTeam_1_score() ;
        int score_2 = getItem(position).getTeam_2_score();
        String date = getItem(position).getMatch_date() ;
        String stadium = getItem(position).getStadium_name()  ;
        Match match = new Match(team_1,team_2,score_1,score_2,date,stadium) ;
        LayoutInflater inflater = LayoutInflater.from(mcontext) ;
        convertView = inflater.inflate(mresource,parent,false) ;
        TextView t1_name = convertView.findViewById(R.id.team_1);
        TextView t2_name = convertView.findViewById(R.id.team_2);
        TextView t1_score = convertView.findViewById(R.id.team_1_score);
        TextView t2_score = convertView.findViewById(R.id.team_2_score);
        TextView date_view = convertView.findViewById(R.id.date);
        TextView stad_view = convertView.findViewById(R.id.stad);
        t1_name.setText(team_1);
        t2_name.setText(team_2);
        t1_score.setText(String.valueOf(score_1));
        t2_score.setText(String.valueOf(score_2));
        date_view.setText("Date: "+date);
        stad_view.setText("Stadium"+stadium);
        return convertView ;
    }
}
