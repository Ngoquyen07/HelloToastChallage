package com.example.hellotoastchallage;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnToast, btnCount;
    TextView tvNumber;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnToast = findViewById(R.id.btnToast);
        btnCount = findViewById(R.id.btnCount);
        tvNumber = findViewById(R.id.tvNumber);

        btnToast.setOnClickListener(v->{
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
        });
        btnCount.setOnClickListener(v ->{
            count++;
            tvNumber.setText(String.valueOf(count));
        });

    }
}