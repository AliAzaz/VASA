package com.example.muhammadfarooqui.neonate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.muhammadfarooqui.neonate.databinding.N2251N2260Binding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.validations;

public class N2251_N2260 extends AppCompatActivity {

    N2251N2260Binding bi;
    String dtToday = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date().getTime());

    boolean flag_n255 = true;
    String txt_n255;

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

        bi.edN2255.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                txt_n255 = String.valueOf(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (bi.edN2255.getText().length() != 0 && flag_n255) {

                    try {

                        switch (bi.edN2255.getText().length()) {

                            case 2:

                                if (!validations.RangeTextBox(bi.edN2255, Integer.valueOf(bi.edN2255.getText().toString().substring(0, 2)), 1, 30, 99, "Days")) {
                                    flag_n255 = false;
                                    return;
                                }
                                flag_n255 = true;
                                bi.edN2255.setText(bi.edN2255.getText().append('/'));

                                break;
                            case 5:

                                if (!validations.RangeTextBox(bi.edN2255, Integer.valueOf(bi.edN2255.getText().toString().substring(3, 5)), 1, 12, 99, "Months")) {
                                    flag_n255 = false;
                                    return;
                                }
                                flag_n255 = true;
                                bi.edN2255.setText(bi.edN2255.getText().append('/'));

                                break;
                            case 10:

                                Calendar ci = Calendar.getInstance();
                                ci.setTime(new Date());

                                if (!validations.RangeTextBox(bi.edN2255, Integer.valueOf(bi.edN2255.getText().toString().substring(6, 10)), 1900, ci.get(Calendar.YEAR), 9999, "Year")) {
                                    flag_n255 = false;
                                    return;
                                }

                                if (bi.edN2255.getText().toString().substring(6, 10).equals("9999")) {
                                    if (!bi.edN2255.getText().toString().equals("99/99/9999")) {
                                        bi.edN2255.setError("Wrong presentation!! Requires: 99/99/9999");
                                        flag_n255 = false;
                                        return;
                                    }
                                }

                                flag_n255 = true;

                                break;

                            default:
                                bi.edN2255.setError(null);
                                break;
                        }
                    } catch (Exception e) {
                        bi.edN2255.setError("Pattern: XX/XX/XXXX");
                    }

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.edN2255.setSelection(bi.edN2255.getText().length());
            }
        });

        bi.edN2255.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DEL) {

                    flag_n255 = true;

                    if (bi.edN2255.getText().length() != 0 && bi.edN2255.getText().toString().equals(txt_n255)) {

                        switch (bi.edN2255.getText().length()) {

                            case 3:
                                bi.edN2255.setText(bi.edN2255.getText().toString().substring(0, 1));
                                break;
                            case 6:
                                bi.edN2255.setText(bi.edN2255.getText().toString().substring(0, 4));
                                bi.edN2255.setSelection(bi.edN2255.getText().length());
                                break;

                        }

                    } else {
                        txt_n255 = bi.edN2255.getText().toString();
                    }


                }
                return false;
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, N2271_N2284.class));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2251_N2260 n2251 = new Global.N.N2251_N2260();

        n2251.setN2251(bi.rbN22511.isChecked() ? "1" : bi.rbN22512.isChecked() ? "2" : bi.rbN2251DK.isChecked() ? "9"
                : bi.rbN2251RA.isChecked() ? "8" : "");
        n2251.setN22521(bi.rbN225211.isChecked() ? "1" : bi.rbN225212.isChecked() ? "2" : bi.rbN22521DK.isChecked() ? "9"
                : bi.rbN22521RA.isChecked() ? "8" : "");
        n2251.setN22522(bi.rbN225221.isChecked() ? "1" : bi.rbN225222.isChecked() ? "2" : bi.rbN22522DK.isChecked() ? "9"
                : bi.rbN22522RA.isChecked() ? "8" : "");
        n2251.setN22523(bi.rbN225231.isChecked() ? "1" : bi.rbN225232.isChecked() ? "2" : bi.rbN22523DK.isChecked() ? "9"
                : bi.rbN22523RA.isChecked() ? "8" : "");
        n2251.setN22524(bi.rbN225241.isChecked() ? "1" : bi.rbN225242.isChecked() ? "2" : bi.rbN22524DK.isChecked() ? "9"
                : bi.rbN22524RA.isChecked() ? "8" : "");
        n2251.setN22525(bi.rbN225251.isChecked() ? "1" : bi.rbN225252.isChecked() ? "2" : bi.rbN22525DK.isChecked() ? "9"
                : bi.rbN22525RA.isChecked() ? "8" : "");
        n2251.setN22526(bi.rbN225261.isChecked() ? "1" : bi.rbN225262.isChecked() ? "2" : bi.rbN22526DK.isChecked() ? "9"
                : bi.rbN22526RA.isChecked() ? "8" : "");
        n2251.setN22527(bi.rbN225271.isChecked() ? "1" : bi.rbN225272.isChecked() ? "2" : bi.rbN22527DK.isChecked() ? "9"
                : bi.rbN22527RA.isChecked() ? "8" : "");
        n2251.setN2253(bi.rbN22531.isChecked() ? "1" : bi.rbN22532.isChecked() ? "2" : bi.rbN2253DK.isChecked() ? "9"
                : bi.rbN2253RA.isChecked() ? "8" : "");
        n2251.setN2254(bi.rbN22541.isChecked() ? "1" : bi.rbN22542.isChecked() ? "2" : "");
        n2251.setN22551check(bi.rbN22551check1.isChecked() ? "1" : bi.rbN22551check2.isChecked() ? "2" : "");
        n2251.setN22551(bi.edN22551.getText().toString());
        n2251.setN22552check(bi.rbN22552check1.isChecked() ? "1" : bi.rbN22552check2.isChecked() ? "2" : "");
        n2251.setN22552(bi.edN22552.getText().toString());
        n2251.setN2256(bi.edN2256.getText().toString());
        n2251.setN2257(bi.edN2257.getText().toString());
        n2251.setN2258(bi.edN2258.getText().toString());
        n2251.setN2259(bi.rbN22591.isChecked() ? "1" : bi.rbN22592.isChecked() ? "2" : bi.rbN2259DK.isChecked() ? "9"
                : bi.rbN2259RA.isChecked() ? "8" : "");
        n2251.setN2260(bi.edN2260.getText().toString());

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2251(n2251);

        return row != 0;
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
