package com.example.sunmin.accountbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

//public class AccountActivity extends FragmentActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//        if(fragment == null){
//            fragment = new AccountFragment();
//            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
//        }
//    }
//}

public class AccountActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new AccountFragment();
    }
}
