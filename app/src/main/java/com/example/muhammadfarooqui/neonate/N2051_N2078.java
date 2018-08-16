package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
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

        bi.rgN2052.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20521.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2053N2057); //ll_N2053_N2057
                }
            }
        });

        bi.rgN20691.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN206911.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20692N20693); //ll_N2069_2_N2069_3
                }
            }
        });

        bi.rgN20692.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN206921.getId()) {
                    bi.rgN2063.clearCheck();
                }
            }
        });

        bi.rgN2077.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20771.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2078); //ll_N2078
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2080_N2107.class));
    }
}
