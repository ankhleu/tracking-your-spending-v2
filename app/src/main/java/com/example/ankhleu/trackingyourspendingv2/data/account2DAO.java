package com.example.ankhleu.trackingyourspendingv2.data;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/20.
 */

public interface account2DAO {

    public boolean add(account2 a);
    public ArrayList<account2> getList();
    public account2 getaccount(int date);
    public boolean update(account2 a);
    public boolean delete(int date);

    //此處用account2, 日常的method來寫interface

}
