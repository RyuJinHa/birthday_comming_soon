package com.example.myapplication.Prime_Activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class Prime_3F_Activity extends AppCompatActivity {



    int flag = 0;
    TextView textview;
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    MyView myView;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_3f);


        textview=findViewById(R.id.textView6);
        imageView = findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.p_3f);
        imageView2 = findViewById(R.id.p_3f_301);

        moving_301();
        moving_302();
        moving_303();
        moving_304();
        moving_305();
        moving_306();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }




    // 301호에서 최단거리 이동
    private void moving_301() {
        final Button b = (Button) findViewById(R.id.p_301);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {


                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.GONE);
                        imageView2.setVisibility(View.VISIBLE);

                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1400, 1270, 1270); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 530, 530, 400); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);

                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.GONE);

                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0); //기존의 이미지 위치로 복귀
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();



                    }
                    flag = 0;
                }

            }
        });
    }


    // 302호에서 최단거리 이동
    private void moving_302() {
        final Button b = (Button) findViewById(R.id.p_302);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1130, 1270, 1270); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  530, 530, 400); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0); //기존의 이미지 위치로 복귀
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    // 303호에서 최단거리 이동
    private void moving_303() {
        final Button b = (Button) findViewById(R.id.p_303);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  850, 850); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  650, 772); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0); //기존의 이미지 위치로 복귀
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    //304호에서 최단거리 이동
    private void moving_304() {
        final Button button = (Button) findViewById(R.id.p_304);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  850, 850);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  500, 772);
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0);
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    //305호에서 최단거리 이동
    private void moving_305() {
        final Button button = (Button) findViewById(R.id.p_305);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 850, 850);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  320, 775);
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0);
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }

    //306호에서 최단거리 이동
    private void moving_306() {
        final Button button = (Button) findViewById(R.id.p_306);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 960, 850, 850);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 530, 530, 772);
                        animation3.setDuration(1500);
                        animation3.start();
                    }
                    flag = 1;
                } else {
                    {
                        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationX", 0);
                        animation.setDuration(500);
                        animation.start();

                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(iv, "translationY", 0);
                        animation2.setDuration(500);
                        animation2.start();
                    }
                    flag = 0;
                }

            }
        });
    }
}