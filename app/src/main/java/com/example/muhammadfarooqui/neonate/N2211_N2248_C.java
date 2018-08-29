package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2211N2248CBinding;

import utils.Gothrough;

public class N2211_N2248_C extends AppCompatActivity {

    N2211N2248CBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_c);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2251_N2260.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2214
        if (!Gothrough.IamHiden(bi.llN2214)) {
            return false;
        }
        //ll_N2215
        if (!Gothrough.IamHiden(bi.llN2215)) {
            return false;
        }
        //ll_N2216
        if (!Gothrough.IamHiden(bi.llN2216)) {
            return false;
        }
        //ll_N2217
        if (!Gothrough.IamHiden(bi.llN2217)) {
            return false;
        }
        //ll_N2218_1
        if (!Gothrough.IamHiden(bi.llN22181)) {
            return false;
        }
        //ll_N2218_2
        if (!Gothrough.IamHiden(bi.llN22182)) {
            return false;
        }
        //ll_N2219
        if (!Gothrough.IamHiden(bi.llN2219)) {
            return false;
        }
        //ll_N2220
        if (!Gothrough.IamHiden(bi.llN2220)) {
            return false;
        }
        //ll_N2221_1
        if (!Gothrough.IamHiden(bi.llN22211)) {
            return false;
        }
        //ll_N2221_2
        if (!Gothrough.IamHiden(bi.llN22212)) {
            return false;
        }
        //ll_N2222
        if (!Gothrough.IamHiden(bi.llN2222)) {
            return false;
        }
        //ll_N2223
        if (!Gothrough.IamHiden(bi.llN2223)) {
            return false;
        }
        //ll_N2224
        if (!Gothrough.IamHiden(bi.llN2224)) {
            return false;
        }
        //ll_N2225_1
        if (!Gothrough.IamHiden(bi.llN22251)) {
            return false;
        }
        //ll_N2225_2
        if (!Gothrough.IamHiden(bi.llN22252)) {
            return false;
        }
        //ll_N2226
        if (!Gothrough.IamHiden(bi.llN2226)) {
            return false;
        }
        //ll_N2227_1
        if (!Gothrough.IamHiden(bi.llN22271)) {
            return false;
        }
        //ll_N2227_2
        if (!Gothrough.IamHiden(bi.llN22272)) {
            return false;
        }
        //ll_N2228_1
        if (!Gothrough.IamHiden(bi.llN22281)) {
            return false;
        }
        //ll_N2228_2
        if (!Gothrough.IamHiden(bi.llN22282)) {
            return false;
        }
        //ll_N2229
        if (!Gothrough.IamHiden(bi.llN2229)) {
            return false;
        }
        //ll_N2230
        if (!Gothrough.IamHiden(bi.llN2230)) {
            return false;
        }
        //ll_N2231_1
        if (!Gothrough.IamHiden(bi.llN22311)) {
            return false;
        }
        //ll_N2231_2
        if (!Gothrough.IamHiden(bi.llN22312)) {
            return false;
        }
        //ll_N2232
        if (!Gothrough.IamHiden(bi.llN2232)) {
            return false;
        }
        //ll_N2233
        if (!Gothrough.IamHiden(bi.llN2233)) {
            return false;
        }
        //ll_N2234
        if (!Gothrough.IamHiden(bi.llN2234)) {
            return false;
        }
        //ll_N2235_1
        if (!Gothrough.IamHiden(bi.llN22351)) {
            return false;
        }
        //ll_N2235_2
        if (!Gothrough.IamHiden(bi.llN22352)) {
            return false;
        }
        //ll_N2236
        if (!Gothrough.IamHiden(bi.llN2236)) {
            return false;
        }
        //ll_N2237_1
        if (!Gothrough.IamHiden(bi.llN22371)) {
            return false;
        }
        //ll_N2237_2
        if (!Gothrough.IamHiden(bi.llN22372)) {
            return false;
        }
        //ll_N2238
        if (!Gothrough.IamHiden(bi.llN2238)) {
            return false;
        }
        //ll_N2239
        if (!Gothrough.IamHiden(bi.llN2239)) {
            return false;
        }
        //ll_N2240
        if (!Gothrough.IamHiden(bi.llN2240)) {
            return false;
        }
        //ll_N2241
        if (!Gothrough.IamHiden(bi.llN2241)) {
            return false;
        }
        //ll_N2242
        if (!Gothrough.IamHiden(bi.llN2242)) {
            return false;
        }
        //ll_N2243
        if (!Gothrough.IamHiden(bi.llN2243)) {
            return false;
        }
        //ll_N2244
        if (!Gothrough.IamHiden(bi.llN2244)) {
            return false;
        }
        //ll_N2245
        if (!Gothrough.IamHiden(bi.llN2245)) {
            return false;
        }
        //ll_N2246
        if (!Gothrough.IamHiden(bi.llN2246)) {
            return false;
        }
        //ll_N2247
        if (!Gothrough.IamHiden(bi.llN2247)) {
            return false;
        }
        //ll_N2248
        return Gothrough.IamHiden(bi.llN2248);
    }
}
