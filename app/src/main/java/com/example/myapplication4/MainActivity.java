package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import model.RailwayTicket;
import model.RailwayTicketChild;
import model.RailwayTicketOld;

public class MainActivity extends AppCompatActivity {
    //создание объекта сущности взрослых билетов(стоимость, кол-во)
    RailwayTicket railwayTicket = new RailwayTicket(70,9);
    RailwayTicket railwayTicketChild = new RailwayTicketChild(70, 11, 50);
    RailwayTicket railwayTicketOld =  new RailwayTicketOld(70, 5, 30);

    private TextView textView;
    private TextView railwayTicketChildOut;
    private TextView railwayTicketOldOut;
    private TextView railywayTicketTotalOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketOldOut = findViewById(R.id.railwayTicketOldOut);
        railywayTicketTotalOut = findViewById(R.id.railywayTicketTotalOut);

        textView.setText(Float.toString(railwayTicket.ticketPriceAll())+"монет");
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll())+"монет");
        railwayTicketOldOut.setText(Float.toString(railwayTicketOld.ticketPriceAll())+"монет");
        railywayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll() + railwayTicketOld.ticketPriceAll())+"монет");
    }
}