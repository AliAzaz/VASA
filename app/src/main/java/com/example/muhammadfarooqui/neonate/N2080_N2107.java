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

import data.DBHelper;
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

        bi.cbN208016.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        bi.cbN208819.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
            if (SaveData()) {
                startActivity(new Intent(this, N2110_N2189a.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean SaveData() {

        Global.N.N2080_N2107 n2080 = new Global.N.N2080_N2107();

        n2080.setN20801(bi.rbN208011.isChecked() ? "1" : bi.rbN208012.isChecked() ? "2" : bi.rbN20801DK.isChecked() ? "9" : bi.rbN20801RA.isChecked() ? "8" : "");
        n2080.setN20802(bi.rbN208021.isChecked() ? "1" : bi.rbN208022.isChecked() ? "2" : bi.rbN20802DK.isChecked() ? "9" : bi.rbN20802RA.isChecked() ? "8" : "");
        n2080.setN20803(bi.rbN208031.isChecked() ? "1" : bi.rbN208032.isChecked() ? "2" : bi.rbN20803DK.isChecked() ? "9" : bi.rbN20803RA.isChecked() ? "8" : "");
        n2080.setN20804(bi.rbN208041.isChecked() ? "1" : bi.rbN208042.isChecked() ? "2" : bi.rbN20804DK.isChecked() ? "9" : bi.rbN20804RA.isChecked() ? "8" : "");
        n2080.setN20805(bi.rbN208051.isChecked() ? "1" : bi.rbN208052.isChecked() ? "2" : bi.rbN20805DK.isChecked() ? "9" : bi.rbN20805RA.isChecked() ? "8" : "");
        n2080.setN20806(bi.rbN208061.isChecked() ? "1" : bi.rbN208062.isChecked() ? "2" : bi.rbN20806DK.isChecked() ? "9" : bi.rbN20806RA.isChecked() ? "8" : "");
        n2080.setN20807(bi.rbN208071.isChecked() ? "1" : bi.rbN208072.isChecked() ? "2" : bi.rbN20807DK.isChecked() ? "9" : bi.rbN20807RA.isChecked() ? "8" : "");
        n2080.setN20808(bi.rbN208081.isChecked() ? "1" : bi.rbN208082.isChecked() ? "2" : bi.rbN20808DK.isChecked() ? "9" : bi.rbN20808RA.isChecked() ? "8" : "");
        n2080.setN20809(bi.rbN208091.isChecked() ? "1" : bi.rbN208092.isChecked() ? "2" : bi.rbN20809DK.isChecked() ? "9" : bi.rbN20809RA.isChecked() ? "8" : "");
        n2080.setN208010(bi.rbN2080101.isChecked() ? "1" : bi.rbN2080102.isChecked() ? "2" : bi.rbN208010DK.isChecked() ? "9" : bi.rbN208010RA.isChecked() ? "8" : "");
        n2080.setN208011(bi.rbN2080111.isChecked() ? "1" : bi.rbN2080112.isChecked() ? "2" : bi.rbN208011DK.isChecked() ? "9" : bi.rbN208011RA.isChecked() ? "8" : "");
        n2080.setN208012(bi.rbN2080121.isChecked() ? "1" : bi.rbN2080122.isChecked() ? "2" : bi.rbN208012DK.isChecked() ? "9" : bi.rbN208012RA.isChecked() ? "8" : "");
        n2080.setN208013(bi.rbN2080131.isChecked() ? "1" : bi.rbN2080132.isChecked() ? "2" : bi.rbN208013DK.isChecked() ? "9" : bi.rbN208013RA.isChecked() ? "8" : "");
        n2080.setN208014(bi.rbN2080141.isChecked() ? "1" : bi.rbN2080142.isChecked() ? "2" : bi.rbN208014DK.isChecked() ? "9" : bi.rbN208014RA.isChecked() ? "8" : "");
        n2080.setN208015(bi.rbN2080151.isChecked() ? "1" : bi.rbN2080152.isChecked() ? "2" : bi.rbN208015DK.isChecked() ? "9" : bi.rbN208015RA.isChecked() ? "8" : "");
        n2080.setN208015x(bi.edN208015.getText().toString());
        n2080.setN208016(bi.cbN208016.isChecked() ? "1" : "2");
        n2080.setN2081(bi.rbN20811.isChecked() ? "1" : bi.rbN20812.isChecked() ? "2" : bi.rbN2081DK.isChecked() ? "9" : "");

        n2080.setN20821(bi.cbN20821.isChecked() ? "1" : "");
        n2080.setN20822(bi.cbN20822.isChecked() ? "2" : "");
        n2080.setN20823(bi.cbN20823.isChecked() ? "3" : "");
        n2080.setN20824(bi.cbN20824.isChecked() ? "4" : "");
        n2080.setN20825(bi.cbN20825.isChecked() ? "5" : "");
        n2080.setN20826(bi.cbN20826.isChecked() ? "6" : "");
        n2080.setN2082DK(bi.cbN2082DK.isChecked() ? "9" : "");
        n2080.setN2082OT(bi.cbN2082OT.isChecked() ? "7" : "");
        n2080.setN2082OTx(bi.edN2082OT.getText().toString());

        n2080.setN2083(bi.rbN20831.isChecked() ? "1" : bi.rbN20832.isChecked() ? "2" : bi.rbN2083DK.isChecked() ? "9" : "");
        n2080.setN2084(bi.rbN20841.isChecked() ? "1" : bi.rbN20842.isChecked() ? "2" : bi.rbN20843.isChecked() ? "3"
                : bi.rbN20844.isChecked() ? "4" : bi.rbN20845.isChecked() ? "5" : bi.rbN20846.isChecked() ? "6" : bi.rbN20847.isChecked() ? "7"
                : bi.rbN20848.isChecked() ? "8" : bi.rbN20849.isChecked() ? "9" : bi.rbN208410.isChecked() ? "10" : bi.rbN208411.isChecked() ? "11"
                : bi.rbN208412.isChecked() ? "12" : bi.rbN208413.isChecked() ? "13" : bi.rbN208414.isChecked() ? "14" : bi.rbN2084OT.isChecked() ? "15" : "");
        n2080.setN2085(bi.rbN20851.isChecked() ? "1" : bi.rbN20852.isChecked() ? "2" : bi.rbN2085DK.isChecked() ? "9" : "");

        n2080.setN20861(bi.cbN20861.isChecked() ? "1" : "");
        n2080.setN20862(bi.cbN20862.isChecked() ? "2" : "");
        n2080.setN20863(bi.cbN20863.isChecked() ? "3" : "");
        n2080.setN20864(bi.cbN20864.isChecked() ? "4" : "");
        n2080.setN20864x(bi.edN20864.getText().toString());
        n2080.setN20865(bi.cbN20865.isChecked() ? "5" : "");
        n2080.setN20866(bi.cbN20866.isChecked() ? "6" : "");
        n2080.setN20867(bi.cbN20867.isChecked() ? "7" : "");
        n2080.setN20868(bi.cbN20868.isChecked() ? "8" : "");
        n2080.setN20869(bi.cbN20869.isChecked() ? "9" : "");
        n2080.setN208610(bi.cbN208610.isChecked() ? "10" : "");
        n2080.setN208611(bi.cbN208611.isChecked() ? "11" : "");
        n2080.setN208612(bi.cbN208612.isChecked() ? "12" : "");
        n2080.setN2086OT(bi.cbN2086OT.isChecked() ? "13" : "");
        n2080.setN2086OTx(bi.edN2086OT.getText().toString());
        n2080.setN2086DK(bi.cbN2086DK.isChecked() ? "99" : "");

        n2080.setN2087(bi.rbN20871.isChecked() ? "1" : bi.rbN20872.isChecked() ? "2" : bi.rbN2087DK.isChecked() ? "9" : "");
        n2080.setN20881(bi.rbN208811.isChecked() ? "1" : bi.rbN208812.isChecked() ? "2" : bi.rbN20881DK.isChecked() ? "9" : bi.rbN20881RA.isChecked() ? "8" : "");
        n2080.setN20882(bi.rbN208821.isChecked() ? "1" : bi.rbN208822.isChecked() ? "2" : bi.rbN20882DK.isChecked() ? "9" : bi.rbN20882RA.isChecked() ? "8" : "");
        n2080.setN20883(bi.rbN208831.isChecked() ? "1" : bi.rbN208832.isChecked() ? "2" : bi.rbN20883DK.isChecked() ? "9" : bi.rbN20883RA.isChecked() ? "8" : "");
        n2080.setN20884(bi.rbN208841.isChecked() ? "1" : bi.rbN208842.isChecked() ? "2" : bi.rbN20884DK.isChecked() ? "9" : bi.rbN20884RA.isChecked() ? "8" : "");
        n2080.setN20885(bi.rbN208851.isChecked() ? "1" : bi.rbN208852.isChecked() ? "2" : bi.rbN20885DK.isChecked() ? "9" : bi.rbN20885RA.isChecked() ? "8" : "");
        n2080.setN20886(bi.rbN208861.isChecked() ? "1" : bi.rbN208862.isChecked() ? "2" : bi.rbN20886DK.isChecked() ? "9" : bi.rbN20886RA.isChecked() ? "8" : "");
        n2080.setN20887(bi.rbN208871.isChecked() ? "1" : bi.rbN208872.isChecked() ? "2" : bi.rbN20887DK.isChecked() ? "9" : bi.rbN20887RA.isChecked() ? "8" : "");
        n2080.setN20888(bi.rbN208881.isChecked() ? "1" : bi.rbN208882.isChecked() ? "2" : bi.rbN20888DK.isChecked() ? "9" : bi.rbN20888RA.isChecked() ? "8" : "");
        n2080.setN20889(bi.rbN208891.isChecked() ? "1" : bi.rbN208892.isChecked() ? "2" : bi.rbN20889DK.isChecked() ? "9" : bi.rbN20889RA.isChecked() ? "8" : "");
        n2080.setN208810(bi.rbN2088101.isChecked() ? "1" : bi.rbN2088102.isChecked() ? "2" : bi.rbN208810DK.isChecked() ? "9" : bi.rbN208810RA.isChecked() ? "8" : "");
        n2080.setN208811(bi.rbN2088111.isChecked() ? "1" : bi.rbN2088112.isChecked() ? "2" : bi.rbN208811DK.isChecked() ? "9" : bi.rbN208811RA.isChecked() ? "8" : "");
        n2080.setN208812(bi.rbN2088121.isChecked() ? "1" : bi.rbN2088122.isChecked() ? "2" : bi.rbN208812DK.isChecked() ? "9" : bi.rbN208812RA.isChecked() ? "8" : "");
        n2080.setN208813(bi.rbN2088131.isChecked() ? "1" : bi.rbN2088132.isChecked() ? "2" : bi.rbN208813DK.isChecked() ? "9" : bi.rbN208813RA.isChecked() ? "8" : "");
        n2080.setN208814(bi.rbN2088141.isChecked() ? "1" : bi.rbN2088142.isChecked() ? "2" : bi.rbN208814DK.isChecked() ? "9" : bi.rbN208814RA.isChecked() ? "8" : "");
        n2080.setN208815(bi.rbN2088151.isChecked() ? "1" : bi.rbN2088152.isChecked() ? "2" : bi.rbN208815DK.isChecked() ? "9" : bi.rbN208815RA.isChecked() ? "8" : "");
        n2080.setN208816(bi.rbN2088161.isChecked() ? "1" : bi.rbN2088162.isChecked() ? "2" : bi.rbN208816DK.isChecked() ? "9" : bi.rbN208816RA.isChecked() ? "8" : "");
        n2080.setN208817(bi.rbN2088171.isChecked() ? "1" : bi.rbN2088172.isChecked() ? "2" : bi.rbN208817DK.isChecked() ? "9" : bi.rbN208817RA.isChecked() ? "8" : "");
        n2080.setN208818(bi.rbN2088181.isChecked() ? "1" : bi.rbN2088182.isChecked() ? "2" : bi.rbN208818DK.isChecked() ? "9" : bi.rbN208818RA.isChecked() ? "8" : "");
        n2080.setN208818x(bi.edN208818.getText().toString());
        n2080.setN208819(bi.cbN208819.isChecked() ? "1" : "2");
        n2080.setN2089(bi.rbN20891.isChecked() ? "1" : bi.rbN20892.isChecked() ? "2" : bi.rbN20893.isChecked() ? "3" : bi.rbN2089OT.isChecked() ? "4" : bi.rbN2089DK.isChecked() ? "9" : "");
        n2080.setN2089(bi.edN2089OT.getText().toString());
        n2080.setN2090(bi.rbN20901.isChecked() ? "1" : bi.rbN20902.isChecked() ? "2" : bi.rbN2090DK.isChecked() ? "9" : "");

        n2080.setN20911(bi.cbN20911.isChecked() ? "1" : "");
        n2080.setN20912(bi.cbN20912.isChecked() ? "2" : "");
        n2080.setN20913(bi.cbN20913.isChecked() ? "3" : "");
        n2080.setN20914(bi.cbN20914.isChecked() ? "4" : "");
        n2080.setN20915(bi.cbN20915.isChecked() ? "5" : "");
        n2080.setN20916(bi.cbN20916.isChecked() ? "6" : "");
        n2080.setN2091DK(bi.cbN2091DK.isChecked() ? "9" : "");
        n2080.setN2091OT(bi.cbN2091OT.isChecked() ? "7" : "");
        n2080.setN2091OTx(bi.edN2091OT.getText().toString());

        n2080.setN2092(bi.rbN20921.isChecked() ? "1" : bi.rbN20922.isChecked() ? "2" : bi.rbN20893.isChecked() ? "3" : bi.rbN20924.isChecked() ? "4" : bi.rbN20925.isChecked() ? "5"
                : bi.rbN2092OT.isChecked() ? "6" : bi.rbN2092DK.isChecked() ? "9" : "");
        n2080.setN2092x(bi.edN2092OT.getText().toString());
        n2080.setN2093(bi.rbN20931.isChecked() ? "1" : bi.rbN20932.isChecked() ? "2" : bi.rbN20933.isChecked() ? "3"
                : bi.rbN20934.isChecked() ? "4" : bi.rbN20935.isChecked() ? "5" : bi.rbN20936.isChecked() ? "6" : bi.rbN20937.isChecked() ? "7"
                : bi.rbN20938.isChecked() ? "8" : bi.rbN20939.isChecked() ? "9" : bi.rbN209310.isChecked() ? "10" : bi.rbN209311.isChecked() ? "11"
                : bi.rbN209312.isChecked() ? "12" : bi.rbN209313.isChecked() ? "13" : bi.rbN2093OT.isChecked() ? "14" : bi.rbN2093DK.isChecked() ? "99" : "");

        n2080.setN2093x(
                bi.rbN20938.isChecked() ? bi.edN20938.getText().toString() :
                        bi.rbN209312.isChecked() ? bi.edN209312.getText().toString() :
                                bi.rbN2093OT.isChecked() ? bi.edN2093OT.getText().toString() : ""
        );

        n2080.setN2094(bi.edN2094.getText().toString());
        n2080.setN2095(bi.rbN20951.isChecked() ? "1" : bi.rbN20952.isChecked() ? "2" : bi.rbN2095DK.isChecked() ? "9" : "");
        n2080.setN2096(bi.rbN20961.isChecked() ? "1" : bi.rbN20962.isChecked() ? "2" : bi.rbN20963.isChecked() ? "3"
                : bi.rbN20964.isChecked() ? "4" : bi.rbN20965.isChecked() ? "5" : bi.rbN20966.isChecked() ? "6" : bi.rbN20967.isChecked() ? "7"
                : bi.rbN20968.isChecked() ? "8" : bi.rbN20969.isChecked() ? "9" : bi.rbN209610.isChecked() ? "10" : bi.rbN209611.isChecked() ? "11"
                : bi.rbN209612.isChecked() ? "12" : bi.rbN209613.isChecked() ? "13" : bi.rbN209614.isChecked() ? "14" : bi.rbN209615.isChecked() ? "15"
                : bi.rbN209616.isChecked() ? "16" : bi.rbN209617.isChecked() ? "17" : bi.rbN2096OT.isChecked() ? "18" : "");
        n2080.setN20971(bi.edN20971.getText().toString());

        n2080.setN20972(bi.edN20972.getText().toString());
        n2080.setN20973(bi.edN20973.getText().toString());

        n2080.setN2098(bi.rbN20981.isChecked() ? "1" : bi.rbN20982.isChecked() ? "2" : bi.rbN20983.isChecked() ? "3"
                : bi.rbN20984.isChecked() ? "4" : bi.rbN20985.isChecked() ? "5" : bi.rbN20986.isChecked() ? "6" : bi.rbN20987.isChecked() ? "7"
                : bi.rbN20988.isChecked() ? "8" : bi.rbN20989.isChecked() ? "9" : bi.rbN209810.isChecked() ? "10" : bi.rbN209811.isChecked() ? "11"
                : bi.rbN2098OT.isChecked() ? "12" : bi.rbN2098DK.isChecked() ? "99" : "");

        n2080.setN2098x(
                bi.rbN209810.isChecked() ? bi.edN209810.getText().toString() :
                        bi.rbN2098OT.isChecked() ? bi.edN2098OT.getText().toString() : ""
        );

        n2080.setN2099(bi.rbN20991.isChecked() ? "1" : bi.rbN20992.isChecked() ? "2" : bi.rbN2099DK.isChecked() ? "9" : "");

        n2080.setN21001(bi.cbN21001.isChecked() ? "1" : "");
        n2080.setN21002(bi.cbN21002.isChecked() ? "2" : "");
        n2080.setN21003(bi.cbN21003.isChecked() ? "3" : "");
        n2080.setN21004(bi.cbN21004.isChecked() ? "4" : "");
        n2080.setN21005(bi.cbN21005.isChecked() ? "5" : "");
        n2080.setN21006(bi.cbN21006.isChecked() ? "6" : "");
        n2080.setN21007(bi.cbN21007.isChecked() ? "7" : "");
        n2080.setN2100Dk(bi.cbN2100DK.isChecked() ? "9" : "");

        n2080.setN21011(bi.cbN21011.isChecked() ? "1" : "");
        n2080.setN21012(bi.cbN21012.isChecked() ? "2" : "");
        n2080.setN21013(bi.cbN21013.isChecked() ? "3" : "");
        n2080.setN21014(bi.cbN21014.isChecked() ? "4" : "");
        n2080.setN21015(bi.cbN21015.isChecked() ? "5" : "");
        n2080.setN21016(bi.cbN21016.isChecked() ? "6" : "");
        n2080.setN21017(bi.cbN21017.isChecked() ? "7" : "");
        n2080.setN2101Dk(bi.cbN2101DK.isChecked() ? "9" : "");

        n2080.setN2102(bi.rbN21021.isChecked() ? "1" : bi.rbN21022.isChecked() ? "2" : bi.rbN21023.isChecked() ? "3" : bi.rbN2102DK.isChecked() ? "9" : "");

        n2080.setN21031(bi.edN21031.getText().toString());
        n2080.setN21032(bi.edN21032.getText().toString());

        n2080.setN2104(bi.rbN21041.isChecked() ? "1" : bi.rbN21042.isChecked() ? "2" : bi.rbN2104DK.isChecked() ? "9" : "");
        n2080.setN2105(bi.rbN21051.isChecked() ? "1" : bi.rbN21052.isChecked() ? "2" : bi.rbN2105DK.isChecked() ? "9" : "");
        n2080.setN2106(bi.rbN21061.isChecked() ? "1" : bi.rbN21062.isChecked() ? "2" : bi.rbN2106DK.isChecked() ? "9" : "");
        n2080.setN21071(bi.rbN210711.isChecked() ? "1" : bi.rbN210712.isChecked() ? "2" : bi.rbN21071DK.isChecked() ? "9" : "");
        n2080.setN21072(bi.rbN210721.isChecked() ? "1" : bi.rbN210722.isChecked() ? "2" : bi.rbN21072DK.isChecked() ? "9" : "");
        n2080.setN21073(bi.rbN210731.isChecked() ? "1" : bi.rbN210732.isChecked() ? "2" : bi.rbN21073DK.isChecked() ? "9" : "");


        DBHelper db = new DBHelper(this);
        Long row = db.add_N2080(n2080);

        return row != 0;

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

        if (!bi.cbN208016.isChecked()) {
            //ll_N2081
            if (!Gothrough.IamHiden(bi.llN2081)) {
                return false;
            }

            if (bi.rbN20811.isChecked()) {
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

        if (!bi.cbN208819.isChecked()) {
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
