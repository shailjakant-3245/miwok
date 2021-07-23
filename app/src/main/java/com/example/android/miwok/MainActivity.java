/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setTitle(R.string.app_name);
        setContentView(R.layout.activity_main);


        //FInd a view that shows numbers Category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a clickListener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new intent to open the {@Link NumberActivity}
                Intent numbersIntent =  new Intent(MainActivity.this,NumbersActivity.class);

                //Start a new Activity
                startActivity(numbersIntent);
            }
        });
    }


    /**
     * This method is called when Numbers Text List is called
     * @param view
     */
    public void openNumbersList(View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }


    /**
     * This method is called when Family Members Text List is called
     * @param view
     */
    public void openFamilyList(View view){
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }


    /**
     *This method is called when Colors Text List is called
     * @param view
     */
    public void openColorsList(View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }


    /**
     * This method is called when Phrases Text List is called
     * @param view
     */
    public void openPhrasesList(View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

}



