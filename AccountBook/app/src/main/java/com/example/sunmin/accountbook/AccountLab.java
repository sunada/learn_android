package com.example.sunmin.accountbook;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sunmin on 2018/1/10.
 */

public class AccountLab {
    private static AccountLab sAccountLab;
    private List<Account> mAccounts;

    private AccountLab(Context context){
        mAccounts = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            Account a = new Account();
            a.setBank(i % 2 == 0);
            a.setOwner(i % 2 == 1 ? "老婆":"老公");
            mAccounts.add(a);
        }
    }

    public List<Account> getAccounts(){
        return mAccounts;
    }

    public Account getAccount(UUID id){
        for(Account a : mAccounts){
            if(a.getId().equals(id)) return a;
        }
        return null;
    }

    public static AccountLab get(Context context){
        if(sAccountLab == null){
            sAccountLab = new AccountLab(context);
        }
        return sAccountLab;
    }
}
