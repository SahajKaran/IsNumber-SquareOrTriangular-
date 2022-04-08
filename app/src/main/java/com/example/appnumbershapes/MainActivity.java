package com.example.appnumbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            class Number{
                int number;
                public boolean isSquare(){
                    double squareRoot=Math.sqrt(number);
                    if(squareRoot==Math.floor(squareRoot)) {
                        return true;
                    }else{
                        return false;
                    }
                }
                public boolean isTriangular(){
                    int x = 1;
                    int triangularNumber=1;
                    while(triangularNumber < number){
                        x++;
                        triangularNumber=triangularNumber+x;

                    }
                    if(triangularNumber==number){
                        return true;
                    }else{
                        return false;
                    }

                }
            }

            public void testNumber(View view){
                String message;
                EditText userNum=(EditText) findViewById(R.id.userNum);
                if(userNum.getText().toString().isEmpty()){
                    message="Please Enter a number";

                }else {

                    Number myNumber = new Number();
                    myNumber.number = Integer.parseInt(userNum.getText().toString());

                    if (myNumber.isTriangular() && myNumber.isTriangular()) {
                        message = "is a square and triangular";
                    } else if (myNumber.isSquare()) {
                        message = "Number is Square";
                    } else if (myNumber.isTriangular()) {
                        message = "Number is Triangular";
                    } else {
                        message = "Neither Triangular nor Square";
                    }
                }
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}