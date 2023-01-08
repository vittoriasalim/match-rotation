package com.match_rotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {
    private ArrayList<ArrayList<String>> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        addElement();
    }
    public void addElement(){
        ViewGroup layout = (ViewGroup) findViewById(R.id.game_layout);


        TextView tv = new TextView(this);

        tv.setText("Added tv");
        layout.addView(tv);

    }
}