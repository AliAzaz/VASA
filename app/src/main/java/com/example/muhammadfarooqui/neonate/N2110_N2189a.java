package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2110N2189aBinding;

import utils.ClearAllcontrol;

public class N2110_N2189a extends AppCompatActivity {

    N2110N2189aBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2110__n2189a);
        bi.setCallback(this);

        SetContentUI();

    }

    private void SetContentUI() {

        bi.rgN2112.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21121.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2113); //ll_N2113
                }
            }
        });

        bi.rgN2115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21151.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN21161N21163); //ll_N2116_1_N2116_3
                }
            }
        });

        bi.rgN21162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN211621.getId()) {
                    bi.rgN21163.clearCheck();
                }
            }
        });

        bi.rgN2118.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21182.getId()) {
                    bi.rgN2119.clearCheck();
                }
            }
        });

        bi.edN2122.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (bi.edN2122.getText().equals("98")) {
                    bi.llN2124N2125.setVisibility(View.GONE); //ll_N2124_N2125
                    ClearAllcontrol.ClearAll(bi.llN2124N2125); //ll_N2124_N2125
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        bi.rgN2126.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21261.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2127N2130); //ll_N2127_N2130
                }
            }
        });

        bi.rgN2132.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21321.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2133N2134); //ll_N2133_N2134
                }
            }
        });

        bi.rgN2136.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21361.getId()) {
                    bi.rgN2137.clearCheck();
                }
            }
        });

        bi.rgN2137.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21371.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2138N2140); //ll_N2138_N2140
                }
            }
        });

        bi.rgN2138.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21381.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2139N2140); //ll_N2139_N2140
                }
            }
        });

        bi.rgN2141.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21411.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2142N2143); //ll_N2142_N2143
                }
            }
        });

        bi.rgN2142.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21421.getId()) {
                    bi.rgN2143.clearCheck();
                }
            }
        });

        bi.rgN2145.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21451.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2146N2148); //ll_N2146_N2148
                }
            }
        });

        bi.rgN2146.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21461.getId()) {
                    bi.rgN2147.clearCheck();
                }
            }
        });

        bi.rgN2151.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21511.getId()) {
                    bi.rgN2152.clearCheck();
                }
            }
        });

        bi.rgN2155.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21551.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2156N2158); //ll_N2156_N2158
                }
            }
        });

        bi.rgN2162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21621.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2163N2164); //ll_N2163_N2164
                }
            }
        });

    }

    public void BtnContinue() {
        startActivity(new Intent(this, N2190_N2191.class));
    }
}
