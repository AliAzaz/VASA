package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2271N2284Binding;

import data.DBHelper;
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
            if (SaveData()) {
                startActivity(new Intent(this, N2291_N2304.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2271_N2284 n2271 = new Global.N.N2271_N2284();

        n2271.setN2271(bi.rbN22711.isChecked() ? "1" : bi.rbN22712.isChecked() ? "2" : bi.rbN2271DK.isChecked() ? "9"
                : bi.rbN2271RA.isChecked() ? "8" : "");
        n2271.setN2272(bi.rbN22721.isChecked() ? "1" : bi.rbN22722.isChecked() ? "2" : "");
        n2271.setN2273(bi.edN2273.getText().toString());
        n2271.setN2274(bi.edN2274.getText().toString());
        n2271.setN2275(bi.edN2275.getText().toString());
        n2271.setN2276(bi.edN2276.getText().toString());
        n2271.setN2277(bi.edN2277.getText().toString());
        n2271.setN2278(bi.edN2278.getText().toString());
        n2271.setN2283(bi.rbN22831.isChecked() ? "1" : bi.rbN22832.isChecked() ? "2" : bi.rbN22833.isChecked() ? "3"
                : bi.rbN2283DK.isChecked() ? "9" : bi.rbN2283RA.isChecked() ? "8" : "");
        n2271.setN2284(bi.edN2284.getText().toString());

        n2271.setSTUDYID("");
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2271(n2271);

        return row != 0;
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
