package com.example.ankhleu.trackingyourspendingv2.data;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/20.
 */

public class accountpay2DAO {

    public ArrayList<account2> mylist;
    Context context;
    public accountpay2DAO()
    {
        mylist=new ArrayList<>();

    }

    public boolean add(account2 a)
    {
        mylist.add(a);
        return true;
    }

    public ArrayList<account2>getList()
    {
        return mylist;
    }

    public account2 getaccount(int date)
    {
        for (account2 a:mylist)
        {
            if (a.date==date)
            {
                return a;
            }
        }
        return null;
    }



    public boolean update(account2 a)
    {
        for (account2 t:mylist)
        {
            if (t.date==a.date)
            {
                t.date=a.date;
                t.year=a.year;
                t.month=a.month;
                t.day=a.day;
                t.money2=a.money2;
                t.receipt=a.receipt;
                t.notes=a.notes;
                return true;
            }
        }return false;
    }

    public boolean delete(int date)
    {
        for (int i=0;i<mylist.size();i++)
        {
            if (mylist.get(i).date==date)
            {
                mylist.remove(i);
                return true;
            }
        }return false;
    }


}
