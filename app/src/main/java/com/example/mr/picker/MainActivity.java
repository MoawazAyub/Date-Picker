package com.example.mr.picker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
public ScrollView SV;
public TextView tx;
public ListView aaa;
    public ListView Month1;
    public ListView Year1;
    public TextView tx2;

    String[] array = {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",""};
    String[] year = {"","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019",""};
    String[] month = {"","January","Febery","March","April","May","June","July","August","September","October","November","December",""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//----------------
        ListAdapter aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        ListAdapter amonth= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,month);
        ListAdapter ayear= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,year);
        aaa = (ListView) findViewById(R.id.Listv);
        Month1 = (ListView) findViewById(R.id.Listv2);
        Year1 = (ListView) findViewById(R.id.Listv3);

        aaa.setAdapter(aa);
        Month1.setAdapter(amonth);
        Year1.setAdapter(ayear);

      // tx = (TextView) findViewById(R.id.textView11);

    }

    public void clickone(View view)
    {
        int a = aaa.getFirstVisiblePosition();
        //tx.setText(Integer.toString(a));
        int b = Month1.getFirstVisiblePosition();
        int c = Year1.getFirstVisiblePosition();


        Context context = getApplicationContext();
        String text = "The time is"+array[a+1]+":"+month[b+1]+":"+year[c+1];
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }
}
