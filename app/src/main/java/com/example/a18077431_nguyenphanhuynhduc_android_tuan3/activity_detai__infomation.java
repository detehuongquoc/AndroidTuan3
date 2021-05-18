package com.example.a18077431_nguyenphanhuynhduc_android_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class activity_detai__infomation extends AppCompatActivity {
    private ImageView imgPhone;
    private TextView taName;
    private TextView taPrice;
    private TextView taPriceReduce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detai__infomation);
        imgPhone = findViewById(R.id.img_detail);
        taName = findViewById(R.id.name_detail);
        taPrice = findViewById(R.id.price_detail);
        taPriceReduce = findViewById(R.id.price_detail_reduce);
        Intent intent = getIntent();
        DecimalFormat decimalFormat = new DecimalFormat("#,###.#");
        Bundle bundle = intent.getExtras();
        Phone phone = (Phone) bundle.getSerializable("dulieu");
        taPriceReduce.setText(decimalFormat.format(phone.getPrice()));
        taPrice.setText(decimalFormat.format(phone.getPrice()));
        taName.setText(phone.getName());
        imgPhone.setImageResource(phone.getImage());
    }
}