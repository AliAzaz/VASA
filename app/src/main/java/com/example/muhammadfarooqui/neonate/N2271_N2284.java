package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2271N2284Binding;

import utils.ClearAllcontrol;

public class N2271_N2284 extends AppCompatActivity {

    N2271N2284Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2271__n2284);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2271.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22711.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2272N2283);
                }
            }
        });

        bi.rgN2272.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22722.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2273N2283);
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2291_N2304.class));
    }
}
