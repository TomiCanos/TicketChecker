package com.example.ticketchecker.view;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ticketchecker.R;
import com.example.ticketchecker.model.ResultListener;
import com.example.ticketchecker.viewModel.QueryActivityViewModel;

public class QueryActivity extends AppCompatActivity {
    private QueryActivityViewModel viewModel;
    private EditText editTextLicensePlate;
    private EditText editTextDate;
    private EditText editTextTime;
    private TextView textViewResult;
    private Button buttonQuery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_query);
        viewModel = new QueryActivityViewModel();

        setView();
    }

    private void setView() {
        editTextLicensePlate = findViewById(R.id.editTextLicensePlate);
        editTextDate = findViewById(R.id.editTextDate);
        editTextTime = findViewById(R.id.editTextTime);
        textViewResult = findViewById(R.id.textViewResult);
        buttonQuery = findViewById(R.id.buttonQuery);

        buttonQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                String licensePlate = editTextLicensePlate.getText().toString();
                String date = editTextDate.getText().toString();
                String time = editTextTime.getText().toString();

                viewModel.checkForTicket(licensePlate, date, time, new ResultListener<Boolean>() {
                    @Override
                    public void finish(Boolean resultado) {
                        if (resultado) {
                            Intent intent = new Intent(v.getContext(), TicketFoundActivity.class);
                            startActivity(intent);
                        } else {
                            textViewResult.setText("No correspondió multa");
                        }
                    }
                });
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        textViewResult.setText("");
        editTextLicensePlate.setText("");
        editTextDate.setText("");
        editTextTime.setText("");
    }
}
