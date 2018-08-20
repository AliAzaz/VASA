package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2321N2322Binding;

import utils.Gothrough;

public class N2321_N2322 extends AppCompatActivity {

    N2321N2322Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2321__n2322);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

    }

    public void BtnContinue() {
        if (!validateField()) {
            startActivity(new Intent(this, N2001_N2011.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }


    public Boolean validateField() {

        //ll_N2321
        if (!Gothrough.IamHiden(bi.llN2321)) {
            return false;
        }

        //ll_N2322
        return Gothrough.IamHiden(bi.llN2322);
    }
}
