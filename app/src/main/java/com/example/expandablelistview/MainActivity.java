package com.example.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class MainActivity extends AppCompatActivity {
ExpandableListView expandableListView;
List<String> listGroup;
HashMap<String,List<String>> listitem;
MainAdapter adapter;@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView=(ExpandableListView) findViewById(R.id.ex);
        listGroup=new ArrayList<>();
        listitem=new HashMap<>();
        adapter=new MainAdapter(this,listGroup,listitem);
        expandableListView.setAdapter(adapter); initListData(); }
    private void initListData() {
        listGroup.add(getString(R.string.app_name)); listGroup.add(getString(R.string.app_name1));
        listGroup.add(getString(R.string.app_name2)); listGroup.add(getString(R.string.app_name3));
        listGroup.add(getString(R.string.app_name4)); listGroup.add(getString(R.string.app_name5));
        listGroup.add(getString(R.string.app_name6)); listGroup.add(getString(R.string.app_name7));
        listGroup.add(getString(R.string.app_name8)); listGroup.add(getString(R.string.app_name9));
        String[] array;
        List<String> list1 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name1);
        for(String item : array){
            list1.add(item); }
        List<String> list2 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name2);
        for(String item : array){
            list2.add(item);
        }
        List<String> list3 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name3);
        for(String item : array){
            list3.add(item);
        }
        List<String> list4 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name4);
        for(String item : array){
            list4.add(item);
        }
        List<String> list5 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name5);
        for(String item : array){
            list5.add(item);
        }
        List<String> list6 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name6);
        for(String item : array){
            list6.add(item);
        }
        List<String> list7 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name7);
        for(String item : array){
            list7.add(item);
        }
        List<String> list8 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name8);
        for(String item : array){
            list8.add(item);
        }
        List<String> list9 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name9);
        for(String item : array){
            list9.add(item);
        }
        List<String> list10 =new ArrayList<>();
        array=getResources().getStringArray(R.array.app_name10);
        for(String item : array){
            list10.add(item);
        }
        listitem.put(listGroup.get(0),list1); listitem.put(listGroup.get(1),list2);
        listitem.put(listGroup.get(2),list3); listitem.put(listGroup.get(3),list4);
        listitem.put(listGroup.get(4),list5); listitem.put(listGroup.get(5),list6);
        listitem.put(listGroup.get(6),list7); listitem.put(listGroup.get(7),list8);
        listitem.put(listGroup.get(8),list9); listitem.put(listGroup.get(9),list10);
        adapter.notifyDataSetChanged();
    }
}