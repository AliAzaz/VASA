package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2251N2260Binding;

import java.text.SimpleDateFormat;
import java.util.Date;

import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2251_N2260 extends AppCompatActivity {

    N2251N2260Binding bi;
    String dtToday = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date().getTime());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2251__n2260);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        //Initializing datepickers
        bi.edN22551.setManager(getSupportFragmentManager());
        bi.edN22551.setMaxDate(dtToday);

        bi.edN22552.setManager(getSupportFragmentManager());
        bi.edN22552.setMaxDate(dtToday);

        bi.edN2256.setManager(getSupportFragmentManager());
        bi.edN2256.setMaxDate(dtToday);

        bi.rgN2251.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22511.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2252N2252); //ll_N2252_N2252
                }
            }
        });

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
                    //ll_N2255_1
                    if (!Gothrough.IamHiden(bi.llN22551)) {
                        return false;
                    }
                }

                //ll_N2255_2check
                if (!Gothrough.IamHiden(bi.llN22552check)) {
                    return false;
                }

                if (bi.rbN22552check1.isChecked()) {
                    //ll_N2255_2
                    if (!Gothrough.IamHiden(bi.llN22552)) {
                        return false;
                    }
                }

                //ll_N2256
                if (!Gothrough.IamHiden(bi.llN2256)) {
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
