package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadfarooqui.neonate.databinding.N2023N2026Binding;

public class N2023_N2026 extends AppCompatActivity {

    N2023N2026Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2023__n2026);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2051_N2078.class));
    }
}
