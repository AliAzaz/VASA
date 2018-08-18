package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2012N2016Binding;

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
            startActivity(new Intent(this, N2017_N2022_3.class)
                    .putExtra("checkFlag", bi.rbN20161.isChecked()));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
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
