package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2211N2248ABinding;

import utils.Gothrough;

public class N2211_N2248_A extends AppCompatActivity {

    N2211N2248ABinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_a);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, bi.rbN22121.isChecked() ? N2211_N2248_B.class : N2211_N2248_C.class)
                    .putExtra("valFlag", bi.rbN22122.isChecked()));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2211_1
        if (!Gothrough.IamHiden(bi.llN22111)) {
            return false;
        }

        //ll_N2211_2
        if (!Gothrough.IamHiden(bi.llN22112)) {
            return false;
        }

        //ll_N2212
        return Gothrough.IamHiden(bi.llN2212);
    }
}
