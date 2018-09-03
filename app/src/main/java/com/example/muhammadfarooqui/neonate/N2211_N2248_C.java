package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2211N2248CBinding;

import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;

import static com.example.muhammadfarooqui.neonate.N2211_N2248_A.n2211A_ID;

public class N2211_N2248_C extends AppCompatActivity {

    N2211N2248CBinding bi;
    boolean N2241Flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_c);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.rgN2215.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22151.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2216); //ll_N2216
                }
            }
        });

        bi.rgN2220.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22201.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2221N2237); //ll_N2221_N2237
                } else if (i == bi.rbN22202.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2238N2246); //ll_N2238_N2246
                }
            }
        });

        bi.rgN2219.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN221911.getId() || i != bi.rbN221917.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2222); //ll_N2222
                }


                if (i == bi.rbN221915.getId() || i == bi.rbN2219110.getId() || i == bi.rbN22191DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }

            }
        });

        bi.rgN2223.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22231.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2224); //ll_N2224

                    if (!bi.rbN22331.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llN2238N2240); //ll_N2238_N2240
                    }
                }
            }
        });

        bi.rgN2224.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN222415.getId() || i == bi.rbN2224110.getId() || i == bi.rbN22241DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }
            }
        });

        bi.rgN2226.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22262.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN22271N22272); //ll_N2227_1_N2227_2
                }
            }
        });

        bi.rgN2229.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN222911.getId() || i != bi.rbN222917.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2232); //ll_N2232
                }

                if (i == bi.rbN222915.getId() || i == bi.rbN2229110.getId() || i == bi.rbN22291DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }
            }
        });

        bi.rgN2230.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22301.getId() || i != bi.rbN22303.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN22231N2237); //ll_N22231_N2237
                }
            }
        });

        bi.rgN2233.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22331.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2234); //ll_N2234

                    if (!bi.rbN22231.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llN2238N2240); //ll_N2238_N2240
                    }
                }
            }
        });

        bi.rgN2234.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN223415.getId() || i == bi.rbN2234110.getId() || i == bi.rbN22341DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }
            }
        });

        bi.rgN2236.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22362.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN22371N22372); //ll_N2237_1_N2237_2
                }
            }
        });

        bi.rgN2239.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22391.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2240); //ll_N2240
                }
            }
        });

        bi.rgN2241.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22411.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2242); //ll_N2242
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2251_N2260.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2211_N2248_A_C n2211C = new Global.N.N2211_N2248_A_C();

        DBHelper db = new DBHelper(this);
        Long row = db.update_N2211C(n2211C, n2211A_ID);

        return row == 1;
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

        if (bi.rbN22151.isChecked()) {
            //ll_N2216
            if (!Gothrough.IamHiden(bi.llN2216)) {
                return false;
            }
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

        if (bi.rbN22201.isChecked()) {
            //ll_N2221_1
            if (!Gothrough.IamHiden(bi.llN22211)) {
                return false;
            }
            //ll_N2221_2
            if (!Gothrough.IamHiden(bi.llN22212)) {
                return false;
            }

            if (bi.rbN221911.isChecked() || bi.rbN221917.isChecked()) {
                //ll_N2222
                if (!Gothrough.IamHiden(bi.llN2222)) {
                    return false;
                }
            }

            //ll_N2223
            if (!Gothrough.IamHiden(bi.llN2223)) {
                return false;
            }

            if (bi.rbN22231.isChecked()) {
                //ll_N2224
                if (!Gothrough.IamHiden(bi.llN2224)) {
                    return false;
                }
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

            if (!bi.rbN22262.isChecked()) {
                //ll_N2227_1
                if (!Gothrough.IamHiden(bi.llN22271)) {
                    return false;
                }
                //ll_N2227_2
                if (!Gothrough.IamHiden(bi.llN22272)) {
                    return false;
                }
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

            if (bi.rbN22301.isChecked() || bi.rbN22303.isChecked()) {
                //ll_N2231_1
                if (!Gothrough.IamHiden(bi.llN22311)) {
                    return false;
                }
                //ll_N2231_2
                if (!Gothrough.IamHiden(bi.llN22312)) {
                    return false;
                }

                if (bi.rbN222911.isChecked() || bi.rbN222917.isChecked()) {
                    //ll_N2232
                    if (!Gothrough.IamHiden(bi.llN2232)) {
                        return false;
                    }
                }
                //ll_N2233
                if (!Gothrough.IamHiden(bi.llN2233)) {
                    return false;
                }

                if (bi.rbN22331.isChecked()) {
                    //ll_N2234
                    if (!Gothrough.IamHiden(bi.llN2234)) {
                        return false;
                    }
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

                if (!bi.rbN22362.isChecked()) {
                    //ll_N2237_1
                    if (!Gothrough.IamHiden(bi.llN22371)) {
                        return false;
                    }
                    //ll_N2237_2
                    if (!Gothrough.IamHiden(bi.llN22372)) {
                        return false;
                    }
                }
            }

        }

        if (!bi.rbN22202.isChecked()) {

            if (bi.rbN22231.isChecked() || bi.rbN22331.isChecked()) {
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

            }

            if (N2241Flag) {
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

            }
        }

        //ll_N2247
        if (!Gothrough.IamHiden(bi.llN2247)) {
            return false;
        }
        //ll_N2248
        return Gothrough.IamHiden(bi.llN2248);
    }
}
