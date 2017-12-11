package com.example.white.voiceapi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView voiceInput;
    private TextView speakButton;

    private final int REQ_CODE_SPEECH_INPUT = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        voiceInput = (TextView) findViewById(R.id.voiceInput);//access xml fle
        speakButton = (TextView) findViewById(R.id.btnSpeak);//access xml file
        //on Click listner method for go to other activity..

        speakButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //calling method dialNum
                dialNum();
            }
        });


    }


    // Showing google speech input dialog

    private void dialNum() {



        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);//language select

        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Hi input email body ");//set name google voice regognization.
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);//pass request code for guess

        } catch (ActivityNotFoundException a) {


        }


    }

    //receieving voice input from user.

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    voiceInput.setText(result.get(0));


                }
                break;
            }

        }
    }

}
