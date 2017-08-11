package com.againstsky.pictureverification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.againstsky.pictureverification.view.VerificationCodeView;


public class MainActivity extends AppCompatActivity {

    EditText codeEt;
    Button mButton;
    VerificationCodeView mVerificationCodeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVerificationCodeView= (VerificationCodeView) findViewById(R.id.verification_code);
        mButton= (Button) findViewById(R.id.button);
        codeEt= (EditText) findViewById(R.id.code_et);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MainActivity:",mVerificationCodeView.getVerificationCode());
                if(mVerificationCodeView.getVerificationCode().equals(codeEt.getText().toString().trim())){
                    Toast.makeText(MainActivity.this,"验证成功",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"验证失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
