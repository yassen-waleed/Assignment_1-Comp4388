package model.team;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.assigment1.R;

import java.util.List;

public class TeamAdabter extends ArrayAdapter<Team> {
    public static final String TAG = "TeamAdabter" ;
    public  Context mcontext ;
    int mresource;
    public TeamAdabter(@NonNull Context context, int resource, @NonNull List<Team> objects) {
        super(context, resource, objects);
        mcontext=context ;
        mresource=resource ;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String teaName = getItem(position).getName() ;
        String group = getItem(position).getGroup() ;
        int score = getItem(position).getScore() ;

        Team team=new Team(teaName,score,group);
        LayoutInflater inflater = LayoutInflater.from(mcontext) ;
        convertView = inflater.inflate(mresource,parent,false) ;
        TextView Teame_Name = convertView.findViewById(R.id.teamName);
        TextView groupp = convertView.findViewById(R.id.group);
        TextView sscore = convertView.findViewById(R.id.score);
        Teame_Name.setText(team.getName());
        groupp.setText(team.getGroup());
        sscore.setText(String.valueOf(team.getScore()));

        return convertView ;
    }
}
