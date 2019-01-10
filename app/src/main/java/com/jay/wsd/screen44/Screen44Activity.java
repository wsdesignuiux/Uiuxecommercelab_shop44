package com.jay.wsd.screen44;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.viewpagerindicator.LinePageIndicator;

import java.util.ArrayList;

import adapter.Gateorise_Adapter;
import adapter.Product_Adapter;
import adapter.Tab_adapter1;
import model.Product_Model;

public class Screen44Activity extends AppCompatActivity {

    //Line indicater
    private ViewPager viewPager;
    private LinePageIndicator circleIndicator;
    private Tab_adapter1 tab_adapter;
    private Integer pic[] = {R.drawable.img22, R.drawable.img33, R.drawable.img44, R.drawable.img55};

    //1st recycler view
    private String amount[] = {"$ 237", "$ 482", "$ 427", "$ 369"};
    private String tv1[] = {"Scarves", "Shoes", "Jeans", "Good T-Shirt"};
    private String tv2[] = {"Bunched", "Alba", "Armani", "Radical Reaction"};

    private RecyclerView recyclerView;
    private ArrayList<Product_Model> product_models;
    private Product_Adapter product_adapter;

    //2nd recycler view

    private RecyclerView recyclerView1;
    private ArrayList<Product_Model> product_models1;
    private Gateorise_Adapter gateorise_adapter;

    private Integer pic1[] = {R.drawable.img66, R.drawable.img77, R.drawable.img44,R.drawable.img66,};
    private String amount2[] = {"$ 237", "$ 482", "$ 427","$ 525"};
    private String tv11[] = {"Scarves", "Shoes", "Jeans","Scarves"};
    private String tv22[] = {"Bunched", "Alba", "Armani", "Alba"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen44);
        //line indicator
        viewPager = (ViewPager) findViewById(R.id.vp1);
        circleIndicator = (LinePageIndicator) findViewById(R.id.circleindicator);

        tab_adapter = new Tab_adapter1(getSupportFragmentManager());
        viewPager.setAdapter(tab_adapter);
        circleIndicator.setViewPager(viewPager);
        //  tab_adapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

        //1st recycler view
        recyclerView = findViewById(R.id.product);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        product_models = new ArrayList<>();

        for (int i = 0; i < pic.length; i++) {
            Product_Model ab = new Product_Model(pic[i], amount[i], tv1[i], tv2[i]);
            product_models.add(ab);
        }
        product_adapter = new Product_Adapter(Screen44Activity.this, product_models);
        recyclerView.setAdapter(product_adapter);

        //2nd recycler view
        recyclerView1 = findViewById(R.id.gategories);
        RecyclerView.LayoutManager layoutManager1 = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        product_models = new ArrayList<>();

        for (int i = 0; i < pic.length; i++) {
            Product_Model ab = new Product_Model(pic1[i], amount2[i], tv11[i], tv22[i]);
            product_models.add(ab);
        }
        gateorise_adapter = new Gateorise_Adapter(Screen44Activity.this, product_models);
        recyclerView1.setAdapter(gateorise_adapter);
    }
}