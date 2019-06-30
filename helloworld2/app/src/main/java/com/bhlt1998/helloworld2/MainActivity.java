package com.bhlt1998.helloworld2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.textView);

        CheckBox cbx1 = findViewById(R.id.cbx1);
        boolean isChecked = false;

        ImageButton imb1 = findViewById(R.id.imb1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(R.string.testview_str);
                Log.d(TAG, "click btn1");
            }
        });

        cbx1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv1.setText(R.string.check_str);
                    Log.d(TAG, "cbx1 check");
                }
                else{
                    tv1.setText(R.string.hello_str);
                    Log.d(TAG, "cbx1 uncheck");
                }
            }
        });

        imb1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(R.string.robot_str);
                Log.d(TAG, "click imb1");
            }
        });
    }
}
