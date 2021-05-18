package com.example.a18077431_nguyenphanhuynhduc_android_tuan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnDo;
    private Button btnDen;
    private Button btnXanh;
    private Button btnTim;
    private Button btnXong;
    private ImageView imgPhone;
    private TextView taName;
    private TextView taColor;
    private TextView taSupplier;
    private TextView taPrice;
    private String kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDo = (Button) findViewById(R.id.btnDo);
        btnDen = (Button) findViewById(R.id.btnDen);
        btnXanh = (Button) findViewById(R.id.btnXanh);
        btnTim = (Button) findViewById(R.id.btnPurple);
        imgPhone = findViewById(R.id.imgPhone);
        taName = findViewById(R.id.name);
        taColor = findViewById(R.id.color);
        taSupplier = findViewById(R.id.supplier);
        taPrice = findViewById(R.id.price);
        btnXong = findViewById(R.id.btnXong);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.#");
        ArrayList<Phone> list = new ArrayList<Phone>();
        list.add(new Phone("Điện Thoại Vsmart - Đỏ","Do",2099000,"Tiki",R.drawable.vs_red_a_2));
        list.add(new Phone("Điện Thoại Vsmart - Xanh","Xanh",299000,"Shopee",R.drawable.vsmart_live_xanh_1));
        list.add(new Phone("Điện Thoại Vsmart - Đen","Den",3099000,"Lazada",R.drawable.vsmart_black_star_1));
        list.add(new Phone("Điện Thoại Vsmart - Tím","Tim",1999000,"Sendo",R.drawable.vs_bac_1));
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Phone phone : list) {
                    if (phone.getColor() == "Do"){
                        imgPhone.setImageResource(phone.getImage());
                        taName.setText(phone.getName());
                        taColor.setText(phone.getColor());
                        taPrice.setText(decimalFormat.format(phone.getPrice()));
                        taSupplier.setText(phone.getSupplier());
                        kq = "Do";
                    }
                }
            }
        });
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Phone phone : list) {
                    if (phone.getColor() == "Den"){
                        imgPhone.setImageResource(phone.getImage());
                        taName.setText(phone.getName());
                        taColor.setText(phone.getColor());
                        taPrice.setText(decimalFormat.format(phone.getPrice()));
                        taSupplier.setText(phone.getSupplier());
                        kq = "Den";
                    }
                }
            }
        });
        btnXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Phone phone : list) {
                    if (phone.getColor() == "Xanh"){
                        imgPhone.setImageResource(phone.getImage());
                        taName.setText(phone.getName());
                        taColor.setText(phone.getColor());
                        taPrice.setText(decimalFormat.format(phone.getPrice()));
                        taSupplier.setText(phone.getSupplier());
                        kq="Xanh";
                    }
                }
            }
        });
        btnTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Phone phone : list) {
                    if (phone.getColor() == "Tim"){
                        imgPhone.setImageResource(phone.getImage());
                        taName.setText(phone.getName());
                        taColor.setText(phone.getColor());
                        taPrice.setText(decimalFormat.format(phone.getPrice()));
                        taSupplier.setText(phone.getSupplier());
                        kq = "Tim";
                    }
                }
            }
        });
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_detai__infomation.class);
                for (Phone phone : list) {
                    if (phone.getColor() == kq){
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("dulieu",phone);
                        intent.putExtras(bundle);
                    }
                }
//                setResult(Activity.RESULT_OK,intent);
                startActivity(intent);
            }
        });
    }
}