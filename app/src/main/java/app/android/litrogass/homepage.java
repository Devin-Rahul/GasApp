package app.android.litrogass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homepage);
    }



    public void nearby1(View view) {
        Intent intent = new Intent(homepage.this,Hospital.class);
        startActivity(intent);
    }

    public void store(View view) {
        Intent intent = new Intent(homepage.this,items.class);
        startActivity(intent);
    }

    public void call(View view) {

        String number ="1311";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));

        startActivity(intent);
    }

    }

