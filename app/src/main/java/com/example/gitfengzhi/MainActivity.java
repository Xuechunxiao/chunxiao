package com.example.gitfengzhi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDate();
    }

    private void initDate() {
        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("git分支");
        }
    }

    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
    }
}
