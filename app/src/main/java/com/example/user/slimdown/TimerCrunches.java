package com.example.user.slimdown;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class TimerCrunches extends Fragment {
    Button button;
    TextView textView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View v = inflater.inflate(R.layout.crunches_timer, container, false);

        button = (Button) v.findViewById(R.id.button);
        textView = (TextView) v.findViewById(R.id.text_timer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                // formula to countdown timer for crunches
                //time set for 60 seconds
                CountDownTimer countDownTimer = new CountDownTimer(60 * 1000, 1000) {
                    @Override
                    public void onTick(long millis) {
                        textView.setText("Timer:" + (int) (millis / 1000) + "seconds");
                    }

                    @Override
                    public void onFinish() {
                        textView.setText("Well Done! You Burned 6 Calories."); //60 second of crunches will burn 6 calories
                    }
                }.start();

            }

        });
        if (container==null){
            return null;
        }

        return v;

    }
}
