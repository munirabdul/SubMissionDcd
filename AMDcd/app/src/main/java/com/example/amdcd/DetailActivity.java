package com.example.amdcd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static String SCREENSHOT = "SCREENSHOT";
    public static String DESCRIPTION = "DESCRIPTION";
    public static String NAMEDETAIL = "NAMEDETAIL";
    Button btnlike;
    Button btnshare;

    ImageView ivScreenshot;
    TextView description;
    TextView tvnamedetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setMun();
    }

    private void setMun() {

        String imgPath = getIntent().getStringExtra(SCREENSHOT);
        String desc = getIntent().getStringExtra(DESCRIPTION);
        String namedetail = getIntent().getStringExtra(NAMEDETAIL);

        ivScreenshot = (ImageView) findViewById(R.id.iv_screenshot);
        description  = (TextView) findViewById(R.id.tv_description);
        tvnamedetail = (TextView) findViewById(R.id.tv_namedetail);
        btnlike = (Button)findViewById(R.id.btn_set_favorite);
        btnshare = (Button)findViewById(R.id.btn_set_share);

        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You have pressed the share button", Toast.LENGTH_SHORT).show();
            }
        });

        btnlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You have pressed the like button", Toast.LENGTH_SHORT).show();
            }
        });

        if (imgPath.isEmpty()) {
            ivScreenshot.setVisibility(View.GONE);
        }else {
            Glide.with(this)
                    .load(imgPath)
                    .into(ivScreenshot);
        }
        description.setText(desc);
        tvnamedetail.setText(namedetail);
    }


}
