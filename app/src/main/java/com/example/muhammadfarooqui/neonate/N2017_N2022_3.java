package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2017N20223Binding;

import utils.ClearAllcontrol;

public class N2017_N2022_3 extends AppCompatActivity {

    N2017N20223Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2017__n2022_3);
        bi.setCallback(this);

        SetContentUI();
    }

    private void SetContentUI() {

        bi.rgN2018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN20182.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2019uN2019d);//ll_N2019u_N2019d
                }
            }
        });

        bi.rgN2022.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20221.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20221N2051);//ll_N2022_1_N2051
                }
            }
        });

        bi.rgN20222.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN202221.getId()) {
                    bi.rgN20223.clearCheck();
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, bi.rbN20221.isChecked() || !bi.rbN202221.isChecked() ? N2023_N2026.class : N2051_N2078.class));
    }
}
