package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2271N2284Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2271_N2284 extends AppCompatActivity {

    N2271N2284Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2271__n2284);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2271.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22711.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2272N2283);
                }
            }
        });

        bi.rgN2272.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22722.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2273N2283);
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2291_N2304.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2271
        if (!Gothrough.IamHiden(bi.llN2271)) {
            return false;
        }

        if (bi.rbN22711.isChecked()) {
            //ll_N2272
            if (!Gothrough.IamHiden(bi.llN2272)) {
                return false;
            }

            if (bi.rbN22721.isChecked()) {
                //ll_N2273
                if (!Gothrough.IamHiden(bi.llN2273)) {
                    return false;
                }
                //ll_N2274
                if (!Gothrough.IamHiden(bi.llN2274)) {
                    return false;
                }
                //ll_N2275
                if (!Gothrough.IamHiden(bi.llN2275)) {
                    return false;
                }
                //ll_N2276
                if (!Gothrough.IamHiden(bi.llN2276)) {
                    return false;
                }
                //ll_N2277
                if (!Gothrough.IamHiden(bi.llN2277)) {
                    return false;
                }
                //ll_N2278
                if (!Gothrough.IamHiden(bi.llN2278)) {
                    return false;
                }
            }
        }

        //ll_N2283
        if (!Gothrough.IamHiden(bi.llN2283)) {
            return false;
        }

        if (bi.rbN22831.isChecked()) {
            //ll_N2284
            return Gothrough.IamHiden(bi.llN2284);
        }

        return true;
    }

}
