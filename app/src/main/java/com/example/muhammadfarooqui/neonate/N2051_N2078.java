package com.example.muhammadfarooqui.neonate;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2051N2078Binding;

import utils.ClearAllcontrol;

public class N2051_N2078 extends AppCompatActivity {

    N2051N2078Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2051__n2078);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2271.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22711.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2272N2278);
                }
            }
        });

        bi.rgN2272.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22722.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2272N2278);
                }
            }
        });

    }

    public void BtnContinue() {

    }
}
