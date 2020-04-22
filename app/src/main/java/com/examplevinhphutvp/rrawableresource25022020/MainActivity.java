package com.examplevinhphutvp.rrawableresource25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox mCbAndroid ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCbAndroid = findViewById(R.id.CheckboxAndroid);
        mCbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this ,  "đã check", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"bỏ check",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
