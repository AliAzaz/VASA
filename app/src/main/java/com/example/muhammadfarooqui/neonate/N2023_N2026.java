package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2023N2026Binding;

import utils.Gothrough;

public class N2023_N2026 extends AppCompatActivity {

    N2023N2026Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2023__n2026);
        bi.setCallback(this);

    }

    public void BtnContinue() {
        if (!validateField()) {
            startActivity(new Intent(this, N2051_N2078.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2023
        if (!Gothrough.IamHiden(bi.llN2023)) {
            return false;
        }

        //ll_N2024
        if (!Gothrough.IamHiden(bi.llN2024)) {
            return false;
        }

        //ll_N2024_1
        if (!Gothrough.IamHiden(bi.llN20241)) {
            return false;
        }

        //ll_N2025u
        if (!Gothrough.IamHiden(bi.llN2025u)) {
            return false;
        }

        //ll_N2025d
        if (!Gothrough.IamHiden(bi.llN2025d)) {
            return false;
        }

        //ll_N2026
        return Gothrough.IamHiden(bi.llN2026);
    }
}
