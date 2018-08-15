package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadfarooqui.neonate.databinding.N2017N20223Binding;

public class N2017_N2022_3 extends AppCompatActivity {

    N2017N20223Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2017__n2022_3);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2023_N2026.class));
    }
}
