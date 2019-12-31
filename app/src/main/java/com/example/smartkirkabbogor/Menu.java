package com.example.smartkirkabbogor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void pindah1(View view) {
        Intent intent = new Intent(Menu.this, cekKIR.class);
        startActivity(intent);

    }

    public void pindah2(View view) {
        Intent intent = new Intent(Menu.this, BookingOnline1.class);
        startActivity(intent);
    }
}
