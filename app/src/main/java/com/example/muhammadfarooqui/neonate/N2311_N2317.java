package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2311N2317Binding;

import data.DBHelper;
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
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, N2321_N2322.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2311_N2317 n2311 = new Global.N.N2311_N2317();

        n2311.setN2311("");
        n2311.setN23111(bi.rbN231111.isChecked() ? "1" : bi.rbN231112.isChecked() ? "2" : bi.rbN23111DK.isChecked() ? "9" : "");
        n2311.setN23112(bi.rbN231121.isChecked() ? "1" : bi.rbN231122.isChecked() ? "2" : bi.rbN23112DK.isChecked() ? "9" : "");
        n2311.setN23113(bi.rbN231131.isChecked() ? "1" : bi.rbN231132.isChecked() ? "2" : bi.rbN23113DK.isChecked() ? "9" : "");
        n2311.setN23114(bi.rbN231141.isChecked() ? "1" : bi.rbN231142.isChecked() ? "2" : bi.rbN23114DK.isChecked() ? "9" : "");
        n2311.setN23115(bi.rbN231151.isChecked() ? "1" : bi.rbN231152.isChecked() ? "2" : bi.rbN23115DK.isChecked() ? "9" : "");
        n2311.setN23116(bi.rbN231161.isChecked() ? "1" : bi.rbN231162.isChecked() ? "2" : bi.rbN23116DK.isChecked() ? "9" : "");
        n2311.setN23117(bi.rbN231171.isChecked() ? "1" : bi.rbN231172.isChecked() ? "2" : bi.rbN23117DK.isChecked() ? "9" : "");
        n2311.setN23118(bi.rbN231181.isChecked() ? "1" : bi.rbN231182.isChecked() ? "2" : bi.rbN23118DK.isChecked() ? "9" : "");
        n2311.setN23119(bi.rbN231191.isChecked() ? "1" : bi.rbN231192.isChecked() ? "2" : bi.rbN23119DK.isChecked() ? "9" : "");
        n2311.setN231110(bi.rbN2311101.isChecked() ? "1" : bi.rbN2311102.isChecked() ? "2" : bi.rbN231110DK.isChecked() ? "9" : "");
        n2311.setN231111(bi.rbN2311111.isChecked() ? "1" : bi.rbN2311112.isChecked() ? "2" : bi.rbN231111DK.isChecked() ? "9" : "");
        n2311.setN231112(bi.rbN2311121.isChecked() ? "1" : bi.rbN2311122.isChecked() ? "2" : bi.rbN231112DK.isChecked() ? "9" : "");
        n2311.setN231113(bi.rbN2311OT1.isChecked() ? "1" : bi.rbN2311OT2.isChecked() ? "2" : bi.rbN2311OTDK.isChecked() ? "9" : "");
        n2311.setN231113x(bi.edN2311OT.getText().toString());

        n2311.setN23121(bi.rbN231211.isChecked() ? "1" : bi.rbN231212.isChecked() ? "2" : bi.rbN23121DK.isChecked() ? "9" : "");
        n2311.setN23122(bi.rbN231221.isChecked() ? "1" : bi.rbN231222.isChecked() ? "2" : bi.rbN23122DK.isChecked() ? "9" : "");
        n2311.setN23123(bi.rbN231231.isChecked() ? "1" : bi.rbN231232.isChecked() ? "2" : bi.rbN23123DK.isChecked() ? "9" : "");
        n2311.setN23124(bi.rbN231241.isChecked() ? "1" : bi.rbN231242.isChecked() ? "2" : bi.rbN23124DK.isChecked() ? "9" : "");
        n2311.setN23125(bi.rbN231251.isChecked() ? "1" : bi.rbN231252.isChecked() ? "2" : bi.rbN23125DK.isChecked() ? "9" : "");
        n2311.setN23126(bi.rbN231261.isChecked() ? "1" : bi.rbN231262.isChecked() ? "2" : bi.rbN23126DK.isChecked() ? "9" : "");
        n2311.setN23127(bi.rbN231271.isChecked() ? "1" : bi.rbN231272.isChecked() ? "2" : bi.rbN23127DK.isChecked() ? "9" : "");
        n2311.setN23128(bi.rbN231281.isChecked() ? "1" : bi.rbN231282.isChecked() ? "2" : bi.rbN23128DK.isChecked() ? "9" : "");
        n2311.setN23129(bi.rbN2312OT1.isChecked() ? "1" : bi.rbN2312OT2.isChecked() ? "2" : bi.rbN2312OTDK.isChecked() ? "9" : "");
        n2311.setN23129x(bi.edN2312OT.getText().toString());

        n2311.setN23131(bi.rbN231311.isChecked() ? "1" : bi.rbN231312.isChecked() ? "2" : bi.rbN23131DK.isChecked() ? "9" : "");
        n2311.setN23132(bi.rbN231321.isChecked() ? "1" : bi.rbN231322.isChecked() ? "2" : bi.rbN23132DK.isChecked() ? "9" : "");
        n2311.setN23133(bi.rbN231331.isChecked() ? "1" : bi.rbN231332.isChecked() ? "2" : bi.rbN23133DK.isChecked() ? "9" : "");
        n2311.setN23134(bi.rbN231341.isChecked() ? "1" : bi.rbN231342.isChecked() ? "2" : bi.rbN23134DK.isChecked() ? "9" : "");
        n2311.setN23135(bi.rbN231351.isChecked() ? "1" : bi.rbN231352.isChecked() ? "2" : bi.rbN23135DK.isChecked() ? "9" : "");
        n2311.setN23136(bi.rbN231361.isChecked() ? "1" : bi.rbN231362.isChecked() ? "2" : bi.rbN23136DK.isChecked() ? "9" : "");
        n2311.setN23137(bi.rbN231371.isChecked() ? "1" : bi.rbN231372.isChecked() ? "2" : bi.rbN23137DK.isChecked() ? "9" : "");
        n2311.setN23138(bi.rbN231381.isChecked() ? "1" : bi.rbN231382.isChecked() ? "2" : bi.rbN23138DK.isChecked() ? "9" : "");
        n2311.setN23139(bi.rbN231391.isChecked() ? "1" : bi.rbN231392.isChecked() ? "2" : bi.rbN23139DK.isChecked() ? "9" : "");
        n2311.setN231310(bi.rbN2313101.isChecked() ? "1" : bi.rbN2313102.isChecked() ? "2" : bi.rbN231310DK.isChecked() ? "9" : "");
        n2311.setN231311(bi.rbN2313111.isChecked() ? "1" : bi.rbN2313112.isChecked() ? "2" : bi.rbN231311DK.isChecked() ? "9" : "");
        n2311.setN231312(bi.rbN2313OT1.isChecked() ? "1" : bi.rbN2313OT2.isChecked() ? "2" : bi.rbN2313OTDK.isChecked() ? "9" : "");
        n2311.setN231312x(bi.edN2313OT.getText().toString());

        n2311.setN2314(bi.rbN23141.isChecked() ? "1" : bi.rbN23142.isChecked() ? "2" : bi.rbN2314RA.isChecked() ? "8" : bi.rbN2314DK.isChecked() ? "9" : "");
        n2311.setN2315(bi.rbN23151.isChecked() ? "1" : bi.rbN23152.isChecked() ? "2" : bi.rbN2315RA.isChecked() ? "8" : bi.rbN2315DK.isChecked() ? "9" : "");
        n2311.setN2316(bi.rbN23161.isChecked() ? "1" : bi.rbN23162.isChecked() ? "2" : bi.rbN2316RA.isChecked() ? "8" : bi.rbN2316DK.isChecked() ? "9" : "");
        n2311.setN2317(bi.rbN23171.isChecked() ? "1" : bi.rbN23172.isChecked() ? "2" : bi.rbN2317RA.isChecked() ? "8" : bi.rbN2317DK.isChecked() ? "9" : "");

        n2311.setSTUDYID("");

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2311(n2311);

        return row != 0;

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
