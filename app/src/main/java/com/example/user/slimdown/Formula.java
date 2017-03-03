package com.example.user.slimdown;

import android.widget.EditText;

//this class is for bmr calculation

public class Formula {
    //input validation for empty field

    static boolean isEmpty(EditText field) {
        if (field.getText().length()==0){
            return true;
        }
        else {
            return false;
        }
    }

    static String calculateBMR(EditText ent_weight, EditText ent_height, EditText ent_age){
        String result= "Result: ";

        //calculate BMR
        double bmr3;
        double bmr4;

        double weight = Double.parseDouble(ent_weight.getText().toString());
        double height = Double.parseDouble(ent_height.getText().toString());
        double age = Double.parseDouble(ent_age.getText().toString());

        bmr3 = Math.round((10*weight) + (6.25* height) - (5* age)-161);       //formula to count bmr for ladies
        bmr4 = Math.round(((10*weight) + (6.25* height) - (5* age)-161)-500);  //formula to count bmr for ladies to reduce half kg per week
        result += "\n" + "To maintain body weight, you need" + " " + bmr3 + " " + "calories per day."+"\n\n"+
                "To reduce 1/2kg per week, you need"+ " " + bmr4+ " "+ " calories per day.";




        return result;
    }
}
