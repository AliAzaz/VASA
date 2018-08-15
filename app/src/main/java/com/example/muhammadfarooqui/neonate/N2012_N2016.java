package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadfarooqui.neonate.databinding.N2012N2016Binding;

public class N2012_N2016 extends AppCompatActivity {

    N2012N2016Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2012__n2016);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2017_N2022_3.class));
    }

}
