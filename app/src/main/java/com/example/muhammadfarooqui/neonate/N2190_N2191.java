package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2190N2191Binding;

import utils.ClearAllcontrol;

public class N2190_N2191 extends AppCompatActivity {

    N2190N2191Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2190__n2191);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2190.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21902.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2190N2191);//ll_N2190_N2191
                }
            }
        });

        bi.rgN21901.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN219011.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN21901N21904);//ll_N2190_1_N2190_4
                }
            }
        });

        bi.rgN21903.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21903OT.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN21903N219020);//ll_N2190_3_N2190_20
                }
            }
        });

        bi.rgN21908.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN219081.getId()) {
                    bi.rgN21909.clearCheck();
                }
            }
        });

        bi.rgN21909.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN219091.getId()) {
                    bi.rgN219010.clearCheck();
                }
            }
        });

        bi.rgN219020.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2190201.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN219021N219022);//ll_N2190_21_N2190_22
                }
            }
        });

        bi.rgN219020.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2190201.getId()) {
                    bi.rgN219022.clearCheck();
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2192_N2202.class));
    }
}
