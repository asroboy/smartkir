package com.example.smartkirkabbogor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.smartkirkabbogor.model.DataKir;

public class CekKIRHasilActivity extends AppCompatActivity {

    DataKir dataKir;
    TextView textViewBerlakuSd,
            textViewNoUji,
            textViewJenis, textViewNoKendaraan, textViewNamaPemilik,
            textViewNoMesin, textViewNoRangka, textViewMerk, textViewTipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_kir1);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textViewBerlakuSd = findViewById(R.id.textViewBerlakuSd);
        textViewNoUji = findViewById(R.id.textViewNoUji);
        textViewJenis = findViewById(R.id.textViewJenis);
        textViewNoKendaraan = findViewById(R.id.textViewNoKendaraan);
        textViewNamaPemilik = findViewById(R.id.textViewNamaPemilik);
        textViewNoMesin = findViewById(R.id.textViewNoMesin);
        textViewNoRangka = findViewById(R.id.textViewNoRangka);
        textViewMerk = findViewById(R.id.textViewMerk);
        textViewTipe = findViewById(R.id.textViewTipe);

        dataKir = getIntent().getExtras().getParcelable("data_kir");
        if (dataKir != null) {
            textViewBerlakuSd.setText(dataKir.getTglSRUT_Full());
            textViewNoUji.setText(dataKir.getNoUji());
            textViewJenis.setText(dataKir.getNmJenis());
            textViewNoKendaraan.setText(dataKir.getNoKendaraan());
            textViewNamaPemilik.setText(dataKir.getNmPemilik());
            textViewNoMesin.setText(dataKir.getNoMesin());
            textViewNoRangka.setText(dataKir.getNoRangka());
            textViewMerk.setText(dataKir.getNmMerek());
            textViewTipe.setText(dataKir.getNmTipe());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
