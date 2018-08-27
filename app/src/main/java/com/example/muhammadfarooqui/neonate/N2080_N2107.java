package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2080N2107Binding;

import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2080_N2107 extends AppCompatActivity {

    N2080N2107Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2080__n2107);
        bi.setCallback(this);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.cbN2080161.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ClearAllcontrol.ClearAll(bi.llN2081N2087); //ll_N2081_N2087
                    bi.llN2081N2087.setVisibility(View.GONE);
                } else {
                    bi.llN2081N2087.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rgN2081.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN20812.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2082N2084); //ll_N2082_N2084
                } else if (i == bi.rbN2081DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2082N2084); //ll_N2082_N2084
                    ClearAllcontrol.ClearAll(bi.llN2085N2086); //ll_N2085_N2086
                }
            }
        });

        CompoundButton.OnCheckedChangeListener cbx2082 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ClearAllcontrol.ClearAll(bi.llN2083N2084); //ll_N2083_N2084
                    bi.llN2083N2084.setVisibility(View.GONE);
                    if (bi.cbN2082DK.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llN2085N2086); //ll_N2085_N2086
                        bi.rgN2087.clearCheck();
                        bi.llN2085N2086.setVisibility(View.GONE);
                    }
                } else {
                    bi.llN2083N2084.setVisibility(View.VISIBLE);
                    bi.llN2085N2086.setVisibility(View.VISIBLE);
                }
            }
        };

        bi.cbN20825.setOnCheckedChangeListener(cbx2082);
        bi.cbN20826.setOnCheckedChangeListener(cbx2082);
        bi.cbN2082OT.setOnCheckedChangeListener(cbx2082);
        bi.cbN2082DK.setOnCheckedChangeListener(cbx2082);

        bi.rgN2083.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20831.getId()) {
                    bi.rgN2084.clearCheck();
                }
            }
        });

        bi.rgN2085.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20851.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2086); //ll_N2086
                }
            }
        });

        bi.cbN2088191.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ClearAllcontrol.ClearAll(bi.llN2089N2106); //ll_N2089_N2106
                    bi.llN2089N2106.setVisibility(View.GONE);
                } else {
                    bi.llN2089N2106.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rgN2089.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN20893.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2090N2192); //ll_N2090_N2192
                }
            }
        });

        bi.rgN2090.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN20901.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2091N2192); //ll_N2091_N2192
                }
            }
        });

        CompoundButton.OnCheckedChangeListener cbx2091 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.rgN2092.clearCheck();
                    bi.llN2092.setVisibility(View.GONE); //ll_N2092
                } else {
                    bi.llN2092.setVisibility(View.VISIBLE);
                }
            }
        };
        bi.cbN20915.setOnCheckedChangeListener(cbx2091);
        bi.cbN20916.setOnCheckedChangeListener(cbx2091);
        bi.cbN2091OT.setOnCheckedChangeListener(cbx2091);
        bi.cbN2091DK.setOnCheckedChangeListener(cbx2091);

        bi.rgN2095.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20951.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2096N4017A); //ll_N2096_N4017_A
                    ClearAllcontrol.ClearAll(bi.llN2096N4017B); //ll_N2096_N4017_B
                }
            }
        });

        bi.rgN2098.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN20981.getId() || i == bi.rbN20982.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2099N2101); //ll_N2099_N2101
                }
                if (i != bi.rbN20983.getId() || i != bi.rbN20987.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2104); //ll_N2104
                }
            }
        });

        bi.rgN2099.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20991.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2100N2101); //ll_N2100_N2101
                }
            }
        });

        bi.rgN2102.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21021.getId() || i != bi.rbN21023.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2103N2106); //ll_N2103_N2106
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2110_N2189a.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2080_1
        if (!Gothrough.IamHiden(bi.llN20801)) {
            return false;
        }

        //ll_N2080_2
        if (!Gothrough.IamHiden(bi.llN20802)) {
            return false;
        }

        //ll_N2080_3
        if (!Gothrough.IamHiden(bi.llN20803)) {
            return false;
        }

        //ll_N2080_4
        if (!Gothrough.IamHiden(bi.llN20804)) {
            return false;
        }

        //ll_N2080_5
        if (!Gothrough.IamHiden(bi.llN20805)) {
            return false;
        }

        //ll_N2080_6
        if (!Gothrough.IamHiden(bi.llN20806)) {
            return false;
        }

        //ll_N2080_7
        if (!Gothrough.IamHiden(bi.llN20807)) {
            return false;
        }

        //ll_N2080_8
        if (!Gothrough.IamHiden(bi.llN20808)) {
            return false;
        }

        //ll_N2080_9
        if (!Gothrough.IamHiden(bi.llN20809)) {
            return false;
        }

        //ll_N20810
        if (!Gothrough.IamHiden(bi.llN208010)) {
            return false;
        }

        //ll_N2080_11
        if (!Gothrough.IamHiden(bi.llN208011)) {
            return false;
        }

        //ll_N2080_12
        if (!Gothrough.IamHiden(bi.llN208012)) {
            return false;
        }

        //ll_N2080_13
        if (!Gothrough.IamHiden(bi.llN208013)) {
            return false;
        }

        //ll_N2080_14
        if (!Gothrough.IamHiden(bi.llN208014)) {
            return false;
        }

        //ll_N2080_15
        if (!Gothrough.IamHiden(bi.llN208015)) {
            return false;
        }

/*        //ll_N2080_16
        if (!Gothrough.IamHiden(bi.llN208016)) {
            return false;
        }*/

        if (!bi.cbN2080161.isChecked()) {
            //ll_N2081
            if (!Gothrough.IamHiden(bi.llN2081)) {
                return false;
            }

            if (!bi.rbN20812.isChecked() || !bi.rbN2081DK.isChecked()) {
                //ll_N2082
                if (!Gothrough.IamHiden(bi.llN2082)) {
                    return false;
                }

                if (!bi.cbN20825.isChecked() || !bi.cbN20826.isChecked() || !bi.cbN2082OT.isChecked()
                        || !bi.cbN2082DK.isChecked()) {
                    //ll_N2083
                    if (!Gothrough.IamHiden(bi.llN2083)) {
                        return false;
                    }

                    if (bi.rbN20831.isChecked()) {
                        //ll_N2084
                        if (!Gothrough.IamHiden(bi.llN2084)) {
                            return false;
                        }
                    }
                }
            }

            if (!bi.rbN2081DK.isChecked() || !bi.cbN2082DK.isChecked()) {
                //ll_N2085
                if (!Gothrough.IamHiden(bi.llN2085)) {
                    return false;
                }

                if (bi.rbN20851.isChecked()) {
                    //ll_N2086
                    if (!Gothrough.IamHiden(bi.llN2086)) {
                        return false;
                    }
                }
            }

            if (!bi.cbN2082DK.isChecked()) {
                //ll_N2087
                if (!Gothrough.IamHiden(bi.llN2087)) {
                    return false;
                }
            }
        }

        //ll_N2088_1
        if (!Gothrough.IamHiden(bi.llN20881)) {
            return false;
        }

        //ll_N2088_2
        if (!Gothrough.IamHiden(bi.llN20882)) {
            return false;
        }

        //ll_N2088_3
        if (!Gothrough.IamHiden(bi.llN20883)) {
            return false;
        }

        //ll_N2088_4
        if (!Gothrough.IamHiden(bi.llN20884)) {
            return false;
        }

        //ll_N2088_5
        if (!Gothrough.IamHiden(bi.llN20885)) {
            return false;
        }

        //ll_N2088_6
        if (!Gothrough.IamHiden(bi.llN20886)) {
            return false;
        }

        //ll_N2088_7
        if (!Gothrough.IamHiden(bi.llN20887)) {
            return false;
        }

        //ll_N2088_8
        if (!Gothrough.IamHiden(bi.llN20888)) {
            return false;
        }

        //ll_N2088_9
        if (!Gothrough.IamHiden(bi.llN20889)) {
            return false;
        }

        //ll_N2088_10
        if (!Gothrough.IamHiden(bi.llN208810)) {
            return false;
        }

        //ll_N2088_11
        if (!Gothrough.IamHiden(bi.llN208811)) {
            return false;
        }

        //ll_N2088_12
        if (!Gothrough.IamHiden(bi.llN208812)) {
            return false;
        }

        //ll_N2088_13
        if (!Gothrough.IamHiden(bi.llN208813)) {
            return false;
        }

        //ll_N2088_14
        if (!Gothrough.IamHiden(bi.llN208814)) {
            return false;
        }

        //ll_N2088_15
        if (!Gothrough.IamHiden(bi.llN208815)) {
            return false;
        }

        //ll_N2088_16
        if (!Gothrough.IamHiden(bi.llN208816)) {
            return false;
        }

        //ll_N2088_17
        if (!Gothrough.IamHiden(bi.llN208817)) {
            return false;
        }

        //ll_N2088_18
        if (!Gothrough.IamHiden(bi.llN208818)) {
            return false;
        }

        //ll_N2088_19
        if (!Gothrough.IamHiden(bi.llN208819)) {
            return false;
        }

        if (!bi.cbN2088191.isChecked()) {
            //ll_N2089
            if (!Gothrough.IamHiden(bi.llN2089)) {
                return false;
            }

            if (!bi.rbN20893.isChecked()) {
                //ll_N2090
                if (!Gothrough.IamHiden(bi.llN2090)) {
                    return false;
                }

                if (bi.rbN20901.isChecked()) {
                    //ll_N2091
                    if (!Gothrough.IamHiden(bi.llN2091)) {
                        return false;
                    }

                    if (!bi.cbN20915.isChecked() || !bi.cbN20916.isChecked() || !bi.cbN2091OT.isChecked()
                            || !bi.cbN2091DK.isChecked()) {
                        //ll_N2092
                        if (!Gothrough.IamHiden(bi.llN2092)) {
                            return false;
                        }
                    }
                }
            }

            //ll_N2093
            if (!Gothrough.IamHiden(bi.llN2093)) {
                return false;
            }

            //ll_N2094
            if (!Gothrough.IamHiden(bi.llN2094)) {
                return false;
            }

            //ll_N2095
            if (!Gothrough.IamHiden(bi.llN2095)) {
                return false;
            }

            if (bi.rbN20951.isChecked()) {
                //ll_N2096
                if (!Gothrough.IamHiden(bi.llN2096)) {
                    return false;
                }

                //ll_N2097
                if (!Gothrough.IamHiden(bi.llN2097)) {
                    return false;
                }

                //ll_N2098
                if (!Gothrough.IamHiden(bi.llN2098)) {
                    return false;
                }

                if (!bi.rbN20981.isChecked() || !bi.rbN20982.isChecked()) {
                    //ll_N2099
                    if (!Gothrough.IamHiden(bi.llN2099)) {
                        return false;
                    }

                    if (bi.rbN20991.isChecked()) {
                        //ll_N2100
                        if (!Gothrough.IamHiden(bi.llN2100)) {
                            return false;
                        }

                        //ll_N2101
                        if (!Gothrough.IamHiden(bi.llN2101)) {
                            return false;
                        }
                    }
                }

                //ll_N2102
                if (!Gothrough.IamHiden(bi.llN2102)) {
                    return false;
                }

                if (bi.rbN21021.isChecked() || bi.rbN21023.isChecked()) {
                    //ll_N2103
                    if (!Gothrough.IamHiden(bi.llN2103)) {
                        return false;
                    }

                    //ll_N2104
                    if (!Gothrough.IamHiden(bi.llN2104)) {
                        return false;
                    }

                    //ll_N2105
                    if (!Gothrough.IamHiden(bi.llN2105)) {
                        return false;
                    }

                    //ll_N2106
                    if (!Gothrough.IamHiden(bi.llN2106)) {
                        return false;
                    }
                }
            }
        }

        if (bi.rbN20951.isChecked()) {
            //ll_N2107_1
            if (!Gothrough.IamHiden(bi.llN21071)) {
                return false;
            }

            //ll_N2107_2
            if (!Gothrough.IamHiden(bi.llN21072)) {
                return false;
            }

            //ll_N2107_3
            return Gothrough.IamHiden(bi.llN21073);
        }

        return true;
    }
}
