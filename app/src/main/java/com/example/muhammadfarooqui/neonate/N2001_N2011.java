package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2001N2011Binding;

import utils.ClearAllcontrol;

public class N2001_N2011 extends AppCompatActivity {

    N2001N2011Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2001__n2011);
        bi.setCallback(this);

        SetContentUI();
    }

    private void SetContentUI() {

        bi.rgN2001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20011.getId()) {
                    bi.rgN2002.clearCheck();
                }
            }
        });

        bi.rgN2003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN20031.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2004N2005);//ll_N2004_N2005
                }
            }
        });

        bi.rgN2004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20043.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2005uN2005m);//ll_N2005u_N2005m
                }
            }
        });

        bi.rgN2005u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2005uDK.getId() || i == bi.rbN2005uRA.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2005dN2005m);//ll_N2005d_N2005m
                }
            }
        });

        bi.rgN20091.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN200911.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20091N20094);//ll_N2009_1_N2009_4
                }
            }
        });

        bi.rgN20092.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN200921.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20092N20094);//ll_N2009_2_N2009_4
                }
            }
        });

        bi.rgN20093.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN200931.getId()) {
                    bi.rgN20094.clearCheck();
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2012_N2016.class));
    }

}