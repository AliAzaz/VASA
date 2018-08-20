package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2051N2078Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2051_N2078 extends AppCompatActivity {

    N2051N2078Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2051__n2078);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2052.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20521.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2053N2057); //ll_N2053_N2057
                }
            }
        });

        bi.rgN20691.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN206911.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20692N20693); //ll_N2069_2_N2069_3
                }
            }
        });

        bi.rgN20692.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN206921.getId()) {
                    bi.rgN2063.clearCheck();
                }
            }
        });

        bi.rgN2077.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20771.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2078); //ll_N2078
                }
            }
        });

    }

    public void BtnContinue() {
        if (!validateField()) {
            startActivity(new Intent(this, N2080_N2107.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2051
        if (!Gothrough.IamHiden(bi.llN2051)) {
            return false;
        }

        //ll_N2052
        if (!Gothrough.IamHiden(bi.llN2052)) {
            return false;
        }

        if (bi.rbN20521.isChecked()) {
            //ll_N2053
            if (!Gothrough.IamHiden(bi.llN2053)) {
                return false;
            }

            //ll_N2054
            if (!Gothrough.IamHiden(bi.llN2054)) {
                return false;
            }

            //ll_N2055
            if (!Gothrough.IamHiden(bi.llN2055)) {
                return false;
            }

            //ll_N2056
            if (!Gothrough.IamHiden(bi.llN2056)) {
                return false;
            }

            //ll_N2057_1
            if (!Gothrough.IamHiden(bi.llN20571)) {
                return false;
            }

            //ll_N2057_2
            if (!Gothrough.IamHiden(bi.llN20572)) {
                return false;
            }

            //ll_N2057_3
            if (!Gothrough.IamHiden(bi.llN20573)) {
                return false;
            }

            //ll_N2057_4
            if (!Gothrough.IamHiden(bi.llN20574)) {
                return false;
            }

            //ll_N2057_5
            if (!Gothrough.IamHiden(bi.llN20575)) {
                return false;
            }

            //ll_N2057_6
            if (!Gothrough.IamHiden(bi.llN20576)) {
                return false;
            }
        }

        //ll_N2058
        if (!Gothrough.IamHiden(bi.llN2058)) {
            return false;
        }

        //ll_N2059
        if (!Gothrough.IamHiden(bi.llN2059)) {
            return false;
        }

        if (bi.rbN20591.isChecked()) {
            //ll_N2060
            if (!Gothrough.IamHiden(bi.llN2060)) {
                return false;
            }
        }

        //ll_N2061
        if (!Gothrough.IamHiden(bi.llN2061)) {
            return false;
        }

        if (bi.rbN20611.isChecked()) {
            //ll_N2062
            if (!Gothrough.IamHiden(bi.llN2062)) {
                return false;
            }
        }

        //ll_N2063
        if (!Gothrough.IamHiden(bi.llN2063)) {
            return false;
        }

        //ll_N2064
        if (!Gothrough.IamHiden(bi.llN2064)) {
            return false;
        }

        if (bi.rbN20641.isChecked()) {
            //ll_N2065
            if (!Gothrough.IamHiden(bi.llN2065)) {
                return false;
            }
        }

        //ll_N2066
        if (!Gothrough.IamHiden(bi.llN2066)) {
            return false;
        }

        //ll_N2067
        if (!Gothrough.IamHiden(bi.llN2067)) {
            return false;
        }

        //ll_N2068
        if (!Gothrough.IamHiden(bi.llN2068)) {
            return false;
        }

        //ll_N2069_1
        if (!Gothrough.IamHiden(bi.llN20691)) {
            return false;
        }

        if (!bi.rbN206911.isChecked()) {
            //ll_N2069_2
            if (!Gothrough.IamHiden(bi.llN20692)) {
                return false;
            }

            //ll_N2069_3
            if (!Gothrough.IamHiden(bi.llN20693)) {
                return false;
            }
        }

        //ll_N2070
        if (!Gothrough.IamHiden(bi.llN2070)) {
            return false;
        }

        //ll_N2071
        if (!Gothrough.IamHiden(bi.llN2071)) {
            return false;
        }

        if (bi.rbN20711.isChecked()) {
            //ll_N2072
            if (!Gothrough.IamHiden(bi.llN2072)) {
                return false;
            }
        }

        //ll_N2073
        if (!Gothrough.IamHiden(bi.llN2073)) {
            return false;
        }

        //ll_N2074
        if (!Gothrough.IamHiden(bi.llN2074)) {
            return false;
        }

        //ll_N2075
        if (!Gothrough.IamHiden(bi.llN2075)) {
            return false;
        }

        //ll_N2076
        if (!Gothrough.IamHiden(bi.llN2076)) {
            return false;
        }

        //ll_N2077
        if (!Gothrough.IamHiden(bi.llN2077)) {
            return false;
        }

        if (bi.rbN20771.isChecked()) {
            //ll_N2078
            return Gothrough.IamHiden(bi.llN2078);
        }

        return true;
    }
}
