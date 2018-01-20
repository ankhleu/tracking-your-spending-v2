package com.example.ankhleu.trackingyourspendingv2;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/20.
 */

public class account {


    String year;    //年,從日曆開始
    String month;   //月,從日曆開始
    String day;     //日,從日曆開始
 //   int Budget;     //預算,用於有活動？

    ArrayList<ArrayList<String>> pay=new ArrayList<ArrayList<String>>();  //pay為~有活動~的付錢金額
    ArrayList<ArrayList<String>> pay2=new ArrayList<ArrayList<String>>();  //pay2為~沒有~活動項目~的付錢金額

    String kind;    //類別，為輸入金額的項目分類

//    String myself;  //沒活動類別
//   String travel;  //有活動類別

    String receipt; //收據，為輸入金額，下方給商品拍照的圖檔
    String notes;   //備註，為輸入金額，下方給商品輸入註解的文字


    public account(String year,String month,String day,String kind,String receipt,String notes)
    {
        this.year=year;
        this.month=month;
        this.day=day;
        this.kind=kind;
        this.receipt=receipt;
        this.notes=notes;
    }


}
