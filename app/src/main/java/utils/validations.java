package utils;

import android.content.Context;
import android.util.Log;
import android.widget.EditText;

import java.util.HashMap;

/**
 * Created by irfansyed on 2/15/2017.
 */

public class validations {


    public static String G2 = "";
    public static String G5 = "";
    public static String F39 = "";
    public static boolean rb_husbadn_wife_d6_ok = true;

    public static String MAR_women = "";
    public static int curent_preg = 0;
    public static HashMap<String, String> Number_preg_per_women = new HashMap<>();

    public static HashMap<String, Integer> Histor_previous_preg = new HashMap<>();

    public static HashMap<String, Integer> Curent_preg_singl_child = new HashMap<>();

    public static int interivew_upto_stage = 0;

    public static boolean RangeTextBox(Context context, EditText txt, int min, int max, String type) {

        if (Integer.valueOf(txt.getText().toString().trim()) < min || Integer.valueOf(txt.getText().toString().trim()) > max) {
            txt.setError("Range is " + min + " to " + max + " " + type + " ... ");
            txt.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(txt.getId()) + ": Range is " + min + " to " + max + " times...  ");
            return false;
        } else {
            txt.setError(null);
            txt.clearFocus();
            return true;
        }
    }

    public static boolean RangeTextBox(Context context, EditText txt, int min, int max, int defaultVal, String type) {

        if (Integer.valueOf(txt.getText().toString()) != defaultVal) {
            if ((Integer.valueOf(txt.getText().toString().trim()) < min || Integer.valueOf(txt.getText().toString().trim()) > max)) {
                txt.setError("Range is " + min + " to " + max + " or " + defaultVal + " " + type + " ... ");    // Set Error on last radio button
                txt.requestFocus();
                Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(txt.getId()) + ": Range is " + min + " to " + max + " or " + defaultVal + " ...  ");
                return false;
            } else {
                txt.setError(null);
                txt.clearFocus();
                return true;
            }
        } else {
            txt.setError(null);
            txt.clearFocus();
            return true;
        }
    }

}
