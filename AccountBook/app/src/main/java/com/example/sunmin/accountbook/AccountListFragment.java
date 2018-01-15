package com.example.sunmin.accountbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sunmin on 2018/1/10.
 */

public class AccountListFragment extends Fragment{
    private RecyclerView mAccountRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_account_list, container, false);

        mAccountRecyclerView = (RecyclerView)view.findViewById(R.id.account_recycler_view);
        mAccountRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    private class AccountHolder extends RecyclerView.ViewHolder{
        private TextView mTailNoTextView;

        public AccountHolder(View itemView){
            super(itemView);
            mTailNoTextView = (TextView)itemView;
        }
    }
}
