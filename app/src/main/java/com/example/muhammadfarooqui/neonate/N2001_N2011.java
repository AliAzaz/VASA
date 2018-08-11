package com.example.muhammadfarooqui.neonate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class N2001_N2011 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener, View.OnFocusChangeListener {


    //region Declaration

    Button btn_next;
    // LinerLayout


    LinearLayout
            ll_N2001,
            ll_N2002,
            ll_N2003,
            ll_N2004,
            ll_N2005u,
            ll_N2005d,
            ll_N2005w,
            ll_N2005m,
            ll_N2006,
            ll_N2008,
            ll_N2009_1,
            ll_N2009_2,
            ll_N2009_3,
            ll_N2009_4,
            ll_N2010,
            ll_N2011;

    RadioButton
            rb_N2001_1,
            rb_N2001_2,
            rb_N2001_DK,
            rb_N2001_RA,
            rb_N2002_1,
            rb_N2002_2,
            rb_N2002_DK,
            rb_N2002_RA,
            rb_N2003_1,
            rb_N2003_2,
            rb_N2003_DK,
            rb_N2003_RA,
            rb_N2004_1,
            rb_N2004_2,
            rb_N2004_3,
            rb_N2004_DK,
            rb_N2004_RA,
            rb_N2005u_1,
            rb_N2005u_2,
            rb_N2005u_3,
            rb_N2005u_DK,
            rb_N2005u_RA,
            rb_N2006_1,
            rb_N2006_2,
            rb_N2006_3,
            rb_N2006_4,
            rb_N2006_5,
            rb_N2006_7,
            rb_N2006_8,
            rb_N2006_9,
            rb_N2006_11,
            rb_N2006_DK,
            rb_N2006_RA,
            rb_N2008_1,
            rb_N2008_2,
            rb_N2008_3,
            rb_N2008_4,
            rb_N2008_5,
            rb_N2008_6,
            rb_N2008_8,
            rb_N2008_DK,
            rb_N2009_1_1,
            rb_N2009_1_2,
            rb_N2009_1_DK,
            rb_N2009_1_RA,
            rb_N2009_2_1,
            rb_N2009_2_2,
            rb_N2009_2_DK,
            rb_N2009_2_RA,
            rb_N2009_3_1,
            rb_N2009_3_2,
            rb_N2009_3_DK,
            rb_N2009_3_RA,
            rb_N2009_4_1,
            rb_N2009_4_2,
            rb_N2009_4_DK,
            rb_N2009_4_RA,
            rb_N2011_1,
            rb_N2011_2;

    EditText
            ed_N2005d,
            ed_N2005w,
            ed_N2005m,
            ed_N2010,
            ed_N2006_OT,
            ed_N2008_OT,
            ed_N2006_6,
            ed_N2006_10;


    String
            N2001,
            N2002,
            N2003,
            N2004,
            N2005u,
            N2005d,
            N2005w,
            N2005m,
            N2006,
            N2008,
            N2009_1,
            N2009_2,
            N2009_3,
            N2009_4,
            N2010,
            N2011;


    //endregion


    void Initialization() {

        btn_next = findViewById(R.id.btn_next);

        ll_N2001 = findViewById(R.id.ll_N2001);
        ll_N2002 = findViewById(R.id.ll_N2002);
        ll_N2003 = findViewById(R.id.ll_N2003);
        ll_N2004 = findViewById(R.id.ll_N2004);
        ll_N2005u = findViewById(R.id.ll_N2005u);
        ll_N2005d = findViewById(R.id.ll_N2005d);
        ll_N2005w = findViewById(R.id.ll_N2005w);
        ll_N2005m = findViewById(R.id.ll_N2005m);
        ll_N2006 = findViewById(R.id.ll_N2006);
        ll_N2008 = findViewById(R.id.ll_N2008);
        ll_N2009_1 = findViewById(R.id.ll_N2009_1);
        ll_N2009_2 = findViewById(R.id.ll_N2009_2);
        ll_N2009_3 = findViewById(R.id.ll_N2009_3);
        ll_N2009_4 = findViewById(R.id.ll_N2009_4);
        ll_N2010 = findViewById(R.id.ll_N2010);
        ll_N2011 = findViewById(R.id.ll_N2011);


        rb_N2001_1 = findViewById(R.id.rb_N2001_1);
        rb_N2001_2 = findViewById(R.id.rb_N2001_2);
        rb_N2001_DK = findViewById(R.id.rb_N2001_DK);
        rb_N2001_RA = findViewById(R.id.rb_N2001_RA);
        rb_N2002_1 = findViewById(R.id.rb_N2002_1);
        rb_N2002_2 = findViewById(R.id.rb_N2002_2);
        rb_N2002_DK = findViewById(R.id.rb_N2002_DK);
        rb_N2002_RA = findViewById(R.id.rb_N2002_RA);
        rb_N2003_1 = findViewById(R.id.rb_N2003_1);
        rb_N2003_2 = findViewById(R.id.rb_N2003_2);
        rb_N2003_DK = findViewById(R.id.rb_N2003_DK);
        rb_N2003_RA = findViewById(R.id.rb_N2003_RA);
        rb_N2004_1 = findViewById(R.id.rb_N2004_1);
        rb_N2004_2 = findViewById(R.id.rb_N2004_2);
        rb_N2004_3 = findViewById(R.id.rb_N2004_3);
        rb_N2004_DK = findViewById(R.id.rb_N2004_DK);
        rb_N2004_RA = findViewById(R.id.rb_N2004_RA);
        rb_N2005u_1 = findViewById(R.id.rb_N2005u_1);
        rb_N2005u_2 = findViewById(R.id.rb_N2005u_2);
        rb_N2005u_3 = findViewById(R.id.rb_N2005u_3);
        rb_N2005u_DK = findViewById(R.id.rb_N2005u_DK);
        rb_N2005u_RA = findViewById(R.id.rb_N2005u_RA);
        rb_N2006_1 = findViewById(R.id.rb_N2006_1);
        rb_N2006_2 = findViewById(R.id.rb_N2006_2);
        rb_N2006_3 = findViewById(R.id.rb_N2006_3);
        rb_N2006_4 = findViewById(R.id.rb_N2006_4);
        rb_N2006_5 = findViewById(R.id.rb_N2006_5);
        rb_N2006_7 = findViewById(R.id.rb_N2006_7);
        rb_N2006_8 = findViewById(R.id.rb_N2006_8);
        rb_N2006_9 = findViewById(R.id.rb_N2006_9);
        rb_N2006_11 = findViewById(R.id.rb_N2006_11);
        rb_N2006_DK = findViewById(R.id.rb_N2006_DK);
        rb_N2006_RA = findViewById(R.id.rb_N2006_RA);
        rb_N2008_1 = findViewById(R.id.rb_N2008_1);
        rb_N2008_2 = findViewById(R.id.rb_N2008_2);
        rb_N2008_3 = findViewById(R.id.rb_N2008_3);
        rb_N2008_4 = findViewById(R.id.rb_N2008_4);
        rb_N2008_5 = findViewById(R.id.rb_N2008_5);
        rb_N2008_6 = findViewById(R.id.rb_N2008_6);
        rb_N2008_8 = findViewById(R.id.rb_N2008_8);
        rb_N2008_DK = findViewById(R.id.rb_N2008_DK);
        rb_N2009_1_1 = findViewById(R.id.rb_N2009_1_1);
        rb_N2009_1_2 = findViewById(R.id.rb_N2009_1_2);
        rb_N2009_1_DK = findViewById(R.id.rb_N2009_1_DK);
        rb_N2009_1_RA = findViewById(R.id.rb_N2009_1_RA);
        rb_N2009_2_1 = findViewById(R.id.rb_N2009_2_1);
        rb_N2009_2_2 = findViewById(R.id.rb_N2009_2_2);
        rb_N2009_2_DK = findViewById(R.id.rb_N2009_2_DK);
        rb_N2009_2_RA = findViewById(R.id.rb_N2009_2_RA);
        rb_N2009_3_1 = findViewById(R.id.rb_N2009_3_1);
        rb_N2009_3_2 = findViewById(R.id.rb_N2009_3_2);
        rb_N2009_3_DK = findViewById(R.id.rb_N2009_3_DK);
        rb_N2009_3_RA = findViewById(R.id.rb_N2009_3_RA);
        rb_N2009_4_1 = findViewById(R.id.rb_N2009_4_1);
        rb_N2009_4_2 = findViewById(R.id.rb_N2009_4_2);
        rb_N2009_4_DK = findViewById(R.id.rb_N2009_4_DK);
        rb_N2009_4_RA = findViewById(R.id.rb_N2009_4_RA);
        rb_N2011_1 = findViewById(R.id.rb_N2011_1);
        rb_N2011_2 = findViewById(R.id.rb_N2011_2);


        ed_N2005d = findViewById(R.id.ed_N2005d);
        ed_N2005w = findViewById(R.id.ed_N2005w);
        ed_N2005m = findViewById(R.id.ed_N2005m);
        ed_N2010 = findViewById(R.id.ed_N2010);
        ed_N2006_OT = findViewById(R.id.ed_N2006_OT);
        ed_N2008_OT = findViewById(R.id.ed_N2008_OT);
        ed_N2006_6 = findViewById(R.id.ed_N2006_6);
        ed_N2006_10 = findViewById(R.id.ed_N2006_10);

    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n2001__n2011);


        Initialization();
        //events_call();

        btn_next.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }
}