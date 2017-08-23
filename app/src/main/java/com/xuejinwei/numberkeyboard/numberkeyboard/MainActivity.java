package com.xuejinwei.numberkeyboard.numberkeyboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_rondom, R.id.btn_xianyu})
    void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_rondom:
                startActivity(new Intent(this, RandomActivity.class));
                break;
            case R.id.btn_xianyu:
                startActivity(new Intent(this, XianYuActivity.class));
                break;
        }
    }
}
