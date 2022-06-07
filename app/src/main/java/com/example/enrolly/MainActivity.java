package com.example.enrolly;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private FragmentAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        List<Fragment> list1 = new ArrayList<>();
        list1.add(new NaucnicaFragment());
        list1.add(new NaucnikFragment());

        pager = findViewById(R.id.view_pager_main);
        adapter = new FragmentAdapter(getSupportFragmentManager(), list1);

        pager.setAdapter(adapter);
    }

    public void onLogin(View view) {
        Intent intent=new Intent(this, Login_Register.class);
        startActivity(intent);
    }
}