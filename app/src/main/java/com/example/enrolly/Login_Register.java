package com.example.enrolly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class Login_Register extends AppCompatActivity {
    private ViewPager pager;
    private FragmentAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_register);

        List<Fragment> list = new ArrayList<>();
        list.add(new Prijavise());
        list.add(new Registrujse());

        pager = findViewById(R.id.view_pager_login);
        adapter = new FragmentAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(adapter);
    }

    public void Dalje(View view) {
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void Register(View view) {
        Intent intent = new Intent(this, Interesi.class);
        startActivity(intent);
    }

}