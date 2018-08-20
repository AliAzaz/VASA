package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2192N2202Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;

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
        if (!validateField()) {
            startActivity(new Intent(this, N2271_N2284.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2192
        if (!Gothrough.IamHiden(bi.llN2192)) {
            return false;
        }

        if (bi.rbN21921.isChecked()) {
            //ll_N2193
            if (!Gothrough.IamHiden(bi.llN2193)) {
                return false;
            }

            if (bi.rbN21931.isChecked()) {
                //ll_N2194
                if (!Gothrough.IamHiden(bi.llN2194)) {
                    return false;
                }
                //ll_N2195
                if (!Gothrough.IamHiden(bi.llN2195)) {
                    return false;
                }
                //ll_N2196
                if (!Gothrough.IamHiden(bi.llN2196)) {
                    return false;
                }
                //ll_N2197
                if (!Gothrough.IamHiden(bi.llN2197)) {
                    return false;
                }
                //ll_N2198
                if (!Gothrough.IamHiden(bi.llN2198)) {
                    return false;
                }
                //ll_N2199
                if (!Gothrough.IamHiden(bi.llN2199)) {
                    return false;
                }

            }
        }

        if (bi.rbN21931.isChecked()) {
            //ll_N2200
            if (!Gothrough.IamHiden(bi.llN2200)) {
                return false;
            }
            //ll_N2201
            if (!Gothrough.IamHiden(bi.llN2201)) {
                return false;
            }
            //ll_N2202
            return Gothrough.IamHiden(bi.llN2202);

        }

        return true;
    }
}
