package com.dozydroid.intentbundles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etVal1, etVal2;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etVal1 = (EditText) findViewById(R.id.etVal1);
        etVal2 = (EditText) findViewById(R.id.etVal2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etVal1.getText())){
                    etVal1.setError("Required");
                    etVal1.requestFocus();
                }else if (TextUtils.isEmpty(etVal2.getText())){
                    etVal2.setError("Required");
                    etVal2.requestFocus();
                } else {
                    int num1, num2, sum;
                    num1 = Integer.parseInt(etVal1.getText().toString());
                    num2 = Integer.parseInt(etVal2.getText().toString());
                    sum = num1 + num2;
                    etVal1.setText("");
                    etVal2.setText("");
                    Intent i = new Intent(MainActivity.this, ResultActivity.class);
                    i.putExtra("sum",sum);
                    startActivity(i);
                }

            }
        });
    }
}
