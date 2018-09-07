package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2051N2078Binding;

import Global.N.N2001_N2011.sub_N2001_N2011;
import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2051_N2078 extends AppCompatActivity {

    N2051N2078Binding bi;
    boolean flag_n2006 = true, flag_n2008 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2051__n2078);
        bi.setCallback(this);

        SetContentUI();
        GetDataFromDB();

    }

    private void GetDataFromDB() {

        DBHelper db = new DBHelper(this);

        String n2006 = db.getSpecificData(data.N.N2001_N2011.TABLE_NAME, "id", sub_N2001_N2011.N2006);
        if (n2006.equals("99") || n2006.equals("1") || n2006.equals("2")) {
            flag_n2006 = false;
        }

        String n2008 = db.getSpecificData(data.N.N2001_N2011.TABLE_NAME, "id", sub_N2001_N2011.N2008);
        if (n2008.equals("9")) {
            flag_n2008 = false;
        }


    }

    private void SetContentUI() {

        bi.rgN2052.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20521.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2053N2057); //ll_N2053_N2057
                }
            }
        });

        bi.rgN20691.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN206911.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN20692N20693); //ll_N2069_2_N2069_3
                }
            }
        });

        bi.rgN20692.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN206921.getId()) {
                    bi.rgN2063.clearCheck();
                }
            }
        });

        bi.rgN2077.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN20771.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2078); //ll_N2078
                }
            }
        });

        if (!flag_n2006 && !flag_n2008) {
            ClearAllcontrol.ClearAll(bi.llN2075N2078); //ll_N2075_N2078
            bi.llN2075N2078.setVisibility(View.GONE);
        }

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, N2080_N2107.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2051_N2078 n2051 = new Global.N.N2051_N2078();

        n2051.setN2051(bi.edN2051.getText().toString());
        n2051.setN2052(bi.rbN20521.isChecked() ? "1" : bi.rbN20522.isChecked() ? "2" : bi.rbN2052DK.isChecked() ? "9" : "");
        n2051.setN20531(bi.cbN20531.isChecked() ? "1" : "");
        n2051.setN20532(bi.cbN20532.isChecked() ? "2" : "");
        n2051.setN20533(bi.cbN20533.isChecked() ? "3" : "");
        n2051.setN20534(bi.cbN20534.isChecked() ? "4" : "");
        n2051.setN20535(bi.cbN20535.isChecked() ? "5" : "");
        n2051.setN2053DK(bi.cbN2053DK.isChecked() ? "9" : "");
        n2051.setN2053OT(bi.cbN2053OT.isChecked() ? "6" : "");
        n2051.setN2053OTx(bi.edN2053OT.getText().toString());

        n2051.setN2054(bi.edN2054.getText().toString());
        n2051.setN2055(bi.edN2055.getText().toString());
        n2051.setN2056(bi.edN2056.getText().toString());
//        n2051.setN2057();
        n2051.setN20571(bi.rbN205711.isChecked() ? "1" : bi.rbN205712.isChecked() ? "2" : bi.rbN20571DK.isChecked() ? "9" : "");
        n2051.setN20572(bi.rbN205721.isChecked() ? "1" : bi.rbN205722.isChecked() ? "2" : bi.rbN20572DK.isChecked() ? "9" : "");
        n2051.setN20573(bi.rbN205731.isChecked() ? "1" : bi.rbN205732.isChecked() ? "2" : bi.rbN20573DK.isChecked() ? "9" : "");
        n2051.setN20574(bi.rbN205741.isChecked() ? "1" : bi.rbN205742.isChecked() ? "2" : bi.rbN20574DK.isChecked() ? "9" : "");
        n2051.setN20575(bi.rbN205751.isChecked() ? "1" : bi.rbN205752.isChecked() ? "2" : bi.rbN20575DK.isChecked() ? "9" : "");
        n2051.setN20576(bi.rbN205761.isChecked() ? "1" : bi.rbN205762.isChecked() ? "2" : bi.rbN20576DK.isChecked() ? "9" : "");
        n2051.setN20581(bi.cbN20581.isChecked() ? "1" : "");
        n2051.setN20582(bi.cbN20582.isChecked() ? "2" : "");
        n2051.setN20583(bi.cbN20583.isChecked() ? "3" : "");
        n2051.setN20584(bi.cbN20584.isChecked() ? "4" : "");
        n2051.setN20585(bi.cbN20585.isChecked() ? "5" : "");
        n2051.setN20586(bi.cbN20586.isChecked() ? "6" : "");
        n2051.setN20587(bi.cbN20587.isChecked() ? "7" : "");
        n2051.setN20588(bi.cbN20588.isChecked() ? "8" : "");
        n2051.setN20589(bi.cbN20589.isChecked() ? "9" : "");
        n2051.setN205810(bi.cbN205810.isChecked() ? "10" : "");
        n2051.setN2059(bi.rbN20591.isChecked() ? "1" : bi.rbN20592.isChecked() ? "2" : bi.rbN2059DK.isChecked() ? "9" : "");
        n2051.setN2060(bi.edN2060.getText().toString());
        n2051.setN2061(bi.rbN20611.isChecked() ? "1" : bi.rbN20612.isChecked() ? "2" : bi.rbN2061DK.isChecked() ? "9" : "");
        n2051.setN2062(bi.edN2062.getText().toString());
        n2051.setN2063(bi.rbN20631.isChecked() ? "1" : bi.rbN20632.isChecked() ? "2" : bi.rbN2063DK.isChecked() ? "9"
                : bi.rbN20633.isChecked() ? "3" : "");
        n2051.setN2064(bi.rbN20641.isChecked() ? "1" : bi.rbN20642.isChecked() ? "2" : bi.rbN2064DK.isChecked() ? "9" : "");
        n2051.setN2065(bi.edN2065.getText().toString());
        n2051.setN2066(bi.rbN20661.isChecked() ? "1" : bi.rbN20662.isChecked() ? "2" : bi.rbN2066DK.isChecked() ? "9"
                : bi.rbN2066RA.isChecked() ? "8" : "");
        n2051.setN2067(bi.edN2067.getText().toString());
        n2051.setN2068(bi.edN2068.getText().toString());
        n2051.setN20691(bi.rbN206911.isChecked() ? "1" : bi.rbN206912.isChecked() ? "2" : bi.rbN20691DK.isChecked() ? "9"
                : bi.rbN20691RA.isChecked() ? "8" : "");
        n2051.setN20692(bi.rbN206921.isChecked() ? "1" : bi.rbN206922.isChecked() ? "2" : bi.rbN20692DK.isChecked() ? "9"
                : bi.rbN20692RA.isChecked() ? "8" : "");
        n2051.setN20693(bi.rbN206931.isChecked() ? "1" : bi.rbN206932.isChecked() ? "2" : bi.rbN20693DK.isChecked() ? "9"
                : bi.rbN20693RA.isChecked() ? "8" : "");
        n2051.setN2070(bi.rbN20701.isChecked() ? "1" : bi.rbN20702.isChecked() ? "2" : bi.rbN2070DK.isChecked() ? "9"
                : bi.rbN2070RA.isChecked() ? "8" : "");
        n2051.setN2071(bi.rbN20711.isChecked() ? "1" : bi.rbN20712.isChecked() ? "2" : bi.rbN2071DK.isChecked() ? "9"
                : bi.rbN2071RA.isChecked() ? "8" : "");
        n2051.setN2072(bi.edN2072.getText().toString());
        n2051.setN2073(bi.rbN20731.isChecked() ? "1" : bi.rbN20732.isChecked() ? "2" : bi.rbN2073DK.isChecked() ? "9"
                : bi.rbN2073RA.isChecked() ? "8" : "");
        n2051.setN2074(bi.rbN20741.isChecked() ? "1" : bi.rbN20742.isChecked() ? "2" : bi.rbN2074OT.isChecked() ? "3"
                : bi.rbN2074DK.isChecked() ? "9" : bi.rbN2074RA.isChecked() ? "8" : "");
        n2051.setN2074x(bi.edN2074OT.getText().toString());
        n2051.setN2075(bi.rbN20751.isChecked() ? "1" : bi.rbN20752.isChecked() ? "2" : bi.rbN2075DK.isChecked() ? "9"
                : bi.rbN2075RA.isChecked() ? "8" : "");
        n2051.setN2076(bi.rbN20761.isChecked() ? "1" : bi.rbN20762.isChecked() ? "2" : bi.rbN20763.isChecked() ? "3"
                : bi.rbN20764.isChecked() ? "4" : bi.rbN20765.isChecked() ? "5" : bi.rbN20766.isChecked() ? "6"
                : bi.rbN2076DK.isChecked() ? "9" : "");
        n2051.setN2076x(bi.edN20766.getText().toString());
        n2051.setN2077(bi.rbN20771.isChecked() ? "1" : bi.rbN20772.isChecked() ? "2" : bi.rbN2077DK.isChecked() ? "9" : "");
        n2051.setN20781(bi.cbN20781.isChecked() ? "1" : "");
        n2051.setN20782(bi.cbN20782.isChecked() ? "2" : "");
        n2051.setN20783(bi.cbN20783.isChecked() ? "3" : "");
        n2051.setN20784(bi.cbN20784.isChecked() ? "4" : "");
        n2051.setN20784x(bi.edN20784.getText().toString());
        n2051.setN20785(bi.cbN20785.isChecked() ? "5" : "");
        n2051.setN20786(bi.cbN20786.isChecked() ? "6" : "");
        n2051.setN20787(bi.cbN20787.isChecked() ? "7" : "");
        n2051.setN20788(bi.cbN20788.isChecked() ? "8" : "");
        n2051.setN20789(bi.cbN20789.isChecked() ? "9" : "");
        n2051.setN207810(bi.cbN207810.isChecked() ? "10" : "");
        n2051.setN207811(bi.cbN207811.isChecked() ? "11" : "");
        n2051.setN207812(bi.cbN207812.isChecked() ? "12" : "");
        n2051.setN207813(bi.cbN207813.isChecked() ? "13" : "");
        n2051.setN2078OT(bi.cbN2078OT.isChecked() ? "14" : "");
        n2051.setN2078OTx(bi.edN2078OT.getText().toString());
        n2051.setN2078DK(bi.cbN2078DK.isChecked() ? "99" : "");

        n2051.setSTUDYID("");
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2051(n2051);

        return row != 0;
    }

    public Boolean validateField() {

        //ll_N2051
        if (!Gothrough.IamHiden(bi.llN2051)) {
            return false;
        }

        //ll_N2052
        if (!Gothrough.IamHiden(bi.llN2052)) {
            return false;
        }

        if (bi.rbN20521.isChecked()) {
            //ll_N2053
            if (!Gothrough.IamHiden(bi.llN2053)) {
                return false;
            }
            if (!Gothrough.TextHidden(
                    bi.cbN2053OT.isChecked() ? bi.edN2053OT : null)) {
                return false;
            }

            //ll_N2054
            if (!Gothrough.IamHiden(bi.llN2054)) {
                return false;
            }

            //ll_N2055
            if (!Gothrough.IamHiden(bi.llN2055)) {
                return false;
            }

            //ll_N2056
            if (!Gothrough.IamHiden(bi.llN2056)) {
                return false;
            }

            //ll_N2057_1
            if (!Gothrough.IamHiden(bi.llN20571)) {
                return false;
            }

            //ll_N2057_2
            if (!Gothrough.IamHiden(bi.llN20572)) {
                return false;
            }

            //ll_N2057_3
            if (!Gothrough.IamHiden(bi.llN20573)) {
                return false;
            }

            //ll_N2057_4
            if (!Gothrough.IamHiden(bi.llN20574)) {
                return false;
            }

            //ll_N2057_5
            if (!Gothrough.IamHiden(bi.llN20575)) {
                return false;
            }

            //ll_N2057_6
            if (!Gothrough.IamHiden(bi.llN20576)) {
                return false;
            }
        }

        //ll_N2058
        if (!Gothrough.IamHiden(bi.llN2058)) {
            return false;
        }

        //ll_N2059
        if (!Gothrough.IamHiden(bi.llN2059)) {
            return false;
        }

        if (bi.rbN20591.isChecked()) {
            //ll_N2060
            if (!Gothrough.IamHiden(bi.llN2060)) {
                return false;
            }
        }

        //ll_N2061
        if (!Gothrough.IamHiden(bi.llN2061)) {
            return false;
        }

        if (bi.rbN20611.isChecked()) {
            //ll_N2062
            if (!Gothrough.IamHiden(bi.llN2062)) {
                return false;
            }
        }

        //ll_N2063
        if (!Gothrough.IamHiden(bi.llN2063)) {
            return false;
        }

        //ll_N2064
        if (!Gothrough.IamHiden(bi.llN2064)) {
            return false;
        }

        if (bi.rbN20641.isChecked()) {
            //ll_N2065
            if (!Gothrough.IamHiden(bi.llN2065)) {
                return false;
            }
        }

        //ll_N2066
        if (!Gothrough.IamHiden(bi.llN2066)) {
            return false;
        }

        //ll_N2067
        if (!Gothrough.IamHiden(bi.llN2067)) {
            return false;
        }

        //ll_N2068
        if (!Gothrough.IamHiden(bi.llN2068)) {
            return false;
        }

        //ll_N2069_1
        if (!Gothrough.IamHiden(bi.llN20691)) {
            return false;
        }

        if (!bi.rbN206911.isChecked()) {
            //ll_N2069_2
            if (!Gothrough.IamHiden(bi.llN20692)) {
                return false;
            }

            //ll_N2069_3
            if (!Gothrough.IamHiden(bi.llN20693)) {
                return false;
            }
        }

        //ll_N2070
        if (!Gothrough.IamHiden(bi.llN2070)) {
            return false;
        }

        //ll_N2071
        if (!Gothrough.IamHiden(bi.llN2071)) {
            return false;
        }

        if (bi.rbN20711.isChecked()) {
            //ll_N2072
            if (!Gothrough.IamHiden(bi.llN2072)) {
                return false;
            }
        }

        //ll_N2073
        if (!Gothrough.IamHiden(bi.llN2073)) {
            return false;
        }

        //ll_N2074
        if (!Gothrough.IamHiden(bi.llN2074)) {
            return false;
        }
        if (!Gothrough.TextHidden(
                bi.rbN2074OT.isChecked() ? bi.edN2074OT : null)) {
            return false;
        }

        //ll_N2075
        if (!Gothrough.IamHiden(bi.llN2075)) {
            return false;
        }

        if (flag_n2006 && flag_n2008) {

            //ll_N2076
            if (!Gothrough.IamHiden(bi.llN2076)) {
                return false;
            }
            if (!Gothrough.TextHidden(
                    bi.rbN20766.isChecked() ? bi.edN20766 : null)) {
                return false;
            }

            //ll_N2077
            if (!Gothrough.IamHiden(bi.llN2077)) {
                return false;
            }

            if (bi.rbN20771.isChecked()) {
                //ll_N2078
                if (!Gothrough.IamHiden(bi.llN2078)) {
                    return false;
                }
                if (!Gothrough.TextHidden(
                        bi.cbN20784.isChecked() ? bi.edN20784 : null)) {
                    return false;
                }
                return Gothrough.TextHidden(bi.cbN2078OT.isChecked() ? bi.edN2078OT : null);
            }
        }

        return true;
    }
}
