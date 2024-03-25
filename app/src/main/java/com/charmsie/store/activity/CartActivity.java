package com.charmsie.store.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.charmsie.store.R;
import com.charmsie.store.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {
    ActivityCartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }
}