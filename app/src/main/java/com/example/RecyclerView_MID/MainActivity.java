
package com.example.RecyclerView_MID;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rclview;
    RecyclerView.Adapter MyAdapter;
    RecyclerView.LayoutManager layoutManager;
    public int[] Imageid;
    String arr[]={"java","C++","C#","PHP","Python"};
    int[] imageid ={R.drawable.java_logo,R.drawable.cplus_logo,R.drawable.csharp_logo
            ,R.drawable.php_logo,R.drawable.python_logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rclview=(RecyclerView)findViewById(R.id.rclview);
        rclview.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter=new MyAdapter(arr,imageid, this);
        rclview.setAdapter(MyAdapter);

        //rclview.setAdapter(new MyAdapter(imageid));
        //rclview.setAdapter(new MyAdapter(arr));

    }
}