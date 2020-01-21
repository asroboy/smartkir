package com.dishub.smartkirkabbogor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void checkKir(View view) {
        Intent intent = new Intent(Menu.this, WebViewActivity.class); //CekKirActivity.class
        intent.putExtra("url", Common.urlCheckKir);
        startActivity(intent);

    }

    public void bookingOnline(View view) {
        Intent intent = new Intent(Menu.this, WebViewActivity.class); // BookingOnline1.class
        intent.putExtra("url", Common.urlBookingOnline);
        startActivity(intent);
    }

    public void keHalamanInformasi(View view) {
        Intent intent = new Intent(Menu.this, InformasiActivity.class);
        startActivity(intent);
    }
}
