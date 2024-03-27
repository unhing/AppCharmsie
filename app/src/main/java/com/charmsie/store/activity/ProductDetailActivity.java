package com.charmsie.store.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.charmsie.store.R;

public class ProductDetailActivity extends AppCompatActivity {

    ImageView imgSmall, imgMedium, imgLarge, btnPlus, btnMinus;
    TextView txtAmount;
    private String selectedSize = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        addViews();
        addEvents();
    }

    private void addEvents() {
        imgSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSizeSelection("Small");
            }
        });

        imgMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSizeSelection("Medium");
            }
        });

        imgLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSizeSelection("Large");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseAmount();
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseAmount();
            }
        });

    }

    private void handleSizeSelection(String size) {
        if (selectedSize != null && selectedSize.equals(size)) {
            // Deselect the size
            selectedSize = null;
            clearSelection();
            Toast.makeText(this, "Size deselected", Toast.LENGTH_SHORT).show();
        } else {
            selectedSize = size;
            clearSelection();
            Toast.makeText(this, "Selected Size: " + selectedSize, Toast.LENGTH_SHORT).show();
            // Apply bold style to the selected size
            if (size.equals("Small")) {
                imgSmall.setImageResource(R.drawable.ic_small_bold);
            } else if (size.equals("Medium")) {
                imgMedium.setImageResource(R.drawable.ic_medium_bold);
            } else if (size.equals("Large")) {
                imgLarge.setImageResource(R.drawable.ic_large_bold);
            }
        }
    }

    private void clearSelection() {
        imgSmall.setImageResource(R.drawable.ic_small);
        imgMedium.setImageResource(R.drawable.ic_medium);
        imgLarge.setImageResource(R.drawable.ic_large);
    }

    private void addViews() {
        imgSmall = findViewById(R.id.imgSmall);
        imgMedium = findViewById(R.id.imgMedium);
        imgLarge = findViewById(R.id.imgLarge);
        txtAmount=findViewById(R.id.txtAmount);
        btnMinus=findViewById(R.id.btnMinus);
        btnPlus=findViewById(R.id.btnPlus);
    }

    private void decreaseAmount() {
        int amount = Integer.parseInt(txtAmount.getText().toString());
        if (amount > 1) {
            amount--;
            txtAmount.setText(String.valueOf(amount));
        } else {
            // Optionally show a message that minimum amount reached
            Toast.makeText(this, "Minimum amount reached", Toast.LENGTH_SHORT).show();
        }
    }

    private void increaseAmount() {
        int amount = Integer.parseInt(txtAmount.getText().toString());
        amount++;
        txtAmount.setText(String.valueOf(amount));
    }
}