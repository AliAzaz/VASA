package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2251N2260Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2251_N2260 extends AppCompatActivity {


    N2251N2260Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2251__n2260);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2253.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22531.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2254N2258);
                }
            }
        });

        bi.rgN2254.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22542.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2255N2258);
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2271_N2284.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2251
        if (!Gothrough.IamHiden(bi.llN2251)) {
            return false;
        }

        if (bi.rbN22511.isChecked()) {
            //ll_N2252_1
            if (!Gothrough.IamHiden(bi.llN22521)) {
                return false;
            }
            //ll_N2252_2
            if (!Gothrough.IamHiden(bi.llN22522)) {
                return false;
            }
            //ll_N2252_3
            if (!Gothrough.IamHiden(bi.llN22523)) {
                return false;
            }
            //ll_N2252_4
            if (!Gothrough.IamHiden(bi.llN22524)) {
                return false;
            }
            //ll_N2252_5
            if (!Gothrough.IamHiden(bi.llN22525)) {
                return false;
            }
            //ll_N2252_6
            if (!Gothrough.IamHiden(bi.llN22526)) {
                return false;
            }
            //ll_N2252_7
            if (!Gothrough.IamHiden(bi.llN22527)) {
                return false;
            }
        }

        //ll_N2253
        if (!Gothrough.IamHiden(bi.llN2253)) {
            return false;
        }

        if (bi.rbN22531.isChecked()) {
            //ll_N2254
            if (!Gothrough.IamHiden(bi.llN2254)) {
                return false;
            }

            if (bi.rbN22541.isChecked()) {
                //ll_N2255_1check
                if (!Gothrough.IamHiden(bi.llN22551check)) {
                    return false;
                }

                if (bi.rbN22551check1.isChecked()) {
                    //ll_N2255_1d
                    if (!Gothrough.IamHiden(bi.llN22551d)) {
                        return false;
                    }
                    //ll_N2255_1m
                    if (!Gothrough.IamHiden(bi.llN22551m)) {
                        return false;
                    }
                    //ll_N2255_1y
                    if (!Gothrough.IamHiden(bi.llN22551y)) {
                        return false;
                    }
                }

                //ll_N2255_2check
                if (!Gothrough.IamHiden(bi.llN22552check)) {
                    return false;
                }

                if (bi.rbN22552check1.isChecked()) {
                    //ll_N2255_2d
                    if (!Gothrough.IamHiden(bi.llN22552d)) {
                        return false;
                    }
                    //ll_N2255_2m
                    if (!Gothrough.IamHiden(bi.llN22552m)) {
                        return false;
                    }
                    //ll_N2255_2y
                    if (!Gothrough.IamHiden(bi.llN22552y)) {
                        return false;
                    }
                }

                //ll_N2256d
                if (!Gothrough.IamHiden(bi.llN2256d)) {
                    return false;
                }
                //ll_N2256m
                if (!Gothrough.IamHiden(bi.llN2256m)) {
                    return false;
                }
                //ll_N2256y
                if (!Gothrough.IamHiden(bi.llN2256y)) {
                    return false;
                }
                //ll_N2257
                if (!Gothrough.IamHiden(bi.llN2257)) {
                    return false;
                }
                //ll_N2258
                if (!Gothrough.IamHiden(bi.llN2258)) {
                    return false;
                }
            }
        }

        //ll_N2259
        if (!Gothrough.IamHiden(bi.llN2259)) {
            return false;
        }

        if (bi.rbN22591.isChecked()) {
            //ll_N2260
            return Gothrough.IamHiden(bi.llN2260);
        }

        return true;
    }

}
