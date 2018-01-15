package com.example.sunmin.accountbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sunmin on 2018/1/10.
 */

public class AccountListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment(){
        return new AccountListFragment();
    }


}
