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

    public void clickMe_Click(View target) {
        TextView displayText =new TextView(this);
        EditText editText = (EditText) findViewById(R.id.txtInputBox);
        String inputString = editText.getText().toString();
        displayText = (TextView)findViewById(R.id.helloText);
        displayText.setText(inputString);
    }
}
