package com.example.smartkirkabbogor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smartkirkabbogor.api.ApiClient;
import com.example.smartkirkabbogor.api.ApiInterface;
import com.example.smartkirkabbogor.model.DataKir;
import com.example.smartkirkabbogor.model.GetDataKir;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CekKIRActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonCek;
    EditText etNoUji;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_kir);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);

        etNoUji = findViewById(R.id.etNoUji);
        buttonCek = findViewById(R.id.buttonCekKir);
        buttonCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noUji = etNoUji.getText().toString();
                if (noUji.equals("")) {
                    Toast.makeText(getApplicationContext(), "Harap isi no. uji", Toast.LENGTH_SHORT).show();
                } else {
                    cari(noUji);
                }

            }
        });
    }

    public void cari(String noUji) {

        Call<GetDataKir> dataKirCall = mApiInterface.getDataKir(noUji);
        dataKirCall.enqueue(new Callback<GetDataKir>() {
            @Override
            public void onResponse(Call<GetDataKir> call, Response<GetDataKir>
                    response) {
                List<DataKir> dataKirs = response.body().getDataKirs();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(dataKirs.size()));

                if (dataKirs.size() > 0) {
                    Intent intent = new Intent(CekKIRActivity.this, CekKIRHasilActivity.class);
                    intent.putExtra("data_kir",dataKirs.get(0));
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Data tiak ditemukan", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetDataKir> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });

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

    }
}
