package com.example.tee.customcontactadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.listview1);

        ArrayList<User> arrayList = new ArrayList<User>();
        for (int i=0; i<1000; i++)
        {
            arrayList.add(new User("name1"+i, "12345"+i));
        }
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,arrayList);

    }
}
