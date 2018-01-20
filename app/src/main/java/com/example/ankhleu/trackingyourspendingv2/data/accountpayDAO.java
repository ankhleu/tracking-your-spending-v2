package com.example.ankhleu.trackingyourspendingv2.data;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/20.
 */

public class accountpayDAO {

    public ArrayList<account> mylist;
    Context context;
    public accountpayDAO()
    {
        mylist=new ArrayList<>();

    }

    public boolean add(account a)
    {
        mylist.add(a);
        return true;
    }

    public ArrayList<account>getList()
    {
        return mylist;
    }

    public account getaccount(int date)
    {
        for (account a:mylist)
        {
            if (a.date==date)
            {
                return a;
            }
        }
        return null;
    }



    public boolean update(account a)
    {
        for (account t:mylist)
        {
            if (t.date==a.date)
            {
                t.date=a.date;
                t.year=a.year;
                t.month=a.month;
                t.day=a.day;
                t.money1=a.money1;
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
