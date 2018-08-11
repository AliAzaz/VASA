package com.example.muhammadfarooqui.neonate;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2251N2260Binding;

import utils.ClearAllcontrol;

public class N2251_N2260 extends AppCompatActivity {


    N2251N2260Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2251__n2260);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2253.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22531.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2254N2258);
                }
            }
        });

        bi.rgN2254.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22542.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2255N2258);
                }
            }
        });

    }

    public void BtnContinue() {

    }
}
