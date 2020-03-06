package com.example.animacionespractice;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tvInfor;
    ImageView ivCheck;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivCheck = findViewById(R.id.iv);
        ivCheck.setBackgroundResource(R.drawable.animation_check);

        animationDrawable = (AnimationDrawable) ivCheck.getBackground();

        ivCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();
            }
        });

    }


    public void cambiarVisibilidad(View view) {
        if (tvInfor.getVisibility() == View.VISIBLE) {
            tvInfor.setVisibility(View.GONE);
        } else {
            tvInfor.setVisibility(View.VISIBLE);
        }
    }
}
