package com.ebookfrenzy.fragmenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment, Frag1.newInstance()).commit();
        }
    }


    public void menu1(View view)
    {
        Log.d("menu1" , "er trykket");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Frag1.newInstance()).commit();
    }

    public void menu2(View view)
    {
        Log.d("menu2" , "er trykket");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Frag2.newInstance()).commit();
    }
}
