package com.example.ticketchecker.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ticketchecker.R;
import com.example.ticketchecker.viewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel viewModel;
    private Button buttonQueryForTickets;
    private Button buttonQueryHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setView();
    }

    private void setView() {
        buttonQueryForTickets = findViewById(R.id.buttonQueryForTickets);
        buttonQueryHistory = findViewById(R.id.buttonQueryHistory);

        buttonQueryForTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), QueryActivity.class);
                startActivity(intent);
            }
        });

        buttonQueryHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), QueryHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
