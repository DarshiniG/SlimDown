package com.example.user.slimdown;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculatorCalorie extends Fragment {
    EditText ent_weight, ent_height, ent_age;  //declaring
    Button button_calculate_bmr;
    TextView text_result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View v = inflater.inflate(R.layout.calorie_calculator, container, false);

        ent_weight = (EditText) v.findViewById(R.id.ent_weight);
        ent_height = (EditText) v.findViewById(R.id.ent_height);
        ent_age = (EditText) v.findViewById(R.id.ent_age);
        button_calculate_bmr = (Button) v.findViewById(R.id.button_calculate_bmr);
        text_result = (TextView) v.findViewById(R.id.text_result);

        button_calculate_bmr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //checking
                if(Formula.isEmpty(ent_weight)){
                    ent_weight.setError("Please enter your weight");

                }
                if(Formula.isEmpty(ent_height)){
                    ent_height.setError("Please enter your height");

                }
                if(Formula.isEmpty(ent_age)){
                    ent_age.setError("Please enter your age");

                }

                String result = Formula.calculateBMR(ent_weight, ent_height, ent_age);   //send to Formula class
                text_result.setText(result);
            }
        });
        if (container==null){
            return null;
        }

        return v;

    }
}
