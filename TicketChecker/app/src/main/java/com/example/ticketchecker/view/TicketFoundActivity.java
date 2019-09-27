package com.example.ticketchecker.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ticketchecker.R;
import com.example.ticketchecker.viewModel.TicketFoundActivityViewModel;

public class TicketFoundActivity extends AppCompatActivity {
    TicketFoundActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_found);

        viewModel = new TicketFoundActivityViewModel();
    }
}
