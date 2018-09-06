package utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import com.example.muhammadfarooqui.neonate.R;

import java.util.Calendar;
import java.util.Date;

public class ValidateDate {

    boolean flag_n255 = true;
    String txt_n255;
    int length = 0;

    public static boolean RangeTextBox(EditText txt, int value, int min, int max, int defaultVal, String type) {

        if (value != defaultVal) {
            if (value < min || value > max) {
                txt.setError("Range is " + min + " to " + max + " or " + defaultVal + " " + type + " ... ");    // Set Error on last radio button
                return false;
            } else {
                txt.setError(null);
                return true;
            }
        } else {
            txt.setError(null);
            return true;
        }
    }

    public boolean ValFlag() {
        return flag_n255;
    }

    public void ValDate(final EditText editText) {

        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                txt_n255 = String.valueOf(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (editText.getText().length() != 0) {

                    try {

                        switch (editText.getText().length()) {

                            case 2:

                                if (!RangeTextBox(editText, Integer.valueOf(editText.getText().toString().substring(0, 2)), 1, 30, 99, "Days")) {
                                    flag_n255 = false;
                                    return;
                                }
                                flag_n255 = true;
                                editText.setText(editText.getText().append('/'));

//                      break;
                            case 5:
                                if (flag_n255) {
                                    if (!RangeTextBox(editText, Integer.valueOf(editText.getText().toString().substring(3, 5)), 1, 12, 99, "Months")) {
                                        flag_n255 = false;
                                        return;
                                    }
                                    flag_n255 = true;
                                    editText.setText(editText.getText().append('/'));
                                }

//                      break;
                            case 10:

                                if (flag_n255) {
                                    Calendar ci = Calendar.getInstance();
                                    ci.setTime(new Date());

                                    if (!RangeTextBox(editText, Integer.valueOf(editText.getText().toString().substring(6, 10)), 1900, ci.get(Calendar.YEAR), 9999, "Year")) {
                                        flag_n255 = false;
                                        return;
                                    }

                                    if (editText.getText().toString().substring(6, 10).equals("9999")) {
                                        if (!editText.getText().toString().equals("99/99/9999")) {
                                            editText.setError("Wrong presentation!! Requires: 99/99/9999");
                                            flag_n255 = false;
                                            return;
                                        }
                                    }

                                    flag_n255 = true;
                                }

                                break;

                            default:

                                if (flag_n255) {
                                    editText.setError(null);
                                    editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                                } else {
                                    editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_cancel_black_24dp, 0);
                                }

                                break;
                        }
                    } catch (Exception e) {
                        editText.setError("Pattern: XX/XX/XXXX");
                    }

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (!flag_n255) {

                    if (editText.getError() == null) {
                        editText.setError("Requires Pattern: XX/XX/XXXX");
                    }

                    editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_cancel_black_24dp, 0);

                } else {
                    editText.setError(null);

                    editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                    String val = editText.getText().toString();

                    for (int i = 0; i < editText.getText().length(); i++) {
                        if (i == 2 && val.charAt(i) != '/') {
                            flag_n255 = false;
                            break;
                        } else if (i == 5 && val.charAt(i) != '/') {
                            flag_n255 = false;
                            break;
                        }
                    }

                    if (!flag_n255) {
                        editText.setError("Requires Pattern: XX/XX/XXXX");

                        editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_cancel_black_24dp, 0);

                    } else {
                        editText.setError(null);

                        editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }

                }

                editText.setSelection(editText.getText().length());

                length = editText.getText().length();

            }

        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    if (editText.getText().length() > 0 && editText.getText().length() < 10) {
                        flag_n255 = false;
                        editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_cancel_black_24dp, 0);
                    }
                }
            }
        });

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

                if (keyCode == KeyEvent.KEYCODE_DEL) {

                    flag_n255 = true;

                    if (editText.getText().length() != 0 && editText.getText().toString().equals(txt_n255)) {

                        switch (editText.getText().length()) {

                            case 3:
                                editText.setText(editText.getText().toString().substring(0, 1));
                                break;
                            case 6:
                                editText.setText(editText.getText().toString().substring(0, 4));
                                editText.setSelection(editText.getText().length());
                                break;

                        }

                    } else {
                        txt_n255 = editText.getText().toString();
                    }
                }
                return false;

            }
        });


    }

    public boolean TextLen() {
        return length == 10;
    }

}
