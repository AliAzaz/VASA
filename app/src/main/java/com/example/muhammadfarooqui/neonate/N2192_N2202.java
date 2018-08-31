package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2192N2202Binding;

import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2192_N2202 extends AppCompatActivity {

    N2192N2202Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2192__n2202);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2192.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21921.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2192N2198);//ll_N2192_N2198
                }
            }
        });

        bi.rgN2193.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21931.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2194N21101);//ll_N2194_N2110_1
                    ClearAllcontrol.ClearAll(bi.llN2194N21102);//ll_N2194_N2110_2
                }
            }
        });

        CompoundButton.OnCheckedChangeListener cbx_2198_2202 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (!bi.cbN22021.isChecked() && !bi.cbN22022.isChecked() && !bi.cbN2202DK.isChecked()) {
                    bi.cbN22023.setChecked(false);
                    bi.cbN22023.setEnabled(true);
                } else {
                    bi.cbN22023.setChecked(false);
                    bi.cbN22023.setEnabled(false);
                }

                if (!bi.cbN22023.isChecked() && !bi.cbN2202DK.isChecked()) {
                    bi.cbN22021.setChecked(false);
                    bi.cbN22021.setEnabled(true);
                    bi.cbN22022.setChecked(false);
                    bi.cbN22022.setEnabled(true);
                } else {
                    bi.cbN22021.setChecked(false);
                    bi.cbN22021.setEnabled(false);
                    bi.cbN22022.setChecked(false);
                    bi.cbN22022.setEnabled(false);
                }

            }
        };

        bi.cbN21981.setOnCheckedChangeListener(cbx_2198_2202);
        bi.cbN21982.setOnCheckedChangeListener(cbx_2198_2202);
        bi.cbN21983.setOnCheckedChangeListener(cbx_2198_2202);
        bi.cbN2198DK.setOnCheckedChangeListener(cbx_2198_2202);

        bi.cbN22021.setOnCheckedChangeListener(cbx_2198_2202);
        bi.cbN22022.setOnCheckedChangeListener(cbx_2198_2202);
        bi.cbN22023.setOnCheckedChangeListener(cbx_2198_2202);
        bi.cbN2202DK.setOnCheckedChangeListener(cbx_2198_2202);


    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, N2211_N2248_A.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2192_N2202 n2192 = new Global.N.N2192_N2202();

        n2192.setN2192(bi.rbN21921.isChecked() ? "1" : bi.rbN21922.isChecked() ? "2" : bi.rbN2192DK.isChecked() ? "9" : "");
        n2192.setN2193(bi.rbN21931.isChecked() ? "1" : bi.rbN21932.isChecked() ? "2" : bi.rbN2193DK.isChecked() ? "9" : "");
        n2192.setN2194_1(bi.edN21941.getText().toString());
        n2192.setN2194_2(bi.edN21942.getText().toString());
        n2192.setN2195(bi.rbN21951.isChecked() ? "1" : bi.rbN21952.isChecked() ? "2" : bi.rbN2195DK.isChecked() ? "9" : "");
        n2192.setN2196(bi.rbN21961.isChecked() ? "1" : bi.rbN21962.isChecked() ? "2" : bi.rbN2196DK.isChecked() ? "9" : "");
        n2192.setN2197(bi.rbN21971.isChecked() ? "1" : bi.rbN21972.isChecked() ? "2" : bi.rbN2197DK.isChecked() ? "9" : "");

        n2192.setN2198_1(bi.cbN21981.isChecked() ? "1" : "");
        n2192.setN2198_1_T(bi.edN21981T.getText().toString());
        n2192.setN2198_1_FV(bi.edN21981FV.getText().toString());
        n2192.setN2198_2(bi.cbN21982.isChecked() ? "2" : "");
        n2192.setN2198_2_T(bi.edN21982T.getText().toString());
        n2192.setN2198_2_FV(bi.edN21982FV.getText().toString());
        n2192.setN2198_3(bi.cbN21983.isChecked() ? "3" : "");
        n2192.setN2198_DK(bi.cbN2198DK.isChecked() ? "9" : "");

        n2192.setN2199(bi.rbN21991.isChecked() ? "1" : bi.rbN21992.isChecked() ? "2" : bi.rbN2199DK.isChecked() ? "9" : "");
        n2192.setN2200(bi.rbN22001.isChecked() ? "1" : bi.rbN22002.isChecked() ? "2" : bi.rbN2200DK.isChecked() ? "9" : "");
        n2192.setN2201(bi.rbN22011.isChecked() ? "1" : bi.rbN22012.isChecked() ? "2" : bi.rbN2201DK.isChecked() ? "9" : "");

        n2192.setN2202_1(bi.cbN22021.isChecked() ? "1" : "");
        n2192.setN2202_1_T(bi.edN22021T.getText().toString());
        n2192.setN2202_1_FV(bi.edN22021FV.getText().toString());
        n2192.setN2202_2(bi.cbN22022.isChecked() ? "2" : "");
        n2192.setN2202_2_T(bi.edN22022T.getText().toString());
        n2192.setN2202_2_FV(bi.edN22022FV.getText().toString());
        n2192.setN2202_3(bi.cbN22023.isChecked() ? "3" : "");
        n2192.setN2202_DK(bi.cbN2202DK.isChecked() ? "9" : "");

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2192(n2192);

        return row > 0;

    }

    public Boolean validateField() {

        //ll_N2192
        if (!Gothrough.IamHiden(bi.llN2192)) {
            return false;
        }

        if (bi.rbN21921.isChecked()) {
            //ll_N2193
            if (!Gothrough.IamHiden(bi.llN2193)) {
                return false;
            }

            if (bi.rbN21931.isChecked()) {
                //ll_N2194
                if (!Gothrough.IamHiden(bi.llN2194)) {
                    return false;
                }
                //ll_N2195
                if (!Gothrough.IamHiden(bi.llN2195)) {
                    return false;
                }
                //ll_N2196
                if (!Gothrough.IamHiden(bi.llN2196)) {
                    return false;
                }
                //ll_N2197
                if (!Gothrough.IamHiden(bi.llN2197)) {
                    return false;
                }
                //ll_N2198
                if (!Gothrough.IamHiden(bi.llN2198)) {
                    return false;
                }
                //ll_N2199
                if (!Gothrough.IamHiden(bi.llN2199)) {
                    return false;
                }

            }
        }

        if (bi.rbN21931.isChecked()) {
            //ll_N2200
            if (!Gothrough.IamHiden(bi.llN2200)) {
                return false;
            }
            //ll_N2201
            if (!Gothrough.IamHiden(bi.llN2201)) {
                return false;
            }
            //ll_N2202
            return Gothrough.IamHiden(bi.llN2202);

        }

        return true;
    }
}
