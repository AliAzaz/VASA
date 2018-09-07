package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2321N2322Binding;

import data.DBHelper;
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
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, N2001_N2011.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean SaveData() {

        Global.N.N2321_N2322 n2321 = new Global.N.N2321_N2322();

        n2321.setN2321(bi.edN2321.getText().toString());
        n2321.setN2322(bi.rbN23221.isChecked() ? "1" : bi.rbN23222.isChecked() ? "2" : bi.rbN23223.isChecked() ? "3"
                : bi.rbN23224.isChecked() ? "4" : bi.rbN23225.isChecked() ? "5" : bi.rbN23226.isChecked() ? "6"
                : bi.rbN2322DK.isChecked() ? "9" : "");


        n2321.setSTUDYID("");
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2321(n2321);

        return row != 0;
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
