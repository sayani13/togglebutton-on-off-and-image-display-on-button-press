package com.example.student.question2;

import android.media.Image;
import android.media.tv.TvContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Random rand = new Random();
        final Button button = (Button) findViewById(R.id.btn1);

        final int[] images = new int[] {R.drawable.car,R.drawable.cat1,R.drawable.dog1,R.drawable.sunglasses};



        final ImageView img = (ImageView) findViewById(R.id.img1);
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggle);


            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(flag == 1)
                        img.setImageResource(images[rand.nextInt(4)]);
                    else if(flag == 0)
                        Toast.makeText(getApplicationContext(),"Please turn toggle on",Toast.LENGTH_SHORT);
                }
            });



        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    flag = 1;
                } else {
                    flag = 0;
                    img.setImageResource(0);
                }
            }
        });
    }
}
