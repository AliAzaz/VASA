package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadfarooqui.neonate.databinding.N2211N2248Binding;

public class N2211_N2248 extends AppCompatActivity {

    N2211N2248Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2251_N2260.class));
    }
}
