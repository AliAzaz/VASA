package com.example.muhammadfarooqui.neonate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class N2012_N2016 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener, View.OnFocusChangeListener {

    //region Declaration

    Button btn_next;
    // LinerLayout

    LinearLayout
            ll_N2012,
            ll_N2013,
            ll_N2014,
            ll_N2015,
            ll_N2016;

    RadioButton
            rb_N2012_1,
            rb_N2012_2,
            rb_N2012_DK,
            rb_N2012_RA,
            rb_N2013_1,
            rb_N2013_2,
            rb_N2013_DK,
            rb_N2013_RA,
            rb_N2014_1,
            rb_N2014_2,
            rb_N2014_DK,
            rb_N2014_RA,
            rb_N2015_1,
            rb_N2015_2,
            rb_N2015_DK,
            rb_N2015_RA,
            rb_N2016_1,
            rb_N2016_2;

    String
            N2012,
            N2013,
            N2014,
            N2015,
            N2016;

    void Initialization() {

        btn_next = findViewById(R.id.btn_next);

        ll_N2012 = findViewById(R.id.ll_N2012);
        ll_N2013 = findViewById(R.id.ll_N2013);
        ll_N2014 = findViewById(R.id.ll_N2014);
        ll_N2015 = findViewById(R.id.ll_N2015);
        ll_N2016 = findViewById(R.id.ll_N2016);

        rb_N2012_1 = findViewById(R.id.rb_N2012_1);
        rb_N2012_2 = findViewById(R.id.rb_N2012_2);
        rb_N2012_DK = findViewById(R.id.rb_N2012_DK);
        rb_N2012_RA = findViewById(R.id.rb_N2012_RA);
        rb_N2013_1 = findViewById(R.id.rb_N2013_1);
        rb_N2013_2 = findViewById(R.id.rb_N2013_2);
        rb_N2013_DK = findViewById(R.id.rb_N2013_DK);
        rb_N2013_RA = findViewById(R.id.rb_N2013_RA);
        rb_N2014_1 = findViewById(R.id.rb_N2014_1);
        rb_N2014_2 = findViewById(R.id.rb_N2014_2);
        rb_N2014_DK = findViewById(R.id.rb_N2014_DK);
        rb_N2014_RA = findViewById(R.id.rb_N2014_RA);
        rb_N2015_1 = findViewById(R.id.rb_N2015_1);
        rb_N2015_2 = findViewById(R.id.rb_N2015_2);
        rb_N2015_DK = findViewById(R.id.rb_N2015_DK);
        rb_N2015_RA = findViewById(R.id.rb_N2015_RA);
        rb_N2016_1 = findViewById(R.id.rb_N2016_1);
        rb_N2016_2 = findViewById(R.id.rb_N2016_2);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n2012__n2016);

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
