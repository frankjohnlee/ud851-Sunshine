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
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView weatherDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

// Use findViewById to get a reference to the weather display TextView
        weatherDisplayTextView = (TextView) findViewById(R.id.tv_weather_data);
        // Create an array of Strings that contain fake weather data
        String[] fakeWeatherDataArray = new String[] {"30 degrees", "26 degrees", "24 degrees", "20 degrees", "19 degrees", "18 degrees", "17 degrees", "16 degrees", "15 degrees"};

        // Append each String from the fake weather data array to the TextView
        String collectedString = "";
        for (String s: fakeWeatherDataArray){
            collectedString += s + "\n\n\n";
        }

        weatherDisplayTextView.setText(collectedString);


    }
}