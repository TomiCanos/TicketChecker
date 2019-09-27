package com.example.ticketchecker.viewModel;

import android.arch.lifecycle.ViewModel;

import com.example.ticketchecker.model.ResultListener;
import com.example.ticketchecker.model.TicketChecker;

public class QueryActivityViewModel extends ViewModel {



    public void checkForTicket(String licensePlate, String date, String time, final ResultListener<Boolean> resultListener) {
        TicketChecker ticketChecker = TicketChecker.getTicketChecker();
        Boolean result = ticketChecker.correspondTicket(licensePlate, date, time);

        resultListener.finish(result);
    }
}
