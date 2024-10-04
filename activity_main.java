package com.example.fontcolorchanger;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button changeFontSizeBtn, changeColorBtn;
    float currentFontSize = 18f; // initial font size
    boolean isColorChanged = false; // flag to toggle color

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        changeFontSizeBtn = findViewById(R.id.changeFontSizeBtn);
        changeColorBtn = findViewById(R.id.changeColorBtn);

        // Change Font Size Button
        changeFontSizeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentFontSize += 2f;
                if (currentFontSize > 30f) {
                    currentFontSize = 18f; // reset to initial size
                }
                textView.setTextSize(currentFontSize);
            }
        });

        // Change Text Color Button
        changeColorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isColorChanged) {
                    textView.setTextColor(Color.BLACK); // change to black
                } else {
                    textView.setTextColor(Color.RED); // change to red
                }
                isColorChanged = !isColorChanged; // toggle flag
            }
        });
    }
}
