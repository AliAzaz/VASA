package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2291N2304Binding;

import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2291_N2304 extends AppCompatActivity {

    N2291N2304Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2291__n2304);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2292.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22921.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2293N2294); //ll_N2293_N2294
                }
            }
        });

        bi.rgN2295.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22953.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2296N2299); //ll_N2296_N2299
                }
            }
        });

        bi.rgN2297.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22971.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2298N2299); //ll_N2298_N2299
                }
            }
        });

        bi.rgN2300.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2300DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2301N2314); //ll_N2301_N2314
                } else if (i == bi.rbN23001.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2301N2302); //ll_N2301_N2302
                }
            }
        });

        bi.rgN2301.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2301DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2301N2304); //ll_N2301_N2304
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, N2311_N2317.class).putExtra("valFlag", bi.rbN2300DK.isChecked()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2291_N2304 n2291 = new Global.N.N2291_N2304();

        n2291.setN2291(bi.edN2291.getText().toString());
        n2291.setN2292(bi.rbN22921.isChecked() ? "1" : bi.rbN22922.isChecked() ? "2" : bi.rbN2292DK.isChecked() ? "9" : "");
        n2291.setN2293(bi.rbN22931.isChecked() ? "1" : bi.rbN22932.isChecked() ? "2" : bi.rbN22933.isChecked() ? "3" : bi.rbN2293DK.isChecked() ? "9" : "");
        n2291.setN2294(bi.edN2294.getText().toString());
        n2291.setN2295(bi.rbN22951.isChecked() ? "1" : bi.rbN22952.isChecked() ? "2" : bi.rbN22953.isChecked() ? "3" : bi.rbN22954.isChecked() ? "4"
                : bi.rbN2295DK.isChecked() ? "9" : "");
        n2291.setN2296(bi.edN2296.getText().toString());
        n2291.setN2297(bi.rbN22971.isChecked() ? "1" : bi.rbN22972.isChecked() ? "2" : bi.rbN2297DK.isChecked() ? "9" : "");
        n2291.setN2298(bi.rbN22981.isChecked() ? "1" : bi.rbN22982.isChecked() ? "2" : bi.rbN22983.isChecked() ? "3" : bi.rbN2298DK.isChecked() ? "9" : "");
        n2291.setN2299(bi.edN2299.getText().toString());
        n2291.setN2300(bi.rbN23001.isChecked() ? "1" : bi.rbN23002.isChecked() ? "2" : bi.rbN2300DK.isChecked() ? "9" : "");
        n2291.setN2301(bi.rbN23011.isChecked() ? "1" : bi.rbN23012.isChecked() ? "2" : bi.rbN23013.isChecked() ? "3" : bi.rbN23014.isChecked() ? "4"
                : bi.rbN2301OT.isChecked() ? "5" : bi.rbN2301DK.isChecked() ? "9" : "");
        n2291.setN2301x(bi.edN2301OT.getText().toString());
        n2291.setN2302_1(bi.edN2302L1.getText().toString());
        n2291.setN2302_2(bi.edN2302L2.getText().toString());
        n2291.setN2303(bi.edN2303.getText().toString());
        n2291.setN2304_1(bi.edN23041.getText().toString());
        n2291.setN2304_2(bi.edN23042.getText().toString());

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2291(n2291);

        return row != 0;
    }

    public Boolean validateField() {

        //ll_N2291
        if (!Gothrough.IamHiden(bi.llN2291)) {
            return false;
        }
        //ll_N2292
        if (!Gothrough.IamHiden(bi.llN2292)) {
            return false;
        }

        if (bi.rbN22921.isChecked()) {
            //ll_N2293
            if (!Gothrough.IamHiden(bi.llN2293)) {
                return false;
            }
            //ll_N2294
            if (!Gothrough.IamHiden(bi.llN2294)) {
                return false;
            }
        }

        //ll_N2295
        if (!Gothrough.IamHiden(bi.llN2295)) {
            return false;
        }

        if (!bi.rbN22953.isChecked()) {
            //ll_N2296
            if (!Gothrough.IamHiden(bi.llN2296)) {
                return false;
            }
            //ll_N2297
            if (!Gothrough.IamHiden(bi.llN2297)) {
                return false;
            }

            if (bi.rbN22971.isChecked()) {
                //ll_N2298
                if (!Gothrough.IamHiden(bi.llN2298)) {
                    return false;
                }
                //ll_N2299
                if (!Gothrough.IamHiden(bi.llN2299)) {
                    return false;
                }
            }
        }

        //ll_N2300
        if (!Gothrough.IamHiden(bi.llN2300)) {
            return false;
        }

        if (!bi.rbN2300DK.isChecked()) {

            if (bi.rbN23001.isChecked()) {
                //ll_N2301
                if (!Gothrough.IamHiden(bi.llN2301)) {
                    return false;
                }
                if (!Gothrough.TextHidden(
                        bi.rbN2301OT.isChecked() ? bi.edN2301OT : null)) {
                    return false;
                }

                if (!bi.rbN2301DK.isChecked()) {
                    //ll_N2302
                    if (!Gothrough.IamHiden(bi.llN2302)) {
                        return false;
                    }
                }
            }

            if (!bi.rbN2301DK.isChecked()) {
                //ll_N2303
                if (!Gothrough.IamHiden(bi.llN2303)) {
                    return false;
                }
                //ll_N2304
                return Gothrough.IamHiden(bi.llN2304);
            }
        }

        return true;
    }

}
