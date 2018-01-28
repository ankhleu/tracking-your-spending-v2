package com.example.ankhleu.trackingyourspendingv2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * Created by ankhleu on 2018/1/24.
 */

public class CalendarActivity extends Activity {

public CalendarView calendarView;
public int year;
public int month;
public int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fragment_bill);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        //日期改變的时候啟動listener
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(), "選擇的日期是 : " + year +"年"
                        + month + " 月 " + day + "日", Toast.LENGTH_LONG).show();

            }
        });
    }




}
