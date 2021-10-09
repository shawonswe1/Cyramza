package com.hpl.cyramza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    LinearLayout ly_RelayIva,ly_Cyramza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ly_RelayIva = findViewById(R.id.ly_RelayIva);
        ly_RelayIva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,RelayIvaActivity.class));
            }
        });

        ly_Cyramza = findViewById(R.id.ly_Cyramza);
        ly_Cyramza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,CyramzaIvaActivity.class));
            }
        });

    }
}