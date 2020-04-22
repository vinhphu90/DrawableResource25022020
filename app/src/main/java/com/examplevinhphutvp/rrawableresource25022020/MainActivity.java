package com.examplevinhphutvp.rrawableresource25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    CheckBox mCbAndroid ;
       RadioGroup radioGroup ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mCbAndroid = findViewById(R.id.CheckboxAndroid);
//        mCbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked){
//                    Toast.makeText(MainActivity.this ,  "đã check", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this,"bỏ check",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
       radioGroup = findViewById(R.id.RadioGroup) ;
       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId){
                   case R.id .RadioAndroid:
                       Toast.makeText(MainActivity.this,"Android", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.Radioios:
                       Toast.makeText(MainActivity.this,"ios",Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.Radiophp:
                       Toast.makeText(MainActivity.this,"php",Toast.LENGTH_SHORT).show();
                       break;
               }
           }
       });



    }
}
