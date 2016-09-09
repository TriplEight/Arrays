package com.example.android.arrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int[] myArray = new int[5];
//        myArray[0] = 10;
//        myArray[1] = 20;
//        myArray[2] = 30;
//        myArray[3] = 40;
//        myArray[4] = 50;
        //other type of declaration:
        int[] myArray = {10, 20, 30, 40, 50};
//        Log.v("LogExample", String.valueOf(myArray[0]));
        //Logging all elements of the array using loop
        //Doesn't work
        for (int i = 0; i  < myArray.length; i++) {
            Log.v("LogExample2", String.valueOf(myArray[i]));
        }
        //Works
        for (int i : myArray) {
            Log.v("LogExample3", String.valueOf(i));
        }
        //Simpliest method to log using Arrays util
        Log.v("LogExample4", Arrays.toString(myArray));
    }
}
