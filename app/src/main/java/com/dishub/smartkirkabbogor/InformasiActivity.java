package com.dishub.smartkirkabbogor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class InformasiActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnInformasi, btnCaraKir, btnCaraPenggunaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnInformasi = findViewById(R.id.btnInformasi);
        btnCaraKir = findViewById(R.id.carapenggunaan);
        btnCaraPenggunaan = findViewById(R.id.caraKIR);

        btnInformasi.setOnClickListener(this);
        btnCaraKir.setOnClickListener(this);
        btnCaraPenggunaan.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnInformasi) {
            Intent intent = new Intent(InformasiActivity.this, WebViewActivity.class); // BookingOnline1.class
            intent.putExtra("url", Common.urlInformasi);
            startActivity(intent);
        }
    }
}
