package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2192N2202Binding;

import utils.ClearAllcontrol;

public class N2192_N2202 extends AppCompatActivity {

    N2192N2202Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2192__n2202);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2192.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21921.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2192N2198);//ll_N2192_N2198
                }
            }
        });

        bi.rgN2193.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21931.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2194N21101);//ll_N2194_N2110_1
                    ClearAllcontrol.ClearAll(bi.llN2194N21102);//ll_N2194_N2110_2
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2211_N2248.class));
    }
}
