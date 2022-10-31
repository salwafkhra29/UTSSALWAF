package com.si5a.utssalwaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnDaftar;
    EditText etnama, etnomor_pendaftaran;
    Spinner sp_Jalur_Pendaftaran;
    CheckBox cb_Konfirmasi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = findViewById(R.id.et_nama);
        etnomor_pendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        sp_Jalur_Pendaftaran = findViewById(R.id.sp_Jalur_Pendaftaran);
        cb_Konfirmasi = findViewById(R.id.cb_Konfirmasi);

        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, jpendaftaran, npendaftaran;

                nama = etnama.getText().toString();
                jpendaftaran = sp_Jalur_Pendaftaran.getSelectedItem().toString();
                npendaftaran = etnomor_pendaftaran.getText().toString();

                if (nama.trim().equals("")){
                    etnama.setError("Nama Tidak Boleh Kosong");
                }
                else if(npendaftaran.trim().equals("")){
                    etnomor_pendaftaran.setError("Nomor Pendaftaran Tidak Boleh Kosong");
                }
                else{
                    Intent intent = new
                            Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("varNo", npendaftaran);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varJpendaftaran", jpendaftaran);
                    startActivity(intent);
                }
            }
        });

    }
}