package com.example.ankhleu.trackingyourspendingv2.data;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/20.
 */

public class account {

    int date;
    String year;    //年,從日曆開始
    String month;   //月,從日曆開始
    String day;     //日,從日曆開始

 //   int Budget;     //預算,用於有活動？

    ArrayList<ArrayList<String>> pay=new ArrayList<ArrayList<String>>();  //pay為有活動的付錢金額代號


    int money1;     //有活動的金額value


    String kind;    //類別，為輸入金額的項目分類

//    String myself;  //沒活動類別
//   String travel;  //有活動類別

    String receipt; //收據，為輸入金額，下方給商品拍照的圖檔
    String notes;   //備註，為輸入金額，下方給商品輸入註解的文字


    public account(int date,int money1,String kind,String receipt,String notes)
            //此處用日期,有活動的金額value,類別,收據,備註來寫constructor
    {

        this.date=date;
       // this.year=year;
        //this.month=month;
        //this.day=day;
        this.money1=money1;

        this.kind=kind;
        this.receipt=receipt;
        this.notes=notes;

    }




}
