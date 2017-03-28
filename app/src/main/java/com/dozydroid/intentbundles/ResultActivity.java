package com.dozydroid.intentbundles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = (TextView) findViewById(R.id.tvResult);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            int sum = bundle.getInt("sum");
            tvResult.setText("Sum is: "+ sum);
        }
    }
}
