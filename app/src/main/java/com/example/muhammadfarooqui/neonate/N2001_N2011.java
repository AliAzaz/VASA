package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2001N2011Binding;

import data.DBHelper;
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
            if (SaveData()) {
                startActivity(new Intent(this, N2012_N2016.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2001_N2011 n2001 = new Global.N.N2001_N2011();

        n2001.setN2001(bi.rbN20011.isChecked() ? "1" : bi.rbN20012.isChecked() ? "2" : bi.rbN2001DK.isChecked() ? "9"
                : bi.rbN2001RA.isChecked() ? "8" : "");
        n2001.setN2002(bi.rbN20021.isChecked() ? "1" : bi.rbN20022.isChecked() ? "2" : bi.rbN2002DK.isChecked() ? "9"
                : bi.rbN2002RA.isChecked() ? "8" : "");
        n2001.setN2003(bi.rbN20031.isChecked() ? "1" : bi.rbN20032.isChecked() ? "2" : bi.rbN2003DK.isChecked() ? "9"
                : bi.rbN2003RA.isChecked() ? "8" : "");
        n2001.setN2004(bi.rbN20041.isChecked() ? "1" : bi.rbN20042.isChecked() ? "2" : bi.rbN20043.isChecked() ? "3" : bi.rbN2004DK.isChecked() ? "9"
                : bi.rbN2004RA.isChecked() ? "8" : "");
        n2001.setN2005u(bi.rbN2005u1.isChecked() ? "1" : bi.rbN2005u2.isChecked() ? "2" : bi.rbN2005u3.isChecked() ? "3" : bi.rbN2005uDK.isChecked() ? "9"
                : bi.rbN2005uRA.isChecked() ? "8" : "");
        n2001.setN2005d(bi.edN2005d.getText().toString());
        n2001.setN2005w(bi.edN2005w.getText().toString());
        n2001.setN2005m(bi.edN2005m.getText().toString());
        n2001.setN2006(
                bi.rbN20061.isChecked() ? "1" : bi.rbN20062.isChecked() ? "2" : bi.rbN20063.isChecked() ? "3" :
                        bi.rbN20064.isChecked() ? "4" : bi.rbN20065.isChecked() ? "5" : bi.rbN20066.isChecked() ? "6" :
                                bi.rbN20067.isChecked() ? "7" : bi.rbN20068.isChecked() ? "8" : bi.rbN20069.isChecked() ? "9" :
                                        bi.rbN200610.isChecked() ? "10" : bi.rbN200611.isChecked() ? "11" : bi.rbN200612.isChecked() ? "12"
                                                : bi.rbN2006DK.isChecked() ? "99" : bi.rbN2006RA.isChecked() ? "88" : "");
        n2001.setN2006x(
                bi.rbN20066.isChecked() ? bi.edN20066.getText().toString() :
                        bi.rbN200610.isChecked() ? bi.edN200610.getText().toString() :
                                bi.rbN200612.isChecked() ? bi.edN2006OT.getText().toString() : ""
        );


        n2001.setN2008(bi.rbN20081.isChecked() ? "1" : bi.rbN20082.isChecked() ? "2" : bi.rbN20083.isChecked() ? "3" :
                bi.rbN20084.isChecked() ? "4" : bi.rbN20085.isChecked() ? "5" : bi.rbN20086.isChecked() ? "6"
                        : bi.rbN2008OT.isChecked() ? "7" : bi.rbN20088.isChecked() ? "8" : bi.rbN2008DK.isChecked() ? "9" : "");
        n2001.setN2008x(bi.edN2008OT.getText().toString());
        n2001.setN20091(bi.rbN200911.isChecked() ? "1" : bi.rbN200912.isChecked() ? "2" : bi.rbN20091DK.isChecked() ? "9"
                : bi.rbN20091RA.isChecked() ? "8" : "");
        n2001.setN20092(bi.rbN200921.isChecked() ? "1" : bi.rbN200922.isChecked() ? "2" : bi.rbN20092DK.isChecked() ? "9"
                : bi.rbN20092RA.isChecked() ? "8" : "");
        n2001.setN20093(bi.rbN200931.isChecked() ? "1" : bi.rbN200932.isChecked() ? "2" : bi.rbN20093DK.isChecked() ? "9"
                : bi.rbN20093RA.isChecked() ? "8" : "");
        n2001.setN20094(bi.rbN200941.isChecked() ? "1" : bi.rbN200942.isChecked() ? "2" : bi.rbN20094DK.isChecked() ? "9"
                : bi.rbN20094RA.isChecked() ? "8" : "");
        n2001.setN2010(bi.edN2010.getText().toString());
        n2001.setN2011(bi.rbN20111.isChecked() ? "1" : bi.rbN20112.isChecked() ? "2" : "");


        DBHelper db = new DBHelper(this);
        Long row = db.add_N2001(n2001);

        return row != 0;
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

                if (bi.rbN2005u1.isChecked()) {
                    //ll_N2005d
                    if (!Gothrough.IamHiden(bi.llN2005d)) {
                        return false;
                    }
                    if (validations.RangeTextBox(this, bi.edN2005d, 0, 6, "Days")) {
                        return false;
                    }
                }

                if (bi.rbN2005u2.isChecked()) {
                    //ll_N2005w
                    if (!Gothrough.IamHiden(bi.llN2005w)) {
                        return false;
                    }
                    if (validations.RangeTextBox(this, bi.edN2005w, 1, 7, "Week")) {
                        return false;
                    }

                }

                if (bi.rbN2005u3.isChecked()) {
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
        if (!Gothrough.TextHidden(
                bi.rbN20066.isChecked() ? bi.edN20066 : bi.rbN200610.isChecked() ? bi.edN200610
                        : bi.rbN200612.isChecked() ? bi.edN2006OT : null)) {
            return false;
        }

        //ll_N2008
        if (!Gothrough.IamHiden(bi.llN2008)) {
            return false;
        }
        if (!Gothrough.TextHidden(
                bi.rbN2008OT.isChecked() ? bi.edN2008OT : null)) {
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