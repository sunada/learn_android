package com.example.sunmin.accountbook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import android.text.format.DateFormat;
import java.util.Date;

/**
 * Created by sunmin on 2018/1/5.
 */

public class AccountFragment extends Fragment {
    private Account mAccount;
    private EditText mTailNoField;
    private CheckBox mBankCheckBox;
    private RadioButton mOwnerRadioButton;
    private Button mDateButton;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mAccount = new Account();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_acount, container, false);
        mTailNoField = (EditText)v.findViewById(R.id.account_tailNo);
        mTailNoField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mDateButton = (Button)v.findViewById(R.id.account_date);
//        mDateButton.setText(mAccount.getDate().toString());
        String data = (String)DateFormat.format("YYYY年MM月dd日，kk:mm", mAccount.getDate());
        mDateButton.setText(data);
        mDateButton.setEnabled(false);

        mBankCheckBox = (CheckBox)v.findViewById(R.id.bank_id);
        mBankCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mAccount.setBank(b);
            }
        });
        return v;
    }
}
