package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2211N2248BBinding;

import utils.Gothrough;

public class N2211_N2248_B extends AppCompatActivity {

    N2211N2248BBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_b);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2211_N2248_C.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public void BtnAddMore() {
        if (validateField()) {
            finish();
            startActivity(new Intent(this, N2211_N2248_B.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_ll_N2213
        if (!Gothrough.IamHiden(bi.llN2213)) {
            return false;
        }

        //ll_ll_N2213_4
        return Gothrough.IamHiden(bi.llN22134);
    }
}
