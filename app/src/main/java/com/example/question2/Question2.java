package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question2 extends AppCompatActivity {

    Button btnPre, btnNext;
    ImageView imageView;

    int index;

    int [] jjanImg = {R.drawable.jjang1,R.drawable.jjang2,R.drawable.jjang3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        btnPre = findViewById(R.id.btnPre);
        btnNext = findViewById(R.id.btnNext);
        imageView = findViewById(R.id.imgView);

        index = 0;

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                if (index<0){
                    index = 2;
                    imageView.setImageResource(jjanImg[index]);
                }else{
                    imageView.setImageResource(jjanImg[index]);
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                if(index>=jjanImg.length){
                    index = 0;
                    imageView.setImageResource(jjanImg[index]);
                }else{
                    imageView.setImageResource(jjanImg[index]);
                }
            }
        });



    }
}