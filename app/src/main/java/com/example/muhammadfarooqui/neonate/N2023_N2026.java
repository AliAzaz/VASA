package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2023N2026Binding;

import data.DBHelper;
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

        Global.N.N2023_N2026 n2023 = new Global.N.N2023_N2026();

        n2023.setN2023(bi.edN2023.getText().toString());
        n2023.setN2024(bi.edN2024.getText().toString());
        n2023.setN20241(bi.rbN202411.isChecked() ? "1" : bi.rbN202412.isChecked() ? "2" : bi.rbN20241DK.isChecked() ? "9"
                : bi.rbN20241RA.isChecked() ? "8" : "");
        n2023.setN2025U(bi.rbN2025u1.isChecked() ? "1" : bi.rbN2025uDK.isChecked() ? "9" : bi.rbN2025uRA.isChecked() ? "8" : "");
        n2023.setN2025D(bi.edN2025d.getText().toString());
        n2023.setN2026(bi.rbN20261.isChecked() ? "1" : bi.rbN20262.isChecked() ? "2" : bi.rbN2026DK.isChecked() ? "9"
                : bi.rbN2026RA.isChecked() ? "8" : "");

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2023(n2023);

        return row != 0;
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

        if (bi.rbN2025u1.isChecked()) {
            //ll_N2025d
            if (!Gothrough.IamHiden(bi.llN2025d)) {
                return false;
            }
        }

        //ll_N2026
        return Gothrough.IamHiden(bi.llN2026);
    }
}
