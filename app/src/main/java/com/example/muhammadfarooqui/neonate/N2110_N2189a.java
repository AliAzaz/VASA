package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2110N2189aBinding;

import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2110_N2189a extends AppCompatActivity {

    N2110N2189aBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2110__n2189a);
        bi.setCallback(this);

        SetContentUI();

    }

    private void SetContentUI() {

        bi.rgN2112.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21121.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2113); //ll_N2113
                }
            }
        });

        bi.rgN2115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21151.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN21161N21163); //ll_N2116_1_N2116_3
                }
            }
        });

        bi.rgN21162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN211621.getId()) {
                    bi.rgN21163.clearCheck();
                }
            }
        });

        bi.rgN2118.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21182.getId()) {
                    bi.rgN2119.clearCheck();
                }
            }
        });

        bi.edN2122.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (bi.edN2122.getText().toString().trim().equals("98")) {
                    bi.llN2124N2125.setVisibility(View.GONE); //ll_N2124_N2125
                    ClearAllcontrol.ClearAll(bi.llN2124N2125); //ll_N2124_N2125
                } else {
                    bi.llN2124N2125.setVisibility(View.VISIBLE); //ll_N2124_N2125
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        bi.rgN2126.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21261.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2127N2130); //ll_N2127_N2130
                }
            }
        });

        bi.rgN2132.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21321.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2133N2134); //ll_N2133_N2134
                }
            }
        });

        bi.rgN2136.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21361.getId()) {
                    bi.rgN2137.clearCheck();
                }
            }
        });

        bi.rgN2137.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21371.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2138N2140); //ll_N2138_N2140
                }
            }
        });

        bi.rgN2138.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21381.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2139N2140); //ll_N2139_N2140
                }
            }
        });

        bi.rgN2141.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21411.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2142N2143); //ll_N2142_N2143
                }
            }
        });

        bi.rgN2142.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21421.getId()) {
                    bi.rgN2143.clearCheck();
                }
            }
        });

        bi.rgN2145.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21451.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2146N2148); //ll_N2146_N2148
                }
            }
        });

        bi.rgN2146.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21461.getId()) {
                    bi.rgN2147.clearCheck();
                }
            }
        });

        bi.rgN2151.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21511.getId()) {
                    bi.rgN2152.clearCheck();
                }
            }
        });

        bi.rgN2155.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21551.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2156N2158); //ll_N2156_N2158
                }
            }
        });

        bi.rgN2162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21621.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2163N2164); //ll_N2163_N2164
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            startActivity(new Intent(this, N2190_N2191.class));
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_N2110
        if (!Gothrough.IamHiden(bi.llN2110)) {
            return false;
        }
        //ll_N2111
        if (!Gothrough.IamHiden(bi.llN2111)) {
            return false;
        }
        //ll_N2112
        if (!Gothrough.IamHiden(bi.llN2112)) {
            return false;
        }

        if (bi.rbN21121.isChecked()) {
            //ll_N2113
            if (!Gothrough.IamHiden(bi.llN2113)) {
                return false;
            }
        }

        //ll_N2114
        if (!Gothrough.IamHiden(bi.llN2114)) {
            return false;
        }
        //ll_N2115
        if (!Gothrough.IamHiden(bi.llN2115)) {
            return false;
        }

        if (bi.rbN21151.isChecked()) {
            //ll_N2116_1
            if (!Gothrough.IamHiden(bi.llN21161)) {
                return false;
            }
            //ll_N2116_2
            if (!Gothrough.IamHiden(bi.llN21162)) {
                return false;
            }

            if (!bi.rbN211621.isChecked()) {
                //ll_N2116_3
                if (!Gothrough.IamHiden(bi.llN21163)) {
                    return false;
                }
            }
        }

        //ll_N2117
        if (!Gothrough.IamHiden(bi.llN2117)) {
            return false;
        }
        //ll_N2118
        if (!Gothrough.IamHiden(bi.llN2118)) {
            return false;
        }

        if (!bi.rbN21182.isChecked()) {
            //ll_N2119
            if (!Gothrough.IamHiden(bi.llN2119)) {
                return false;
            }
        }

        //ll_N2120
        if (!Gothrough.IamHiden(bi.llN2120)) {
            return false;
        }
        //ll_N2121
        if (!Gothrough.IamHiden(bi.llN2121)) {
            return false;
        }

        if (!bi.rbN21211.isChecked()) {
            //ll_N2122
            if (!Gothrough.IamHiden(bi.llN2122)) {
                return false;
            }
        }

        if (!bi.edN2122.getText().toString().trim().equals("98")) {
            //ll_N2123
            if (!Gothrough.IamHiden(bi.llN2123)) {
                return false;
            }

            if (bi.rbN21231.isChecked()) {
                //ll_N2124
                if (!Gothrough.IamHiden(bi.llN2124)) {
                    return false;
                }
            }
        }

        //ll_N2125
        if (!Gothrough.IamHiden(bi.llN2125)) {
            return false;
        }
        //ll_N2126
        if (!Gothrough.IamHiden(bi.llN2126)) {
            return false;
        }

        if (bi.rbN21261.isChecked()) {
            //ll_N2127
            if (!Gothrough.IamHiden(bi.llN2127)) {
                return false;
            }
            //ll_N2128
            if (!Gothrough.IamHiden(bi.llN2128)) {
                return false;
            }
            //ll_N2129
            if (!Gothrough.IamHiden(bi.llN2129)) {
                return false;
            }
            //ll_N2130
            if (!Gothrough.IamHiden(bi.llN2130)) {
                return false;
            }
        }

        //ll_N2131
        if (!Gothrough.IamHiden(bi.llN2131)) {
            return false;
        }
        //ll_N2132
        if (!Gothrough.IamHiden(bi.llN2132)) {
            return false;
        }

        if (bi.rbN21321.isChecked()) {
            //ll_N2133
            if (!Gothrough.IamHiden(bi.llN2133)) {
                return false;
            }
            //ll_N2134
            if (!Gothrough.IamHiden(bi.llN2134)) {
                return false;
            }
        }

        //ll_N2135_1
        if (!Gothrough.IamHiden(bi.llN21351)) {
            return false;
        }
        //ll_N2135_2
        if (!Gothrough.IamHiden(bi.llN21352)) {
            return false;
        }
        //ll_N2135_3
        if (!Gothrough.IamHiden(bi.llN21353)) {
            return false;
        }
        //ll_N2135_4
        if (!Gothrough.IamHiden(bi.llN21354)) {
            return false;
        }
        //ll_N2135_5
        if (!Gothrough.IamHiden(bi.llN21355)) {
            return false;
        }
        //ll_N2135_6
        if (!Gothrough.IamHiden(bi.llN21356)) {
            return false;
        }
        //ll_N2135_7
        if (!Gothrough.IamHiden(bi.llN21357)) {
            return false;
        }
        //ll_N2135_8
        if (!Gothrough.IamHiden(bi.llN21358)) {
            return false;
        }
        //ll_N2135_9
        if (!Gothrough.IamHiden(bi.llN21359)) {
            return false;
        }
        //ll_N2135_10
        if (!Gothrough.IamHiden(bi.llN213510)) {
            return false;
        }
        //ll_N2135_11
        if (!Gothrough.IamHiden(bi.llN213511)) {
            return false;
        }
        //ll_N2136
        if (!Gothrough.IamHiden(bi.llN2136)) {
            return false;
        }

        if (!bi.rbN21361.isChecked()) {
            //ll_N2137
            if (!Gothrough.IamHiden(bi.llN2137)) {
                return false;
            }
        }

        if (bi.rbN21371.isChecked()) {
            //ll_N2138
            if (!Gothrough.IamHiden(bi.llN2138)) {
                return false;
            }

            if (bi.rbN21381.isChecked()) {
                //ll_N2139
                if (!Gothrough.IamHiden(bi.llN2139)) {
                    return false;
                }
                //ll_N2140
                if (!Gothrough.IamHiden(bi.llN2140)) {
                    return false;
                }
            }
        }

        //ll_N2141
        if (!Gothrough.IamHiden(bi.llN2141)) {
            return false;
        }

        if (bi.rbN21411.isChecked()) {
            //ll_N2142
            if (!Gothrough.IamHiden(bi.llN2142)) {
                return false;
            }

            if (!bi.rbN21421.isChecked()) {
                //ll_N2143
                if (!Gothrough.IamHiden(bi.llN2143)) {
                    return false;
                }
            }
        }

        //ll_N2144
        if (!Gothrough.IamHiden(bi.llN2144)) {
            return false;
        }
        //ll_N2145
        if (!Gothrough.IamHiden(bi.llN2145)) {
            return false;
        }

        if (bi.rbN21451.isChecked()) {
            //ll_N2146
            if (!Gothrough.IamHiden(bi.llN2146)) {
                return false;
            }

            if (!bi.rbN21461.isChecked()) {
                //ll_N2147
                if (!Gothrough.IamHiden(bi.llN2147)) {
                    return false;
                }
            }

            //ll_N2148
            if (!Gothrough.IamHiden(bi.llN2148)) {
                return false;
            }
        }

        //ll_N2149
        if (!Gothrough.IamHiden(bi.llN2149)) {
            return false;
        }
        //ll_N2150
        if (!Gothrough.IamHiden(bi.llN2150)) {
            return false;
        }
        //ll_N2151
        if (!Gothrough.IamHiden(bi.llN2151)) {
            return false;
        }

        if (bi.rbN21511.isChecked()) {
            //ll_N2152
            if (!Gothrough.IamHiden(bi.llN2152)) {
                return false;
            }
        }

        //ll_N2153
        if (!Gothrough.IamHiden(bi.llN2153)) {
            return false;
        }
        //ll_N2154
        if (!Gothrough.IamHiden(bi.llN2154)) {
            return false;
        }
        //ll_N2155
        if (!Gothrough.IamHiden(bi.llN2155)) {
            return false;
        }

        if (bi.rbN21551.isChecked()) {
            //ll_N2156
            if (!Gothrough.IamHiden(bi.llN2156)) {
                return false;
            }
            //ll_N2157
            if (!Gothrough.IamHiden(bi.llN2157)) {
                return false;
            }
            //ll_N2158
            if (!Gothrough.IamHiden(bi.llN2158)) {
                return false;
            }
        }

        //ll_N2159
        if (!Gothrough.IamHiden(bi.llN2159)) {
            return false;
        }

        if (bi.rbN21591.isChecked()) {
            //ll_N2160
            if (!Gothrough.IamHiden(bi.llN2160)) {
                return false;
            }
            //ll_N2161
            if (!Gothrough.IamHiden(bi.llN2161)) {
                return false;
            }
        }

        //ll_N2162
        if (!Gothrough.IamHiden(bi.llN2162)) {
            return false;
        }

        if (bi.rbN21621.isChecked()) {
            //ll_N2163
            if (!Gothrough.IamHiden(bi.llN2163)) {
                return false;
            }
            //ll_N2164
            if (!Gothrough.IamHiden(bi.llN2164)) {
                return false;
            }
        }

        //ll_N2165
        if (!Gothrough.IamHiden(bi.llN2165)) {
            return false;
        }

        if (bi.rbN21651.isChecked()) {
            //ll_N2166
            if (!Gothrough.IamHiden(bi.llN2166)) {
                return false;
            }
            //ll_N2166_1
            if (!Gothrough.IamHiden(bi.llN21661)) {
                return false;
            }
        }

        //ll_N2167
        if (!Gothrough.IamHiden(bi.llN2167)) {
            return false;
        }

        if (bi.rbN21671.isChecked()) {
            //ll_N2168
            if (!Gothrough.IamHiden(bi.llN2168)) {
                return false;
            }
            //ll_N2169
            if (!Gothrough.IamHiden(bi.llN2169)) {
                return false;
            }
        }

        //ll_N2170
        if (!Gothrough.IamHiden(bi.llN2170)) {
            return false;
        }

        if (bi.rbN21701.isChecked()) {
            //ll_N2171
            if (!Gothrough.IamHiden(bi.llN2171)) {
                return false;
            }
        }

        //ll_N2172
        if (!Gothrough.IamHiden(bi.llN2172)) {
            return false;
        }
        //ll_N2174
        if (!Gothrough.IamHiden(bi.llN2174)) {
            return false;
        }
        //ll_N2175
        if (!Gothrough.IamHiden(bi.llN2175)) {
            return false;
        }
        //ll_N2176
        if (!Gothrough.IamHiden(bi.llN2176)) {
            return false;
        }
        //ll_N2177a
        if (!Gothrough.IamHiden(bi.llN2177a)) {
            return false;
        }
        //ll_N2177
        if (!Gothrough.IamHiden(bi.llN2177)) {
            return false;
        }
        //ll_N2178
        if (!Gothrough.IamHiden(bi.llN2178)) {
            return false;
        }
        //ll_N2179
        if (!Gothrough.IamHiden(bi.llN2179)) {
            return false;
        }
        //ll_N2180
        if (!Gothrough.IamHiden(bi.llN2180)) {
            return false;
        }
        //ll_N2181
        if (!Gothrough.IamHiden(bi.llN2181)) {
            return false;
        }
        //ll_N2182
        if (!Gothrough.IamHiden(bi.llN2182)) {
            return false;
        }
        //ll_N2183
        if (!Gothrough.IamHiden(bi.llN2183)) {
            return false;
        }

        if (bi.rbN21831.isChecked()) {
            //ll_N2184
            if (!Gothrough.IamHiden(bi.llN2184)) {
                return false;
            }
        }

        //ll_N2185
        if (!Gothrough.IamHiden(bi.llN2185)) {
            return false;
        }

        if (bi.rbN21851.isChecked()) {
            //ll_N2186
            if (!Gothrough.IamHiden(bi.llN2186)) {
                return false;
            }
            //ll_N2187
            if (!Gothrough.IamHiden(bi.llN2187)) {
                return false;
            }
        }

        //ll_N2188
        if (!Gothrough.IamHiden(bi.llN2188)) {
            return false;
        }
        //ll_N2189
        if (!Gothrough.IamHiden(bi.llN2189)) {
            return false;
        }
        //ll_N2189a
        return Gothrough.IamHiden(bi.llN2189a);
    }
}
