package com.example.user.slimdown;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.example.user.slimdown.R.id.button;


public class CalorieFood extends Fragment {
    ImageButton imageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View v = inflater.inflate(R.layout.food_calorie, container, false);

        //creating toast for each button image
        imageButton = (ImageButton) v.findViewById(R.id.imageButton1);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0)
            {  Toast toast=  Toast.makeText(CalorieFood.this.getActivity(), "17 Calories!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT| Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();

            }
        });
        imageButton = (ImageButton) v.findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg1)
            {  Toast toast=  Toast.makeText(CalorieFood.this.getActivity(), "100 Calories!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT| Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();

            }
        });
        imageButton = (ImageButton) v.findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg2)
            {  Toast toast=  Toast.makeText(CalorieFood.this.getActivity(), "3 Calories!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT| Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();

            }
        });
        imageButton = (ImageButton) v.findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg3)
            {  Toast toast=  Toast.makeText(CalorieFood.this.getActivity(), "59 Calories!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT| Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();

            }
        });
        imageButton = (ImageButton) v.findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg4)
            {  Toast toast=  Toast.makeText(CalorieFood.this.getActivity(), "50 Calories!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT| Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();

            }
        });


        if (container==null){
            return null;
        }

        return v;

    }
}
