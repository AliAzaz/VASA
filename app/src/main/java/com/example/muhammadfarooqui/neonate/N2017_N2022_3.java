package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2017N20223Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;

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
                    bi.rgN20223.clearCheck();
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
        if (validateField()) {
            startActivity(new Intent(this, N2051_N2078.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2017
        if (!Gothrough.IamHiden(bi.llN2017)) {
            return false;
        }

        //ll_N2018
        if (!Gothrough.IamHiden(bi.llN2018)) {
            return false;
        }

        if (!bi.rbN20182.isChecked()) {
            //ll_N2019u
            if (!Gothrough.IamHiden(bi.llN2019u)) {
                return false;
            }

            if (bi.rbN2019u1.isChecked()) {
                //ll_N2019h
                if (!Gothrough.IamHiden(bi.llN2019h)) {
                    return false;
                }
            }

            if (bi.rbN2019u2.isChecked()) {
                //ll_N2019d
                if (!Gothrough.IamHiden(bi.llN2019d)) {
                    return false;
                }
            }

        }

        //ll_N2020
        if (!Gothrough.IamHiden(bi.llN2020)) {
            return false;
        }

        //ll_N2021
        if (!Gothrough.IamHiden(bi.llN2021)) {
            return false;
        }

        //ll_N2022
        if (!Gothrough.IamHiden(bi.llN2022)) {
            return false;
        }

        if (bi.rbN20221.isChecked()) {
            //ll_N2022_1
            if (!Gothrough.IamHiden(bi.llN20221)) {
                return false;
            }

            //ll_N2022_2
            if (!Gothrough.IamHiden(bi.llN20222)) {
                return false;
            }
        }

        if (!bi.rbN20221.isChecked() || !bi.rbN202221.isChecked()) {
            //ll_N2022_3
            return Gothrough.IamHiden(bi.llN20223);
        }

        return true;
    }
}
