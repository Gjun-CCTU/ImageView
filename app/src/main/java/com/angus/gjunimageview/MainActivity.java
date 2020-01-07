package com.angus.gjunimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.imageView);
        sw = (Switch) findViewById(R.id.switch1);
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean state = ((Switch)view).isChecked();
//                Resources resources = getResources();
                if (state){
                    iv.setImageResource(R.drawable.c2);
                    iv.setScaleType(ImageView.ScaleType.FIT_XY);
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.j1), Toast.LENGTH_SHORT).show();
                }else{
                    iv.setImageResource(R.drawable.c1);
                    iv.setScaleType(ImageView.ScaleType.FIT_XY);
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.j2), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
