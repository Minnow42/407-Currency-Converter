package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static java.lang.Float.parseFloat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText myTextField = findViewById(R.id.myEditText);
        String str = myTextField.getText().toString();
        goToActivity2(parseFloat(str));
    }

    public void goToActivity2(float fl) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", fl);
        startActivity(intent);
    }
}
