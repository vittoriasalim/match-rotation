package com.match_rotation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button = (Button) findViewById(R.id.button16);
        this.button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startGame();
            }
        });

    }
    public void startGame(){
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
    }
}
