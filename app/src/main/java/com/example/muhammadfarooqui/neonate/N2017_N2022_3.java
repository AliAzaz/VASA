package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2017N20223Binding;

import data.DBHelper;
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
            if (SaveData()) {
                startActivity(new Intent(this, N2051_N2078.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2017_N2022_3 n2017 = new Global.N.N2017_N2022_3();

        n2017.setN2017(bi.rbN20171.isChecked() ? "1" : bi.rbN20172.isChecked() ? "2" : bi.rbN2017DK.isChecked() ? "9"
                : bi.rbN2017RA.isChecked() ? "8" : "");
        n2017.setN2018(bi.rbN20181.isChecked() ? "1" : bi.rbN20182.isChecked() ? "2" : bi.rbN2018DK.isChecked() ? "9"
                : bi.rbN2018RA.isChecked() ? "8" : "");
        n2017.setN2019u(bi.rbN2019u1.isChecked() ? "1" : bi.rbN2019u2.isChecked() ? "2" : bi.rbN2019uDK.isChecked() ? "9"
                : bi.rbN2019uRA.isChecked() ? "8" : "");
        n2017.setN2019h(bi.edN2019h.getText().toString());
        n2017.setN2019d(bi.edN2019d.getText().toString());
        n2017.setN2020(bi.rbN20201.isChecked() ? "1" : bi.rbN20202.isChecked() ? "2" : bi.rbN2020DK.isChecked() ? "9"
                : bi.rbN2020RA.isChecked() ? "8" : "");
        n2017.setN2021(bi.rbN20211.isChecked() ? "1" : bi.rbN20212.isChecked() ? "2" : bi.rbN2021DK.isChecked() ? "9"
                : bi.rbN2021RA.isChecked() ? "8" : "");
        n2017.setN2022(bi.rbN20221.isChecked() ? "1" : bi.rbN20222.isChecked() ? "2" : bi.rbN2022DK.isChecked() ? "9"
                : bi.rbN2022RA.isChecked() ? "8" : "");
        n2017.setN20221(bi.rbN202211.isChecked() ? "1" : bi.rbN202212.isChecked() ? "2" : bi.rbN20221DK.isChecked() ? "9"
                : bi.rbN20221RA.isChecked() ? "8" : "");
        n2017.setN20222(bi.rbN202221.isChecked() ? "1" : bi.rbN202222.isChecked() ? "2" : bi.rbN20222DK.isChecked() ? "9"
                : bi.rbN20222RA.isChecked() ? "8" : "");
        n2017.setN20223(bi.rbN202231.isChecked() ? "1" : bi.rbN202232.isChecked() ? "2" : bi.rbN20223DK.isChecked() ? "9"
                : bi.rbN20223RA.isChecked() ? "8" : "");

        n2017.setSTUDYID("");
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2017(n2017);

        return row != 0;
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

        if (bi.rbN20221.isChecked() && !bi.rbN202221.isChecked()) {
            //ll_N2022_3
            return Gothrough.IamHiden(bi.llN20223);
        }

        return true;
    }
}
