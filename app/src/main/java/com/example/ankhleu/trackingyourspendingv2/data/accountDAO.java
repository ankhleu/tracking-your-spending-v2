package com.example.ankhleu.trackingyourspendingv2.data;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/20.
 */

public interface accountDAO {

    public boolean add(account a);
    public ArrayList<account> getList();
    public account getaccount(int date);
    public boolean update(account a);
    public boolean delete(int date);

    //此處用account,有活動的method來寫interface

}
