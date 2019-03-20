package com.example.myapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View view) {
        EditText name=(EditText)findViewById(R.id.username);
        Button button=(Button)findViewById(R.id.buttonClick);
        Toast.makeText(MainActivity.this,"Hello "+name.getText().toString() ,
                Toast.LENGTH_LONG).show();

    }
}
