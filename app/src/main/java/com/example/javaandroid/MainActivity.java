package com.example.javaandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private ScrollView tampilanScroll;
    private TextView teks;
    private Button tombol;
    private boolean isImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logouskhitamputih);
        tampilanScroll = findViewById(R.id.scrollView2);
        teks = findViewById(R.id.textView);

        tombol = findViewById(R.id.button);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isImage) {
                    logo.setImageResource(R.drawable.logouskhitamputih);
                    isImage = false;
                } else {
                    logo.setImageResource(R.drawable.logoUSK);
                    isImage = true;
                }
            }
        });
    }
}
