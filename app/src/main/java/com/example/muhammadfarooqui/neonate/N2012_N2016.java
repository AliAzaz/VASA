package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2012N2016Binding;

import data.DBHelper;
import utils.Gothrough;

public class N2012_N2016 extends AppCompatActivity {

    N2012N2016Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2012__n2016);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, bi.rbN20161.isChecked() ? N2017_N2022_3.class : N2023_N2026.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean SaveData() {

        Global.N.N2012_N2016 n2012 = new Global.N.N2012_N2016();

        n2012.setN2012(bi.rbN20121.isChecked() ? "1" : bi.rbN20122.isChecked() ? "2" : bi.rbN2012DK.isChecked() ? "9"
                : bi.rbN2012RA.isChecked() ? "8" : "");
        n2012.setN2013(bi.rbN20131.isChecked() ? "1" : bi.rbN20132.isChecked() ? "2" : bi.rbN2013DK.isChecked() ? "9"
                : bi.rbN2013RA.isChecked() ? "8" : "");
        n2012.setN2014(bi.rbN20141.isChecked() ? "1" : bi.rbN20142.isChecked() ? "2" : bi.rbN2014DK.isChecked() ? "9"
                : bi.rbN2014RA.isChecked() ? "8" : "");
        n2012.setN2015(bi.rbN20151.isChecked() ? "1" : bi.rbN20152.isChecked() ? "2" : bi.rbN2015DK.isChecked() ? "9"
                : bi.rbN2015RA.isChecked() ? "8" : "");
        n2012.setN2016(bi.rbN20161.isChecked() ? "1" : bi.rbN20162.isChecked() ? "2" : "");

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2012(n2012);

        return row > 0;
    }

    public Boolean validateField() {

        //ll_N2012
        if (!Gothrough.IamHiden(bi.llN2012)) {
            return false;
        }

        //ll_N2013
        if (!Gothrough.IamHiden(bi.llN2013)) {
            return false;
        }

        //ll_N2014
        if (!Gothrough.IamHiden(bi.llN2014)) {
            return false;
        }

        //ll_N2015
        if (!Gothrough.IamHiden(bi.llN2015)) {
            return false;
        }

        //ll_N2016
        return Gothrough.IamHiden(bi.llN2016);
    }

}
