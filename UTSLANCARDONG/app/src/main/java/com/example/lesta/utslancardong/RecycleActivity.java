package com.example.lesta.utslancardong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://muslimore.com//uploads/products/data/gamis-dress-wanita-zoya-enisa-dress.jpg");
        mNames.add("Harumi Dress");

        mImageUrls.add("https://modelbaju2019.info/wp-content/uploads/2018/11/321-Model-Baju-Muslim-Terbaru-Zoya-2018.jpg");
        mNames.add("Kanaka Dress");

        mImageUrls.add("https://3.bp.blogspot.com/-oBtT5IUpacY/W8GOg-tIhLI/AAAAAAAAA0Q/6LoJekZkbfoOE6sfPD1JI7H58coaR_drwCK4BGAYYCw/s600/gambar-dress-modern-muslimah.jpg");
        mNames.add("Donelia Dress");

        mImageUrls.add("http://nibinebu.com/wp-content/uploads/2015/11/zoya-muslim.jpg");
        mNames.add("Hafana Dress");

        mImageUrls.add("http://bajumuslimodern.com/wp-content/uploads/2017/02/Tampilan-Gamis-Muslim-Modern-Brand-Zoya-Paling-Cantik.png");
        mNames.add("Rizni Dress");

        mImageUrls.add("https://muslimore.com//uploads/products/data/gamis-dress-wanita-zoya-khalea-dress.jpg");
        mNames.add("Zulfah Dress");

        mImageUrls.add("https://gambarbusanamuslim.net/wp-content/uploads/2017/09/Gambar-Model-Gamis-Zoya-Terbaru.jpg");
        mNames.add("Rolla Dress");

        mImageUrls.add("https://muslimore.com//uploads/products/data/gamis-dress-wanita-zoya-qasilda-dress.jpg");
        mNames.add("Melinza Dress");

        mImageUrls.add("https://fashionmuslim.info/wp-content/uploads/2018/10/Gamis-Zoya-Model-Baru-2019.jpg");
        mNames.add("Montana Dress                                                                 7");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
