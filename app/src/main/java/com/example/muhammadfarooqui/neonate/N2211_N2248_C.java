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

        n2211C.setN2214(bi.rbN22141.isChecked() ? "1" : bi.rbN22142.isChecked() ? "2" : bi.rbN22143.isChecked() ? "3" : bi.rbN22144.isChecked() ? "4"
                : bi.rbN22145.isChecked() ? "5" : bi.rbN2214OT.isChecked() ? "6" : bi.rbN2214DK.isChecked() ? "9" : "");

        n2211C.setN2215(bi.rbN22151.isChecked() ? "1" : bi.rbN22152.isChecked() ? "2" : bi.rbN2215DK.isChecked() ? "9" : "");

        n2211C.setN22161(bi.cbN22161.isChecked() ? "1" : "");
        n2211C.setN22162(bi.cbN22162.isChecked() ? "2" : "");
        n2211C.setN22163(bi.cbN22163.isChecked() ? "3" : "");
        n2211C.setN22164(bi.cbN22164.isChecked() ? "4" : "");
//        n2211C.setN22164x(bi.edN22164.getText().toString());
        n2211C.setN22165(bi.cbN22165.isChecked() ? "5" : "");
        n2211C.setN22166(bi.cbN22166.isChecked() ? "6" : "");
        n2211C.setN22167(bi.cbN22167.isChecked() ? "7" : "");
        n2211C.setN22168(bi.cbN22168.isChecked() ? "8" : "");
        n2211C.setN22169(bi.cbN22169.isChecked() ? "9" : "");
        n2211C.setN221610(bi.cbN221610.isChecked() ? "10" : "");
        n2211C.setN221611(bi.cbN221611.isChecked() ? "11" : "");
        n2211C.setN221612(bi.cbN221612.isChecked() ? "12" : "");
        n2211C.setN2216Ot(bi.cbN2216OT.isChecked() ? "13" : "");
//        n2211C.setN2216OTx(bi.edN2216OT.getText().toString());
        n2211C.setN2216Dk(bi.cbN2216DK.isChecked() ? "99" : "");

        n2211C.setN22171(bi.edN22171.getText().toString());
        n2211C.setN22172(bi.edN22172.getText().toString());
        n2211C.setN22173(bi.edN22173.getText().toString());

        n2211C.setN22181(bi.rbN221811.isChecked() ? "1" : bi.rbN221812.isChecked() ? "2" : bi.rbN221813.isChecked() ? "3" : bi.rbN22181DK.isChecked() ? "9" : "");
        n2211C.setN22182(bi.rbN221821.isChecked() ? "1" : bi.rbN221822.isChecked() ? "2" : bi.rbN221823.isChecked() ? "3" : bi.rbN22182DK.isChecked() ? "9" : "");

        n2211C.setN2219(bi.rbN221911.isChecked() ? "1" : bi.rbN221912.isChecked() ? "2" : bi.rbN221913.isChecked() ? "3"
                : bi.rbN221914.isChecked() ? "4" : bi.rbN221915.isChecked() ? "5" : bi.rbN221916.isChecked() ? "6" : bi.rbN221917.isChecked() ? "7"
                : bi.rbN221918.isChecked() ? "8" : bi.rbN221919.isChecked() ? "9" : bi.rbN2219110.isChecked() ? "10" : bi.rbN2219111.isChecked() ? "11" : bi.rbN22191DK.isChecked() ? "99" : "");

        n2211C.setN2220(bi.rbN22201.isChecked() ? "1" : bi.rbN22202.isChecked() ? "2" : bi.rbN22203.isChecked() ? "3" : bi.rbN2220DK.isChecked() ? "9" : "");

        n2211C.setN22211(bi.edN22211.getText().toString());
        n2211C.setN22212(bi.edN22212.getText().toString());

        n2211C.setN2222(bi.rbN22221.isChecked() ? "1" : bi.rbN22222.isChecked() ? "2" : bi.rbN2222DK.isChecked() ? "9" : "");
        n2211C.setN2223(bi.rbN22231.isChecked() ? "1" : bi.rbN22232.isChecked() ? "2" : bi.rbN2223DK.isChecked() ? "9" : "");

        n2211C.setN2224(bi.rbN222411.isChecked() ? "1" : bi.rbN222412.isChecked() ? "2" : bi.rbN222413.isChecked() ? "3"
                : bi.rbN222414.isChecked() ? "4" : bi.rbN222415.isChecked() ? "5" : bi.rbN222416.isChecked() ? "6" : bi.rbN222417.isChecked() ? "7"
                : bi.rbN222418.isChecked() ? "8" : bi.rbN222419.isChecked() ? "9" : bi.rbN2224110.isChecked() ? "10" : bi.rbN2224111.isChecked() ? "11" : bi.rbN22241DK.isChecked() ? "99" : "");

        n2211C.setN22251(bi.rbN222511.isChecked() ? "1" : bi.rbN222512.isChecked() ? "2" : bi.rbN22251DK.isChecked() ? "9" : "");
        n2211C.setN22252(bi.rbN222521.isChecked() ? "1" : bi.rbN222522.isChecked() ? "2" : bi.rbN22252DK.isChecked() ? "9" : "");

        n2211C.setN2226(bi.rbN22261.isChecked() ? "1" : bi.rbN22262.isChecked() ? "2" : "");

        n2211C.setN22271(bi.rbN222711.isChecked() ? "1" : bi.rbN222712.isChecked() ? "2" : bi.rbN222713.isChecked() ? "3" : bi.rbN22271DK.isChecked() ? "9" : "");
        n2211C.setN22272(bi.rbN222721.isChecked() ? "1" : bi.rbN222722.isChecked() ? "2" : bi.rbN222723.isChecked() ? "3" : bi.rbN22272DK.isChecked() ? "9" : "");

        /*Repeat*/

        n2211C.setN22281(bi.rbN222811.isChecked() ? "1" : bi.rbN222812.isChecked() ? "2" : bi.rbN222813.isChecked() ? "3" : bi.rbN22281DK.isChecked() ? "9" : "");
        n2211C.setN22282(bi.rbN222821.isChecked() ? "1" : bi.rbN222822.isChecked() ? "2" : bi.rbN222823.isChecked() ? "3" : bi.rbN22282DK.isChecked() ? "9" : "");

        n2211C.setN2229(bi.rbN222911.isChecked() ? "1" : bi.rbN222912.isChecked() ? "2" : bi.rbN222913.isChecked() ? "3"
                : bi.rbN222914.isChecked() ? "4" : bi.rbN222915.isChecked() ? "5" : bi.rbN222916.isChecked() ? "6" : bi.rbN222917.isChecked() ? "7"
                : bi.rbN222918.isChecked() ? "8" : bi.rbN222919.isChecked() ? "9" : bi.rbN2229110.isChecked() ? "10" : bi.rbN2229111.isChecked() ? "11" : bi.rbN22291DK.isChecked() ? "99" : "");

        n2211C.setN2230(bi.rbN22301.isChecked() ? "1" : bi.rbN22302.isChecked() ? "2" : bi.rbN22303.isChecked() ? "3" : bi.rbN2230DK.isChecked() ? "9" : "");

        n2211C.setN22311(bi.edN22311.getText().toString());
        n2211C.setN22312(bi.edN22312.getText().toString());

        n2211C.setN2232(bi.rbN22321.isChecked() ? "1" : bi.rbN22322.isChecked() ? "2" : bi.rbN2232DK.isChecked() ? "9" : "");
        n2211C.setN2233(bi.rbN22331.isChecked() ? "1" : bi.rbN22332.isChecked() ? "2" : bi.rbN2233DK.isChecked() ? "9" : "");

        n2211C.setN2234(bi.rbN223411.isChecked() ? "1" : bi.rbN223412.isChecked() ? "2" : bi.rbN223413.isChecked() ? "3"
                : bi.rbN223414.isChecked() ? "4" : bi.rbN223415.isChecked() ? "5" : bi.rbN223416.isChecked() ? "6" : bi.rbN223417.isChecked() ? "7"
                : bi.rbN223418.isChecked() ? "8" : bi.rbN223419.isChecked() ? "9" : bi.rbN2234110.isChecked() ? "10" : bi.rbN2234111.isChecked() ? "11" : bi.rbN22341DK.isChecked() ? "99" : "");

        n2211C.setN22351(bi.rbN223511.isChecked() ? "1" : bi.rbN223512.isChecked() ? "2" : bi.rbN22351DK.isChecked() ? "9" : "");
        n2211C.setN22352(bi.rbN223521.isChecked() ? "1" : bi.rbN223522.isChecked() ? "2" : bi.rbN22352DK.isChecked() ? "9" : "");

        n2211C.setN2236(bi.rbN22361.isChecked() ? "1" : bi.rbN22362.isChecked() ? "2" : "");

        n2211C.setN22371(bi.rbN223711.isChecked() ? "1" : bi.rbN223712.isChecked() ? "2" : bi.rbN223713.isChecked() ? "3" : bi.rbN22371DK.isChecked() ? "9" : "");
        n2211C.setN22372(bi.rbN223721.isChecked() ? "1" : bi.rbN223722.isChecked() ? "2" : bi.rbN223723.isChecked() ? "3" : bi.rbN22372DK.isChecked() ? "9" : "");

        n2211C.setN2238(bi.rbN22381.isChecked() ? "1" : bi.rbN22382.isChecked() ? "2" : bi.rbN2238DK.isChecked() ? "9" : "");
        n2211C.setN2239(bi.rbN22391.isChecked() ? "1" : bi.rbN22392.isChecked() ? "2" : bi.rbN2239DK.isChecked() ? "9" : "");

        n2211C.setN22401(bi.cbN22401.isChecked() ? "1" : "");
        n2211C.setN22402(bi.cbN22402.isChecked() ? "2" : "");
        n2211C.setN22403(bi.cbN22403.isChecked() ? "3" : "");
        n2211C.setN22404(bi.cbN22404.isChecked() ? "4" : "");
//        n2211C.setN22404x(bi.edN22404.getText().toString());
        n2211C.setN22405(bi.cbN22405.isChecked() ? "5" : "");
        n2211C.setN22406(bi.cbN22406.isChecked() ? "6" : "");
        n2211C.setN22407(bi.cbN22407.isChecked() ? "7" : "");
        n2211C.setN22408(bi.cbN22408.isChecked() ? "8" : "");
        n2211C.setN22409(bi.cbN22409.isChecked() ? "9" : "");
        n2211C.setN224010(bi.cbN224010.isChecked() ? "10" : "");
        n2211C.setN224011(bi.cbN224011.isChecked() ? "11" : "");
        n2211C.setN224012(bi.cbN224012.isChecked() ? "12" : "");
        n2211C.setN224013(bi.cbN224013.isChecked() ? "13" : "");
        n2211C.setN224014(bi.cbN224014.isChecked() ? "14" : "");
        n2211C.setN224015(bi.cbN224015.isChecked() ? "15" : "");
        n2211C.setN2240Ot(bi.cbN2240OT.isChecked() ? "16" : "");
//        n2211C.setN2240OTx(bi.edN2240OT.getText().toString());
        n2211C.setN2240Dk(bi.cbN2240DK.isChecked() ? "99" : "");

        n2211C.setN2241(bi.rbN22411.isChecked() ? "1" : bi.rbN22412.isChecked() ? "2" : bi.rbN2241DK.isChecked() ? "9" : "");


        n2211C.setN22421(bi.cbN22421.isChecked() ? "1" : "");
        n2211C.setN22422(bi.cbN22422.isChecked() ? "2" : "");
        n2211C.setN22423(bi.cbN22423.isChecked() ? "3" : "");
        n2211C.setN22424(bi.cbN22424.isChecked() ? "4" : "");
        n2211C.setN22425(bi.cbN22425.isChecked() ? "5" : "");
        n2211C.setN22426(bi.cbN22426.isChecked() ? "6" : "");
        n2211C.setN22427(bi.cbN22427.isChecked() ? "7" : "");
        n2211C.setN2242Dk(bi.cbN2242Dk.isChecked() ? "99" : "");

        n2211C.setN22431(bi.cbN22431.isChecked() ? "1" : "");
        n2211C.setN22432(bi.cbN22432.isChecked() ? "2" : "");
        n2211C.setN22433(bi.cbN22433.isChecked() ? "3" : "");
        n2211C.setN22434(bi.cbN22434.isChecked() ? "4" : "");
        n2211C.setN22435(bi.cbN22435.isChecked() ? "5" : "");
        n2211C.setN22436(bi.cbN22436.isChecked() ? "6" : "");
        n2211C.setN22437(bi.cbN22437.isChecked() ? "7" : "");
        n2211C.setN2243Dk(bi.cbN2243DK.isChecked() ? "99" : "");

        n2211C.setN2244(bi.rbN22441.isChecked() ? "1" : bi.rbN22442.isChecked() ? "2" : bi.rbN2244DK.isChecked() ? "9" : bi.rbN2244RA.isChecked() ? "8" : "");
        n2211C.setN2245(bi.rbN22451.isChecked() ? "1" : bi.rbN22452.isChecked() ? "2" : bi.rbN2245DK.isChecked() ? "9" : bi.rbN2245RA.isChecked() ? "8" : "");
        n2211C.setN2246(bi.rbN22461.isChecked() ? "1" : bi.rbN22462.isChecked() ? "2" : bi.rbN2246DK.isChecked() ? "9" : bi.rbN2246RA.isChecked() ? "8" : "");

        n2211C.setN2248(bi.edN2248.getText().toString());


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
