package com.example.admin.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridview;
    ArrayAdapter<String> adapter;
String []arr={"click1","click2","click3","click4","click5","click6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview=(GridView)findViewById(R.id.grid1);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arr);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Toast.makeText(MainActivity.this,"click1",Toast.LENGTH_SHORT).show();
                }
                if(i==1)
                {
                    Toast.makeText(MainActivity.this,"click2",Toast.LENGTH_SHORT).show();
                }
                if(i==2)
                {
                    Toast.makeText(MainActivity.this,"click3",Toast.LENGTH_SHORT).show();
                }
                if(i==3)
                {
                    Toast.makeText(MainActivity.this,"click4",Toast.LENGTH_SHORT).show();

                }
                if(i==4)
                {
                    Toast.makeText(MainActivity.this,"click5",Toast.LENGTH_SHORT).show();
                }
                if(i==5)
                {
                    Toast.makeText(MainActivity.this,"click6",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
