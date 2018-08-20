package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2190N2191Binding;

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
        if (!validateField()) {
            startActivity(new Intent(this, N2192_N2202.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
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
