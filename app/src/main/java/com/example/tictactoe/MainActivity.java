package com.example.tictactoe;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvtop;
    TextView tvbottom;
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    ImageButton btn6;
    ImageButton btn7;
    ImageButton btn8;
    ImageButton btn9;
    Button startbtn;
    Button restart;
    int i[] = new int[9];
    boolean winFlag;
    ImageView circle1;
    ImageView cross1;
    ImageView circle2;
    ImageView cross2;
    ImageView circle3;
    ImageView cross3;
    ImageView circle4;
    ImageView cross4;
    ImageView circle5;
    ImageView cross5;
    ImageView cross6;
    ImageView circle6;
    ImageView circle7;
    ImageView cross7;
    ImageView circle8;
    ImageView cross8;
    ImageView circle9;
    ImageView cross9;

    RelativeLayout RLayout;
    int turn = 0;

    public void win(int turn) {

        Log.e("d0","turn = " + turn);
        if ((i[0] == 1 && i[1] == 1 && i[2] == 1) || (i[3] == 1 && i[4] == 1 && i[5] == 1) || (i[6] == 1 && i[7] == 1 && i[8] == 1) ||
                (i[0] == 1 && i[3] == 1 && i[6] == 1) || (i[1] == 1 && i[4] == 1 && i[7] == 1) || (i[2] == 1 && i[5] == 1 && i[8] == 1) ||
                (i[0] == 1 && i[4] == 1 && i[8] == 1) || (i[2] == 1 && i[4] == 1 && i[6] == 1)) {

            tvtop.setVisibility(View.VISIBLE);
            tvtop.setText("Player 1 won!");
            winFlag = true;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        }
        else if ((i[0] == 2 && i[1] == 2 && i[2] == 2) || (i[3] == 2 && i[4] == 2 && i[5] == 2) || (i[6] == 2 && i[7] == 2 && i[8] == 2) ||
                (i[0] == 2 && i[3] == 2 && i[6] == 2) || (i[1] == 2 && i[4] == 2 && i[7] == 2) || (i[2] == 2 && i[5] == 2 && i[8] == 2) ||
                (i[0] == 2 && i[4] == 2 && i[8] == 2) || (i[2] == 2 && i[4] == 2 && i[6] == 2)) {

            tvtop.setVisibility(View.VISIBLE);
            tvtop.setText("Player 2 won!");
            winFlag = true;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        }
        else if (turn >= 9 && winFlag != true) {
            //tvbottom.setVisibility(View.GONE);
            tvtop.setVisibility(View.VISIBLE);
            tvtop.setText("Match is Draw!");

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtop = findViewById(R.id.flash);
        tvbottom = findViewById(R.id.updates);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        startbtn = findViewById(R.id.startbtn);
        restart = findViewById(R.id.restart);
        RLayout = findViewById(R.id.RLayout);
        RLayout.setVisibility(View.GONE);
        cross1= findViewById(R.id.cross1);
        cross2= findViewById(R.id.cross2);
        cross3= findViewById(R.id.cross3);
        cross4= findViewById(R.id.cross4);
        cross5= findViewById(R.id.cross5);
        cross6= findViewById(R.id.cross6);
        cross7= findViewById(R.id.cross7);
        cross8= findViewById(R.id.cross8);
        cross9= findViewById(R.id.cross9);
        circle1 = findViewById(R.id.circle1);
        circle2 = findViewById(R.id.circle2);
        circle3 = findViewById(R.id.circle3);
        circle4 = findViewById(R.id.circle4);
        circle5 = findViewById(R.id.circle5);
        circle6 = findViewById(R.id.circle6);
        circle7 = findViewById(R.id.circle7);
        circle8 = findViewById(R.id.circle8);
        circle9 = findViewById(R.id.circle9);

        startbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startbtn.setVisibility(View.GONE);
                RLayout.setVisibility(View.VISIBLE);
                tvbottom.setText("Player 1!");
            }
        });

        restart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                i[0]=0;i[1]=0;i[2]=0;i[3]=0;i[4]=0;i[5]=0;i[6]=0;i[7]=0;i[8]=0;
                turn = 0;
                tvtop.setVisibility(View.GONE);
                startbtn.setVisibility(View.GONE);
                RLayout.setVisibility(View.VISIBLE);
                tvbottom.setText("Player 1!");
                circle1.setVisibility(View.GONE);
                cross1.setVisibility(View.GONE);
                circle2.setVisibility(View.GONE);
                cross2.setVisibility(View.GONE);
                circle3.setVisibility(View.GONE);
                cross3.setVisibility(View.GONE);
                circle4.setVisibility(View.GONE);
                cross4.setVisibility(View.GONE);
                circle5.setVisibility(View.GONE);
                cross5.setVisibility(View.GONE);
                circle6.setVisibility(View.GONE);
                cross6.setVisibility(View.GONE);
                circle7.setVisibility(View.GONE);
                cross7.setVisibility(View.GONE);
                circle8.setVisibility(View.GONE);
                cross8.setVisibility(View.GONE);
                circle9.setVisibility(View.GONE);
                cross9.setVisibility(View.GONE);

                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);

            }
        }
        );
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross1.setVisibility(View.VISIBLE);
                    i[0] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle1.setVisibility(View.VISIBLE);
                    tvbottom.setText("Player 1!");
                    i[0] = 2;
                }
                ++turn;
                btn1.setEnabled(false);
                win(turn);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross2.setVisibility(View.VISIBLE);
                    i[1] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle2.setVisibility(View.VISIBLE);
                    i[1] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn2.setEnabled(false);
                win(turn);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross3.setVisibility(View.VISIBLE);
                    i[2] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle3.setVisibility(View.VISIBLE);
                    i[2] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn3.setEnabled(false);
                win(turn);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross4.setVisibility(View.VISIBLE);
                    i[3] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle4.setVisibility(View.VISIBLE);
                    i[3] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn4.setEnabled(false);
                win(turn);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross5.setVisibility(View.VISIBLE);
                    i[4] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle5.setVisibility(View.VISIBLE);
                    i[4] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn5.setEnabled(false);
                win(turn);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross6.setVisibility(View.VISIBLE);
                    i[5] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle6.setVisibility(View.VISIBLE);
                    i[5] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn6.setEnabled(false);
                win(turn);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross7.setVisibility(View.VISIBLE);
                    i[6] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle7.setVisibility(View.VISIBLE);
                    i[6] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn7.setEnabled(false);
                win(turn);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross8.setVisibility(View.VISIBLE);
                    i[7] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle8.setVisibility(View.VISIBLE);
                    i[7] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn8.setEnabled(false);
                win(turn);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn % 2 == 0) {
                    cross9.setVisibility(View.VISIBLE);
                    i[8] = 1;
                    tvbottom.setText("Player 2!");
                } else if (turn % 2 != 0) {
                    circle9.setVisibility(View.VISIBLE);
                    i[8] = 2;
                    tvbottom.setText("Player 1!");
                }
                ++turn;
                btn9.setEnabled(false);
                win(turn);
            }
        });
    }
}
