package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2211N2248BBinding;

import data.DBHelper;
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

    public boolean SaveData() {

        Global.N.N2211_N2248_B n2211B = new Global.N.N2211_N2248_B();

        n2211B.setN2213(bi.rbN2213A1.isChecked() ? "1" : bi.rbN2213A2.isChecked() ? "2" : bi.rbN2213A3.isChecked() ? "3" : bi.rbN2213A4.isChecked() ? "4"
                : bi.rbN2213A5.isChecked() ? "5" : bi.rbN2213A6.isChecked() ? "6" : bi.rbN2213A7.isChecked() ? "7" : "");
        n2211B.setN22132a(bi.cbN22133E2A.isChecked() ? "1" : "");
        n2211B.setN22134(bi.edN22134.getText().toString());

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2211_B(n2211B);

        return row != 0;
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
