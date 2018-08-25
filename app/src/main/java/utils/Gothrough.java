package utils;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

/**
 * Created by irfansyed on 3/28/2017.
 */

public class Gothrough {


    public static boolean IamHiden(LinearLayout lv) {

        ///Yes dear should I import Adult Section Layout

        /// Checkbox Celar*************************************

        try {
            if (lv.getVisibility() != View.VISIBLE) {
                return true;
            }

            for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
                View view = lv.getChildAt(i);
                if (view instanceof CheckBox) {
                    if (((CheckBox) view).isChecked()) {
                        return true;
                    }

                    ((CheckBox) view).setError(null);
                    if (i == count - 1) {
                        ((CheckBox) view).setError("Select Atleast One");
                    }
                } else if (view instanceof RadioGroup) {
                    if (((RadioGroup) view).getCheckedRadioButtonId() != -1) {
                        return true;
                    }
                } else if (view instanceof EditText) {
                    if (((EditText) view).getText().length() > 0) {
                        return true;
                    }

                    ((EditText) view).setError(null);
                    if (i == count - 1) {
                        ((EditText) view).setError("Enter Text");
                    }
                }
            }
        } catch (Exception e) {

            // return true;
        }

        lv.requestFocus();

        return false;
    }
}
