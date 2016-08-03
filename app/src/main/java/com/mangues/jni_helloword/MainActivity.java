package com.mangues.jni_helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text);

        NdkJniUtils jni = new NdkJniUtils();

//        mTextView.setText(jni.getCLanguageString());
        //传入name="vip"到jni代码模拟拿到加密后的key
       mTextView.setText(jni.generateKey("vip"));


    }
}
