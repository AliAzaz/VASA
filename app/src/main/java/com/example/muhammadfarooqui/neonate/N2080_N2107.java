package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.example.muhammadfarooqui.neonate.databinding.N2080N2107Binding;

import utils.ClearAllcontrol;

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
                } else {

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
                    if (bi.cbN2082DK.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llN2085N2086); //ll_N2085_N2086
                        bi.rgN2087.clearCheck();
                    }
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
        startActivity(new Intent(this, N2110_N2189a.class));
    }
}
