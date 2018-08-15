package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadfarooqui.neonate.databinding.N2110N2189aBinding;

public class N2110_N2189a extends AppCompatActivity {

    N2110N2189aBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2110__n2189a);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2190_N2191.class));
    }
}
