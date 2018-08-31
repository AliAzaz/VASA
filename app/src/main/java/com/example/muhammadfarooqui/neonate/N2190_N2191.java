package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2190N2191Binding;

import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2190_N2191 extends AppCompatActivity {

    N2190N2191Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2190__n2191);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2190.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21902.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2190N2191);//ll_N2190_N2191
                }
            }
        });

        bi.rgN21901.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN219011.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN21901N21904);//ll_N2190_1_N2190_4
                }
            }
        });

        bi.rgN21903.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21903OT.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN21903N219020);//ll_N2190_3_N2190_20
                }
            }
        });

        bi.rgN21908.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN219081.getId()) {
                    bi.rgN21909.clearCheck();
                }
            }
        });

        bi.rgN21909.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN219091.getId()) {
                    bi.rgN219010.clearCheck();
                }
            }
        });

        bi.rgN219020.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2190201.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN219021N219022);//ll_N2190_21_N2190_22
                }
            }
        });

        bi.rgN219020.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2190201.getId()) {
                    bi.rgN219022.clearCheck();
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, N2192_N2202.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2190_N2191 n2190 = new Global.N.N2190_N2191();

        n2190.setN2190(bi.rbN21901.isChecked() ? "1" : bi.rbN21902.isChecked() ? "2" : bi.rbN2190DK.isChecked() ? "9"
                : bi.rbN2190RA.isChecked() ? "8" : "");
        n2190.setN21901(bi.rbN219011.isChecked() ? "1" : bi.rbN219012.isChecked() ? "2" : bi.rbN21901DK.isChecked() ? "9"
                : bi.rbN21901RA.isChecked() ? "8" : "");
        n2190.setN21902(bi.rbN219021.isChecked() ? "1" : bi.rbN219022.isChecked() ? "2" : bi.rbN219023.isChecked() ? "3"
                : bi.rbN219024.isChecked() ? "4" : bi.rbN219025.isChecked() ? "5" : bi.rbN21902OT.isChecked() ? "6"
                : bi.rbN21902DK.isChecked() ? "9" : bi.rbN21902RA.isChecked() ? "8" : "");
        n2190.setN21903(bi.rbN219031.isChecked() ? "1" : bi.rbN219032.isChecked() ? "2" : bi.rbN219033.isChecked() ? "3"
                : bi.rbN219034.isChecked() ? "4" : bi.rbN219035.isChecked() ? "5" : bi.rbN219036.isChecked() ? "6" : bi.rbN21903OT.isChecked() ? "7"
                : bi.rbN21903DK.isChecked() ? "9" : bi.rbN21903RA.isChecked() ? "8" : "");
        n2190.setN21904(bi.rbN219041.isChecked() ? "1" : bi.rbN219042.isChecked() ? "2" : bi.rbN21904DK.isChecked() ? "9"
                : bi.rbN21904RA.isChecked() ? "8" : "");
        n2190.setN21905(bi.rbN219051.isChecked() ? "1" : bi.rbN219052.isChecked() ? "2" : bi.rbN21905DK.isChecked() ? "9"
                : bi.rbN21905RA.isChecked() ? "8" : "");
        n2190.setN21906(bi.rbN219061.isChecked() ? "1" : bi.rbN219062.isChecked() ? "2" : bi.rbN21906DK.isChecked() ? "9"
                : bi.rbN21906RA.isChecked() ? "8" : "");
        n2190.setN21907(bi.rbN219071.isChecked() ? "1" : bi.rbN219072.isChecked() ? "2" : bi.rbN21907DK.isChecked() ? "9"
                : bi.rbN21907RA.isChecked() ? "8" : "");
        n2190.setN21908(bi.rbN219081.isChecked() ? "1" : bi.rbN219082.isChecked() ? "2" : bi.rbN21908DK.isChecked() ? "9"
                : bi.rbN21908RA.isChecked() ? "8" : "");
        n2190.setN21909(bi.rbN219091.isChecked() ? "1" : bi.rbN219092.isChecked() ? "2" : bi.rbN21909DK.isChecked() ? "9"
                : bi.rbN21909RA.isChecked() ? "8" : "");
        n2190.setN219010(bi.rbN2190101.isChecked() ? "1" : bi.rbN2190102.isChecked() ? "2" : bi.rbN2190103.isChecked() ? "3"
                : bi.rbN219010OT.isChecked() ? "4" : bi.rbN219010DK.isChecked() ? "9" : bi.rbN219010RA.isChecked() ? "8" : "");
        n2190.setN219011(bi.rbN2190111.isChecked() ? "1" : bi.rbN2190112.isChecked() ? "2" : bi.rbN219011DK.isChecked() ? "9"
                : bi.rbN219011RA.isChecked() ? "8" : "");
        n2190.setN219012(bi.rbN2190121.isChecked() ? "1" : bi.rbN2190122.isChecked() ? "2" : bi.rbN219012DK.isChecked() ? "9"
                : bi.rbN219012RA.isChecked() ? "8" : "");
        n2190.setN219013(bi.rbN2190131.isChecked() ? "1" : bi.rbN2190132.isChecked() ? "2" : bi.rbN219013DK.isChecked() ? "9"
                : bi.rbN219013RA.isChecked() ? "8" : "");
        n2190.setN219014(bi.rbN2190141.isChecked() ? "1" : bi.rbN2190142.isChecked() ? "2" : bi.rbN219014DK.isChecked() ? "9"
                : bi.rbN219014RA.isChecked() ? "8" : "");
        n2190.setN219015(bi.rbN2190151.isChecked() ? "1" : bi.rbN2190152.isChecked() ? "2" : bi.rbN219015DK.isChecked() ? "9"
                : bi.rbN219015RA.isChecked() ? "8" : "");
        n2190.setN219016(bi.rbN2190161.isChecked() ? "1" : bi.rbN2190162.isChecked() ? "2" : bi.rbN219016DK.isChecked() ? "9"
                : bi.rbN219016RA.isChecked() ? "8" : "");
        n2190.setN219017(bi.rbN2190171.isChecked() ? "1" : bi.rbN2190172.isChecked() ? "2" : bi.rbN219017DK.isChecked() ? "9"
                : bi.rbN219017RA.isChecked() ? "8" : "");
        n2190.setN219018(bi.rbN2190181.isChecked() ? "1" : bi.rbN2190182.isChecked() ? "2" : bi.rbN219018DK.isChecked() ? "9"
                : bi.rbN219018RA.isChecked() ? "8" : "");
        n2190.setN219019(bi.rbN2190191.isChecked() ? "1" : bi.rbN2190192.isChecked() ? "2" : bi.rbN219019DK.isChecked() ? "9"
                : bi.rbN219019RA.isChecked() ? "8" : "");
        n2190.setN219020(bi.rbN2190201.isChecked() ? "1" : bi.rbN2190202.isChecked() ? "2" : bi.rbN219020DK.isChecked() ? "9"
                : bi.rbN219020RA.isChecked() ? "8" : "");
        n2190.setN219021(bi.rbN2190211.isChecked() ? "1" : bi.rbN2190212.isChecked() ? "2" : bi.rbN219021DK.isChecked() ? "9"
                : bi.rbN219021RA.isChecked() ? "8" : "");
        n2190.setN219022(bi.rbN2190221.isChecked() ? "1" : bi.rbN2190222.isChecked() ? "2" : bi.rbN219022DK.isChecked() ? "9"
                : bi.rbN219022RA.isChecked() ? "8" : "");
        n2190.setN21911(bi.edN21911.getText().toString());
        n2190.setN21912(bi.edN21912.getText().toString());

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2190(n2190);

        return row > 0;

    }

    public Boolean validateField() {

        //ll_N2190
        if (!Gothrough.IamHiden(bi.llN2190)) {
            return false;
        }

        if (!bi.rbN21902.isChecked()) {
            //ll_N2190_1
            if (!Gothrough.IamHiden(bi.llN21901)) {
                return false;
            }

            if (bi.rbN219011.isChecked()) {
                //ll_N2190_2
                if (!Gothrough.IamHiden(bi.llN21902)) {
                    return false;
                }
                //ll_N2190_3
                if (!Gothrough.IamHiden(bi.llN21903)) {
                    return false;
                }
            }

            if (bi.rbN21903OT.isChecked()) {
                //ll_N2190_4
                if (!Gothrough.IamHiden(bi.llN21904)) {
                    return false;
                }
                //ll_N2190_5
                if (!Gothrough.IamHiden(bi.llN21905)) {
                    return false;
                }
                //ll_N2190_6
                if (!Gothrough.IamHiden(bi.llN21906)) {
                    return false;
                }
                //ll_N2190_7
                if (!Gothrough.IamHiden(bi.llN21907)) {
                    return false;
                }
                //ll_N2190_8
                if (!Gothrough.IamHiden(bi.llN21908)) {
                    return false;
                }

                if (!bi.rbN219081.isChecked()) {
                    //ll_N2190_9
                    if (!Gothrough.IamHiden(bi.llN21909)) {
                        return false;
                    }
                }

                if (bi.rbN219091.isChecked()) {
                    //ll_N2190_10
                    if (!Gothrough.IamHiden(bi.llN219010)) {
                        return false;
                    }
                }

                //ll_N2190_11
                if (!Gothrough.IamHiden(bi.llN219011)) {
                    return false;
                }
                //ll_N2190_12
                if (!Gothrough.IamHiden(bi.llN219012)) {
                    return false;
                }
                //ll_N2190_13
                if (!Gothrough.IamHiden(bi.llN219013)) {
                    return false;
                }
                //ll_N2190_14
                if (!Gothrough.IamHiden(bi.llN219014)) {
                    return false;
                }
                //ll_N2190_15
                if (!Gothrough.IamHiden(bi.llN219015)) {
                    return false;
                }
                //ll_N2190_16
                if (!Gothrough.IamHiden(bi.llN219016)) {
                    return false;
                }
                //ll_N2190_17
                if (!Gothrough.IamHiden(bi.llN219017)) {
                    return false;
                }
                //ll_N2190_18
                if (!Gothrough.IamHiden(bi.llN219018)) {
                    return false;
                }
                //ll_N2190_19
                if (!Gothrough.IamHiden(bi.llN219019)) {
                    return false;
                }

            }

            //ll_N2190_20
            if (!Gothrough.IamHiden(bi.llN219020)) {
                return false;
            }

            if (!bi.rbN2190201.isChecked()) {
                //ll_N2190_21
                if (!Gothrough.IamHiden(bi.llN219021)) {
                    return false;
                }

                if (!bi.rbN2190211.isChecked()) {
                    //ll_N2190_22
                    if (!Gothrough.IamHiden(bi.llN219022)) {
                        return false;
                    }
                }
            }

            //ll_N2191
            return Gothrough.IamHiden(bi.llN2191);
        }

        return true;
    }
}
