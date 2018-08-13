package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.muhammadfarooqui.neonate.databinding.N2311N2317Binding;

import utils.ClearAllcontrol;

public class N2311_N2317 extends AppCompatActivity {

    N2311N2317Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2311__n2317);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        // Validation Flag
        boolean valFlag = getIntent().getBooleanExtra("valFlag", true);

        if (valFlag) {
            ClearAllcontrol.ClearAll(bi.llN2311N2313);
            bi.llN2311N2313.setVisibility(View.GONE);
        }

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2321_N2322.class));
    }
}
