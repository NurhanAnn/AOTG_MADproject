package com.example.practical4_task2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BtnSubmit = findViewById(R.id.BtnSubmit);
        BtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox CBRed = findViewById(R.id.CBRed);
                CheckBox CBGreen = findViewById(R.id.CBGreen);
                CheckBox CBBlue = findViewById(R.id.CBBlue);

                ConstraintLayout CSLayout = findViewById(R.id.CLayoutCS);

                if(CBRed.isChecked())
                    CSLayout.setBackgroundColor(Color.RED);
                else if(CBGreen.isChecked())
                    CSLayout.setBackgroundColor(Color.GREEN);
                else
                    CSLayout.setBackgroundColor(Color.BLUE);
            }
        });
    }

}