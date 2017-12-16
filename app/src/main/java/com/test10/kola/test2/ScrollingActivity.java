package com.test10.kola.test2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {

    ImageView imageView, imageView9,imageView10,imageView11;
    Button comment_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.imageView);
//        imageView9 = findViewById(R.id.imageView9);
//        imageView10 = findViewById(R.id.imageView10);
//        imageView11 = findViewById(R.id.imageView11);

        round_images();

        card_0();
        card_2();
        card_4();
        card_5();

        main_card();

    }

    private void main_card() {


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mainrecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Main_View_Adapter adapter = new Main_View_Adapter(this);
//        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);


    }

    private void card_0() {

        ArrayList<Integer> icons = new ArrayList<>();
        icons.add(R.mipmap.ex1);
        icons.add(R.mipmap.ex2);
        icons.add(R.mipmap.ex3);
        icons.add(R.mipmap.ex4);
        icons.add(R.mipmap.ex5);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler0);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Card0_View_Adapter adapter = new Card0_View_Adapter(this,icons);
//        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager
//                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

    }

    private void card_2() {

        ArrayList<String> button_name = new ArrayList<>();
        button_name.add("CYCLING");
        button_name.add("BADMINTON");
        button_name.add("RACING");
        button_name.add("CRICKET");
        button_name.add("GYM");
        button_name.add("FOOTBALL");


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler2);
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Card2_View_Adapter adapter = new Card2_View_Adapter(this, button_name);
        recyclerView.setAdapter(adapter);

    }

    private void card_4() {
        ArrayList<String> comment_name = new ArrayList<>();
        comment_name.add("Gender");
        comment_name.add("Age");
        comment_name.add("Location");
        comment_name.add("Nationality");
        comment_name.add("FB Page");
        comment_name.add("Web");

        ArrayList<String> comment_message = new ArrayList<>();
        comment_message.add("Male");
        comment_message.add("24");
        comment_message.add("Geneva");
        comment_message.add("Swiss");
        comment_message.add("sam_jac@facebook.com");
        comment_message.add("www.spordy.com");


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler4);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Card4_View_Adapter adapter = new Card4_View_Adapter(this, comment_name, comment_message);
//        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }

    private void card_5() {


        ArrayList<String> comment_name = new ArrayList<>();
        comment_name.add("Gabriela Becker");
        comment_name.add("James Richardson");
        comment_name.add("Steve Patrick");

        ArrayList<String> comment_message = new ArrayList<>();
        comment_message.add("Jackson is a lovely and honest trainer. If away from home too easy to loose. After the training or pay more attention");
        comment_message.add("Awesome!!! Really Nice");
        comment_message.add("Good Training");

        ArrayList<Integer> covers = new ArrayList<>();
        covers.add(R.drawable.pic_1);
        covers.add(R.drawable.pic_2);
        covers.add(R.drawable.pic_3);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler5);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Card5_View_Adapter adapter = new Card5_View_Adapter(this, comment_name, comment_message, covers);
//        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }

    private void round_images() {

        Glide.with(this).load(R.drawable.profile)
                .thumbnail(1.0f)
                .bitmapTransform(new CircleTransform(this))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);

//        Glide.with(this).load(R.drawable.pic_1)
//                .thumbnail(1.0f)
//                .bitmapTransform(new CircleTransform(this))
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(imageView9);
//
//        Glide.with(this).load(R.drawable.pic_2)
//                .thumbnail(1.0f)
//                .bitmapTransform(new CircleTransform(this))
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(imageView10);
//
//        Glide.with(this).load(R.drawable.pic_3)
//                .thumbnail(1.0f)
//                .bitmapTransform(new CircleTransform(this))
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(imageView11);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
