package com.nguyenuyennhi.charmsiestore.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nguyenuyennhi.charmsiestore.R;
import com.nguyenuyennhi.charmsiestore.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {
    ActivityCartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }
}