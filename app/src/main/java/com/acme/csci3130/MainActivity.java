package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ///Button event - Triggers on click of clickMe
    public void clickMe_Click(View target) {
        EditText editText = (EditText) findViewById(R.id.txtInputBox);
        String inputString = editText.getText().toString();
        TextView displayText = (TextView)findViewById(R.id.helloText);
        //overrides the text dynamically based on the user input
        displayText.setText(inputString);
    }
}
