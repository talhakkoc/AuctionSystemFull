package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OfferHistory extends AppCompatActivity {
        Button btnCancel;
        Button button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_history);

        button15 =(Button)findViewById(R.id.button15);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OfferHistory.this,MainActivity.class));
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OfferHistory.this,User.class));
            }
        });
    }
}

