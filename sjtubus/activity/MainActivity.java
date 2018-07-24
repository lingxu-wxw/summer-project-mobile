package com.sjtubus.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.sjtubus.R;
import com.sjtubus.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    Toolbar mToolbar;
    Button reserve_btn;
    Button record_btn;
    Button position_btn;
    Button schedule_btn;
    Button map_btn;
    Button navigate_btn;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    private List<String> images = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner banner = findViewById(R.id.banner);
        initView();
        loadImages();
        banner.setImages(images).setImageLoader(new GlideImageLoader()).start();
    }

    public void initView(){
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("");
        mToolbar.setBackgroundColor(getResources().getColor(R.color.primary_red,null));
        mToolbar.setTitleTextColor(getResources().getColor(R.color.primary_white,null));
        mToolbar.setNavigationIcon(R.drawable.person);
        reserve_btn = findViewById(R.id.reserve_btn);
        reserve_btn.setOnClickListener(this);
        record_btn = findViewById(R.id.record_btn);
        record_btn.setOnClickListener(this);
        position_btn = findViewById(R.id.position_btn);
        position_btn.setOnClickListener(this);
        schedule_btn = findViewById(R.id.schedule_btn);
        schedule_btn.setOnClickListener(this);
        map_btn = findViewById(R.id.map_btn);
        map_btn.setOnClickListener(this);
        navigate_btn = findViewById(R.id.navigate_btn);
        navigate_btn.setOnClickListener(this);
        setSupportActionBar(mToolbar);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                Snackbar.make(MainActivity.this.getWindow().getDecorView(), menuItem.getTitle() + " pressed", Snackbar.LENGTH_LONG).show();
                menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                return true;
            }
        });

    }
    public void loadImages(){
        //目前的图片是用的网上的传图网站
        images.add("http://chuantu.biz/t6/337/1530513364x-1566688664.jpg");
        images.add("http://chuantu.biz/t6/337/1530513397x-1566688664.jpg");
        images.add("http://chuantu.biz/t6/337/1530513420x-1566688664.jpg");
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.reserve_btn:
                break;
            case R.id.record_btn:
                break;
            case R.id.position_btn:
                break;
            case R.id.schedule_btn:
                break;
            case R.id.map_btn: {
                Intent intent = new Intent(MainActivity.this,MapActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.navigate_btn:{
                Intent intent = new Intent(MainActivity.this,RouteActivity.class);
                startActivity(intent);
                break;
            }
            default:
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}