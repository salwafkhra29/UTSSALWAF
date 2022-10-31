package com.si5a.utssalwaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvNamaS, tvNoS, tvPilihs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNamaS = findViewById(R.id.et_nama_second);
        tvNoS = findViewById(R.id.et_no_second);
        tvPilihs = findViewById(R.id.et_jalur_second);

        Intent intent = getIntent();
        tvNamaS.setText(intent.getStringExtra("varNama"));
        tvNoS.setText(intent.getStringExtra("varNo"));
        tvPilihs.setText(intent.getStringExtra("varJpendaftaran"));

    }
}