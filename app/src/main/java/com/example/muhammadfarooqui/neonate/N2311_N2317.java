package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2311N2317Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2311_N2317 extends AppCompatActivity {

    N2311N2317Binding bi;
    boolean valFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2311__n2317);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        // Validation Flag
        valFlag = getIntent().getBooleanExtra("valFlag", false);

        if (valFlag) {
            ClearAllcontrol.ClearAll(bi.llN2311N2313); //ll_N2311_N2313
            bi.llN2311N2313.setVisibility(View.GONE);
        }

    }

    public void BtnContinue() {
        if (!validateField()) {
            startActivity(new Intent(this, N2321_N2322.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        if (!valFlag) {
            //ll_N2311_1
            if (!Gothrough.IamHiden(bi.llN23111)) {
                return false;
            }
            //ll_N2311_2
            if (!Gothrough.IamHiden(bi.llN23112)) {
                return false;
            }
            //ll_N2311_3
            if (!Gothrough.IamHiden(bi.llN23113)) {
                return false;
            }
            //ll_N2311_4
            if (!Gothrough.IamHiden(bi.llN23114)) {
                return false;
            }
            //ll_N2311_5
            if (!Gothrough.IamHiden(bi.llN23115)) {
                return false;
            }
            //ll_N2311_6
            if (!Gothrough.IamHiden(bi.llN23116)) {
                return false;
            }
            //ll_N2311_7
            if (!Gothrough.IamHiden(bi.llN23117)) {
                return false;
            }
            //ll_N2311_8
            if (!Gothrough.IamHiden(bi.llN23118)) {
                return false;
            }
            //ll_N2311_9
            if (!Gothrough.IamHiden(bi.llN23119)) {
                return false;
            }
            //ll_N2311_10
            if (!Gothrough.IamHiden(bi.llN231110)) {
                return false;
            }
            //ll_N2311_11
            if (!Gothrough.IamHiden(bi.llN231111)) {
                return false;
            }
            //ll_N2311_12
            if (!Gothrough.IamHiden(bi.llN231112)) {
                return false;
            }
            //ll_N2311_OT
            if (!Gothrough.IamHiden(bi.llN2311OT)) {
                return false;
            }
            //ll_N2312_1
            if (!Gothrough.IamHiden(bi.llN23121)) {
                return false;
            }
            //ll_N2312_2
            if (!Gothrough.IamHiden(bi.llN23122)) {
                return false;
            }
            //ll_N2312_3
            if (!Gothrough.IamHiden(bi.llN23123)) {
                return false;
            }
            //ll_N2312_4
            if (!Gothrough.IamHiden(bi.llN23124)) {
                return false;
            }
            //ll_N2312_5
            if (!Gothrough.IamHiden(bi.llN23125)) {
                return false;
            }
            //ll_N2312_6
            if (!Gothrough.IamHiden(bi.llN23126)) {
                return false;
            }
            //ll_N2312_7
            if (!Gothrough.IamHiden(bi.llN23127)) {
                return false;
            }
            //ll_N2312_8
            if (!Gothrough.IamHiden(bi.llN23128)) {
                return false;
            }
            //ll_N2312_OT
            if (!Gothrough.IamHiden(bi.llN2312OT)) {
                return false;
            }
            //ll_N2313_1
            if (!Gothrough.IamHiden(bi.llN23131)) {
                return false;
            }
            //ll_N2313_2
            if (!Gothrough.IamHiden(bi.llN23132)) {
                return false;
            }
            //ll_N2313_3
            if (!Gothrough.IamHiden(bi.llN23133)) {
                return false;
            }
            //ll_N2313_4
            if (!Gothrough.IamHiden(bi.llN23134)) {
                return false;
            }
            //ll_N2313_5
            if (!Gothrough.IamHiden(bi.llN23135)) {
                return false;
            }
            //ll_N2313_6
            if (!Gothrough.IamHiden(bi.llN23136)) {
                return false;
            }
            //ll_N2313_7
            if (!Gothrough.IamHiden(bi.llN23137)) {
                return false;
            }
            //ll_N2313_8
            if (!Gothrough.IamHiden(bi.llN23138)) {
                return false;
            }
            //ll_N2313_9
            if (!Gothrough.IamHiden(bi.llN23139)) {
                return false;
            }
            //ll_N2313_10
            if (!Gothrough.IamHiden(bi.llN231310)) {
                return false;
            }
            //ll_N2313_11
            if (!Gothrough.IamHiden(bi.llN231311)) {
                return false;
            }
            //ll_N2313_OT
            if (!Gothrough.IamHiden(bi.llN2313OT)) {
                return false;
            }

        }

        //ll_N2314
        if (!Gothrough.IamHiden(bi.llN2314)) {
            return false;
        }
        //ll_N2315
        if (!Gothrough.IamHiden(bi.llN2315)) {
            return false;
        }
        //ll_N2316
        if (!Gothrough.IamHiden(bi.llN2316)) {
            return false;
        }
        //ll_N2317
        return Gothrough.IamHiden(bi.llN2317);
    }
}
