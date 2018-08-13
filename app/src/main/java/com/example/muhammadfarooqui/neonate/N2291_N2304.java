package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2291N2304Binding;

import utils.ClearAllcontrol;

public class N2291_N2304 extends AppCompatActivity {

    N2291N2304Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2291__n2304);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2292.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22921.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2293N2294);
                }
            }
        });

        bi.rgN2295.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22953.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2296N2299);
                }
            }
        });

        bi.rgN2300.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2300DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2301N2314);
                } else if (i == bi.rbN23001.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2301N2302);
                }
            }
        });

        bi.rgN2301.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2301DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2301N2304);
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2311_N2317.class).putExtra("valFlag", bi.rbN2300DK.isChecked()));
    }
}
