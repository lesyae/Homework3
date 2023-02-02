package model;

public class RailwayTicketChild extends RailwayTicket{

    private float ticketDiscount; //скидка на детский билет

    public RailwayTicketChild(){
    }
    public RailwayTicketChild(float ticketPrice, int numOfTickets, float ticketDiscount){
        super(ticketPrice,numOfTickets);
        this.ticketDiscount = ticketDiscount;
    }
    //метод подсчета детских билетов
    public float ticketPriceAll(){
        return getTicketPrice() * getNumOfTickets() * (100 - ticketDiscount)/100;
    }




}

