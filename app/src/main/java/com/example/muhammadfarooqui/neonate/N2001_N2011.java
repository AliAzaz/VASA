package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2001N2011Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.validations;

public class N2001_N2011 extends AppCompatActivity {

    N2001N2011Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2001__n2011);
        bi.setCallback(this);

        SetContentUI();
    }

    private void SetContentUI() {

        bi.rgN2001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20011.getId()) {
                    bi.rgN2002.clearCheck();
                }
            }
        });

        bi.rgN2003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN20031.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2004N2005);//ll_N2004_N2005
                }
            }
        });

        bi.rgN2004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20043.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2005uN2005m);//ll_N2005u_N2005m
                }
            }
        });

        bi.rgN2005u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN2005uDK.getId() || i == bi.rbN2005uRA.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2005dN2005m);//ll_N2005d_N2005m
                }
            }
        });

        bi.rgN20091.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN200911.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20091N20094);//ll_N2009_1_N2009_4
                }
            }
        });

        bi.rgN20092.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN200921.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20092N20094);//ll_N2009_2_N2009_4
                }
            }
        });

        bi.rgN20093.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN200931.getId()) {
                    bi.rgN20094.clearCheck();
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2012_N2016.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2001
        if (!Gothrough.IamHiden(bi.llN2001)) {
            return false;
        }

        if (bi.rbN20011.isChecked()) {
            //ll_N2002
            if (!Gothrough.IamHiden(bi.llN2002)) {
                return false;
            }
        }

        //ll_N2003
        if (!Gothrough.IamHiden(bi.llN2003)) {
            return false;
        }

        if (!bi.rbN20031.isChecked()) {
            //ll_N2004
            if (!Gothrough.IamHiden(bi.llN2004)) {
                return false;
            }

            if (bi.rbN20043.isChecked()) {
                //ll_N2005u
                if (!Gothrough.IamHiden(bi.llN2005u)) {
                    return false;
                }

                if (!bi.rbN2005uDK.isChecked() || !bi.rbN2005uRA.isChecked()) {
                    //ll_N2005d
                    if (!Gothrough.IamHiden(bi.llN2005d)) {
                        return false;
                    }
                    if (validations.RangeTextBox(this, bi.edN2005d, 0, 6, "Days")) {
                        return false;
                    }

                    //ll_N2005w
                    if (!Gothrough.IamHiden(bi.llN2005w)) {
                        return false;
                    }
                    if (validations.RangeTextBox(this, bi.edN2005w, 1, 7, "Week")) {
                        return false;
                    }

                    //ll_N2005m
                    if (!Gothrough.IamHiden(bi.llN2005m)) {
                        return false;
                    }
                    if (validations.RangeTextBox(this, bi.edN2005m, 2, 60, "Months")) {
                        return false;
                    }

                }
            }
        }

        //ll_N2006
        if (!Gothrough.IamHiden(bi.llN2006)) {
            return false;
        }

        //ll_N2008
        if (!Gothrough.IamHiden(bi.llN2008)) {
            return false;
        }

        //ll_N2009_1
        if (!Gothrough.IamHiden(bi.llN20091)) {
            return false;
        }

        if (!bi.rbN200911.isChecked()) {
            //ll_N2009_2
            if (!Gothrough.IamHiden(bi.llN20092)) {
                return false;
            }

            if (!bi.rbN200921.isChecked()) {
                //ll_N2009_3
                if (!Gothrough.IamHiden(bi.llN20093)) {
                    return false;
                }

                if (!bi.rbN200931.isChecked()) {
                    //ll_N2009_4
                    if (!Gothrough.IamHiden(bi.llN20094)) {
                        return false;
                    }
                }
            }
        }

        //ll_N2010
        if (!Gothrough.IamHiden(bi.llN2010)) {
            return false;
        }

        //ll_N2011
        return Gothrough.IamHiden(bi.llN2011);
    }
}