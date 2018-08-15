package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadfarooqui.neonate.databinding.N2001N2011Binding;

public class N2001_N2011 extends AppCompatActivity {

    N2001N2011Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2001__n2011);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2012_N2016.class));
    }

}