package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2211N2248CBinding;

public class N2211_N2248_C extends AppCompatActivity {

    N2211N2248CBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_c);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2251_N2260.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {


        return true;
    }
}
