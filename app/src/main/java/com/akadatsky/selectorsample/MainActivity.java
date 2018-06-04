package com.akadatsky.selectorsample;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textMale = findViewById(R.id.textMale);
        final  ImageView checkSignMale =findViewById(R.id.checkSignMale);
        final TextView textFemale = findViewById(R.id.textFamale);
        final  ImageView checkSignFemale =findViewById(R.id.checkSignFemale);


        View maleLayout = findViewById(R.id.maleLayout);
        maleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textMale.setTypeface(textMale.getTypeface(), Typeface.BOLD);
                textFemale.setTypeface(Typeface.create(textFemale.getTypeface(), Typeface.NORMAL), Typeface.NORMAL);
                checkSignMale.setVisibility(View.VISIBLE);
                checkSignFemale.setVisibility(View.INVISIBLE);

            }
        });


        View femaleLayout = findViewById(R.id.femaleLayout);
        femaleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textMale.setTypeface(Typeface.create(textMale.getTypeface(), Typeface.NORMAL), Typeface.NORMAL);
                textFemale.setTypeface(textFemale.getTypeface(), Typeface.BOLD);
                checkSignMale.setVisibility(View.INVISIBLE);
                checkSignFemale.setVisibility(View.VISIBLE);

            }
        });

    }
}
